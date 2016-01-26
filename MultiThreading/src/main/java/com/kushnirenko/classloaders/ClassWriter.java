package com.kushnirenko.classloaders;

import java.util.jar.JarEntry;

public class ClassWriter {

    public static void main(String[] args) {
        JarEntry jr = new JarEntry("Multithreading/src/main/java/com/kushnirenko/loaders/plugins/PluginImpl.class");
        System.out.println(jr.getName());

    }


}
