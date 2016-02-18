package ua.kushnirenko.observer.meteostation.observs.impl;

import ua.kushnirenko.observer.meteostation.dto.MeteoDataDTO;
import ua.kushnirenko.observer.meteostation.observs.Observer;
import ua.kushnirenko.observer.meteostation.subject.impl.Subject;

import java.util.HashSet;
import java.util.Random;

public class Display implements Observer {

    private HashSet<Subject> meteoStations = new HashSet<>();
    private Integer id;
    boolean registered = false;
    private Random randomGenerator = new Random();


    public Integer getId() {
        return id;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean isRegisterd) {
        this.registered = isRegisterd;
    }

    public Display() {
        System.out.println("Created new display...");
        id = randomGenerator.nextInt();
    }

    public Display(Subject subject) {
        this();
        if (subject != null) {
            registrate(subject);
            System.out.println(registered ? " - registered on: \n" + subject
                    : " - cannot register on: \n" + subject);
        }
    }

    @Override
    public void update(MeteoDataDTO meteoDataDTO, Subject subject) {
        System.out.println("Observer " + id + " has new data: \n" + meteoDataDTO + ", from meteo station :\n"
                + subject + "\n***###***");
    }

    public boolean registrate(Subject subject) {
        registered = subject.regiseterObserver(this) && meteoStations.add(subject);
        return registered;
    }

    public boolean removeRegistration(Subject subject) {
        registered = meteoStations.remove(subject) && subject.removeObserver(this);
        return !registered;
    }

    public void requst(Subject subject) {
        subject.getData(this);
    }

    @Override
    public String toString() {
        return "Display{" +
                "id=" + id +
                ", count of listen meteo stations=" + meteoStations.size() +
                ", registered=" + registered +
                '}';
    }
}
