package ua.kushnirenko.templatemethod.starbuzz;

import ua.kushnirenko.templatemethod.starbuzz.domain.Beverage;
import ua.kushnirenko.templatemethod.starbuzz.domain.Coffee;
import ua.kushnirenko.templatemethod.starbuzz.domain.Tea;


public class RunApp {

    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        System.out.println("\n------ Preparing tea ------");
        tea.prepareRecipe(tea);
        System.out.println("\n------ Preparing coffee ------");
        coffee.prepareRecipe(coffee);
    }
}
