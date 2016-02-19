package ua.kushnirenko.decorator.starbuzz.beverage;

import ua.kushnirenko.decorator.starbuzz.beverage.additive.Mocha;
import ua.kushnirenko.decorator.starbuzz.beverage.additive.Whip;
import ua.kushnirenko.decorator.starbuzz.beverage.coffee.DarkRoast;

public class RunApp {

    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        System.out.println(darkRoast.taste() + ", cost: $" + darkRoast.cost() + ".");

        Mocha mocha = new Mocha(darkRoast);
        System.out.println(mocha.taste() + ", cost: $" + mocha.cost() + ".");

        Whip whip = new Whip(mocha);

        System.out.println(whip.taste() + ", cost: $" + whip.cost() + ".");
    }

}
