package ua.kushnirenko.service.impl;

import org.apache.commons.codec.binary.Hex;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.kushnirenko.controller.InfoController;
import ua.kushnirenko.service.ApplicationLogic;

import java.nio.ByteBuffer;
import java.util.Timer;
import java.util.TimerTask;

@Service
public class ApplicationLogicImpl implements ApplicationLogic {

    private final Logger LOG = Logger.getLogger(ApplicationLogic.class);

    private Timer timer = new Timer();
    private TimerTask timerTask;

    private Hex hexConverter = new Hex();

    private boolean isInterrupted = false;

    @Autowired
    private InfoController infoController;

    @Override
    public void start() {
        if (infoController.getUpdatingResource() == null) {
            infoController.setUpdatingResource("application work just started.");
        }
        if (timerTask != null) {
            if (isInterrupted) {
                timer.scheduleAtFixedRate(timerTask, 5 * 1000, 5 * 1000);
            } else {
                LOG.info("Application logic is executing yet.");
            }
        } else {
            LOG.info("Start application logic executing...");

            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    if (isInterrupted) {
                        timer.cancel();
                    }
                    infoController.setUpdatingResource(convertServerTime());
                }
            };
            timer.scheduleAtFixedRate(timerTask, 5 * 1000, 5 * 1000);
        }
    }

    public void stop() {
        if (!isInterrupted && timerTask != null) {
            LOG.info("Application stopped.");
            isInterrupted = true;
        }
    }

    private String convertServerTime() {
        long serverTime = System.currentTimeMillis();
        byte[] serverTimeByteArray = ByteBuffer.allocate(Long.BYTES).putLong(serverTime).array();
        return new String(hexConverter.encode(serverTimeByteArray));
    }

}
