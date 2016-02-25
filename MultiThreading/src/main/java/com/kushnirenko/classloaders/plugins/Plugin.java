package com.kushnirenko.classloaders.plugins;

import com.kushnirenko.classloaders.PluginClassLoader;

/**
 * @see PluginClassLoader
 */
@FunctionalInterface
public interface Plugin {

    void run();

}
