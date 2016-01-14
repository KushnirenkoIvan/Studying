package com.kushnirenko.loaders.plugins;

import com.kushnirenko.loaders.PluginClassLoader;

/**
 * @see PluginClassLoader
 */
@FunctionalInterface
public interface Plugin {

    void run();

}
