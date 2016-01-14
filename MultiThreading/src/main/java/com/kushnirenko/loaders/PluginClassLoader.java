package com.kushnirenko.loaders;


import org.apache.log4j.Logger;
import sun.misc.VM;

import java.io.*;
import java.nio.ByteBuffer;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * <b>Requirements for custom ClassLoader:</>
 * - загрузчик должен явно или неявно расширять класс java.lang.ClassLoader;
 * - загрузчик должен поддерживать модель делегирования загрузки, образуя иерархию.
 * Если этого не сделать, могут возникнуть проблемы с областью видимости;
 * - в классе java.lang.ClassLoader уже реализован метод непосредственной загрузки - defineClass(), который байт-код
 * преобразует в java.lang.Class, осуществляя его валидацию;
 * - механизм рекурсивного поиска также реализован в классе java.lang.ClassLoader и заботиться об это не нужно;
 * - для корректной реализации загрузчика достаточно лишь переопределить метод loadClass() класса java.lang.ClassLoader.
 * <p/>
 * Этот загрузчик будет загружать jar-файлы не через java.net.URLClassLoader, а «вручную».
 * Так будет нагляднее рассмотреть весь процесс. А грузить мы будем плагины, которые будут располагаться
 * в папке plugins/ и для которых нужно описать интерфейс:
 * <p/>
 * <p/>
 * package com.kushnirenko.loaders.plugins;
 * <p/>
 * public interface Plugin {
 * public void run();
 * }
 */

public class PluginClassLoader extends ClassLoader {

    // The "default" domain. Set as the default ProtectionDomain on newly
    // created classes.
    private final ProtectionDomain defaultDomain =
            new ProtectionDomain(new CodeSource(null, (Certificate[]) null),
                    null, this, null);


    private final static Logger log = Logger.getLogger(PluginClassLoader.class);

    /**
     * This is a cache of loaded classes by this ClassLoader.
     */
    private Map<String, Class<?>> classCache = new HashMap<>();

    /**
     * This is a link to parent ClassLoader to delegate loading process.
     */
    private ClassLoader parent;

    /**
     * Here we initialize relation between our ClassLoader and parent ClassLoader
     */
    public PluginClassLoader(ClassLoader parent) {
        this.parent = parent;
        log.info("New ClassLoader was created.");
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        Class requestedClass = classCache.get(name);
        if (requestedClass == null) {
            requestedClass = parent.loadClass(name);
        }
        return requestedClass;
    }

    /**
     * This method gets byte code of class.
     *
     * @param jarFile  - file *.class may contains more than one defined classes.
     * @param jarEntry - is one of enumeration of defined classes in *.class file.
     */
    private byte[] loadClassData(JarFile jarFile, JarEntry jarEntry) throws IOException {
        long size = jarEntry.getSize();
        if (size <= 0) {
            log.warn("The length of byte code of class = 0. Plugin class is not defined. Return null.");
            return null;
        } else if (size > Integer.MAX_VALUE) {
            log.warn("plugin class size is too large.");
            throw new IOException("Plugin cannot load class.");
        }
        byte[] buffer = new byte[(int) size];
        InputStream is = jarFile.getInputStream(jarEntry);
        is.read(buffer);
        return buffer;
    }

    public void loadPlugin(String pluginFileName) throws IOException {
        /**
         * The JarFile class is used to read the contents of a jar file from any file that can be opened with java.io.RandomAccessFile.
         * It extends the class java.util.zip.ZipFile with support for reading an optional Manifest entry.
         * The Manifest can be used to specify meta-information about the jar file and its entries.
         * Unless otherwise noted, passing a null argument to a constructor or method in this class will
         *  cause a NullPointerException to be thrown.
         *  @see java.util.jar.JarFile
         *  @see java.util.zip.ZipFile
         */
        JarFile jarFile = null;

        try {
            jarFile = new JarFile("MultiThreading/plugins/" + pluginFileName);
        } catch (IOException exp) {
            log.error("Cannot find plugin with name: " + pluginFileName + ".");
            log.error(exp.getStackTrace());
            return;
        }
        /**
         * @see JarEntry
         */

        Enumeration<JarEntry> jarEntries = jarFile.entries();
        while (jarEntries.hasMoreElements()) {
            JarEntry jarEntry = jarEntries.nextElement();
            if (jarEntry.isDirectory()) {
                continue;
            }
            if (jarEntry.getName().endsWith(".class")) {
                byte[] classData = loadClassData(jarFile, jarEntry);
                Class<?> clazz = defineClass(
                        jarEntry.getName().replace('/', '.').substring(0, jarEntry.getName().length() - 6),
                        classData, 0, classData.length, null);
                classCache.put(clazz.getName(), clazz);
            }
        }
    }

    /**
     * This method used to loading plugin classes *.jar from directory: plugins/
     *
     * @throws IOException
     */
    public void loadPlugins() throws IOException {
        /**
         * Getting a list of plugins.
         */
        String[] jarlist = new File("MultiThreading/plugins/").list(new FilenameFilter() {
            @Override
            public boolean accept(File file, String name) {
                return name.toLowerCase().endsWith(".jar");
            }
        });
        /**
         * Load each plugin:
         */
        for (String jarFile : jarlist) {
            loadPlugin(jarFile);
        }
    }

}
