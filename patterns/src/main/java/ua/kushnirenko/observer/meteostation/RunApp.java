package ua.kushnirenko.observer.meteostation;

import ua.kushnirenko.observer.meteostation.observs.impl.Display;
import ua.kushnirenko.observer.meteostation.subject.WeatherDataMeteoStation;

public class RunApp {

    public static void main(String[] args) {
        WeatherDataMeteoStation alaska = new WeatherDataMeteoStation("Alaska", -30, 10, 765);
        WeatherDataMeteoStation afrika = new WeatherDataMeteoStation("Afrika", +30, 0, 782);

        System.out.println(alaska);
        System.out.println(afrika);

        Display d1 = new Display(alaska);
        d1.registrate(afrika);
        System.out.println(d1);

        System.out.println(alaska);

        Display d2 = new Display();
        d2.registrate(alaska);

        Display d3 = new Display(afrika);

        alaska.setTemperature(-40);
        System.out.println(alaska);

        afrika.setWindSpeed(20);


        d1.removeRegistration(alaska);
        System.out.println(d1);
        System.out.println(alaska);
        System.out.println("*******************************");
        d2.requst(alaska);
    }

}
