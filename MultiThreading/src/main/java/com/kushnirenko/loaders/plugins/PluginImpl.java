package com.kushnirenko.loaders.plugins;


import org.apache.log4j.Logger;

public class PluginImpl implements Plugin {

    private final static Logger log = Logger.getLogger(PluginImpl.class);

    public PluginImpl() {
        log.info("New plugin is created.");
    }

    @Override
    public void run() {
        log.info("Plugin [" + this + "] starts. ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Plugin [" + this + "] is working: " + i + " ... ;");
            try {
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                log.error("Plugin [" + this + "] has been interrupted.");
                e.printStackTrace();
            }
        }
        log.info("Plugin [" + this + "] has finished.");
    }


}
