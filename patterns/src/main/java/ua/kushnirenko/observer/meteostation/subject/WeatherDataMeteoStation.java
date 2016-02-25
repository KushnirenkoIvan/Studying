package ua.kushnirenko.observer.meteostation.subject;


import ua.kushnirenko.observer.meteostation.dto.MeteoDataDTO;
import ua.kushnirenko.observer.meteostation.observs.Observer;
import ua.kushnirenko.observer.meteostation.subject.impl.Subject;

import java.util.HashSet;
import java.util.Iterator;

public class WeatherDataMeteoStation implements Subject {

    private String name;

    private HashSet<Observer> observers = new HashSet<>();

    private Integer temperature;

    private Integer windSpeed;

    private Integer pressure;

    private boolean changed = false;

    public HashSet<Observer> getObservers() {
        return observers;
    }

    public void setObservers(HashSet<Observer> observers) {
        this.observers = observers;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
        changed = true;
        notifyObservres();
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
        changed = true;
        notifyObservres();
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
        changed = true;
        notifyObservres();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChanged() {
        return changed;
    }

    public void setChanged(boolean changed) {
        this.changed = changed;
    }

    public WeatherDataMeteoStation() {

    }

    public WeatherDataMeteoStation(String name, Integer temperature, Integer windSpeed, Integer pressure) {
        this.name = name;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
    }

    @Override
    public boolean regiseterObserver(Observer obs) {
        if (obs != null) {
            return observers.add(obs);
        }
        return false;
    }

    @Override
    public boolean removeObserver(Observer obs) {
        return observers.remove(obs);
    }

    @Override
    public void notifyObservres() {
        if (changed) {
            Iterator iter = observers.iterator();
            while (iter.hasNext()) {
                ((Observer) iter.next()).update(new MeteoDataDTO(temperature, windSpeed, pressure), this);
            }
        }
        changed = false;
    }

    @Override
    public void getData(Observer o) {
        o.update(new MeteoDataDTO(temperature, windSpeed, pressure), this);
    }

    @Override
    public String toString() {
        return "WeatherDataMeteoStation{" +
                "name='" + name +
                ", temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                ", count of listeners: " + this.getObservers().size() +
                ", pressure=" + pressure + '\'' +
                '}';
    }
}
