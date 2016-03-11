package ua.kushnirenko.templatemethod.starbuzz.domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Tea extends Beverage {

    @Override
    public void addIngredient() {
        System.out.println("Adding tea leaves in water.");
    }

    @Override
    public void addAdditive() {
        System.out.println("Adding lemon..");
    }

    @Override
    public void addCondiments() {
        String consumerResponse = askConsumer();
        if (consumerResponse.equals("y")) {
            System.out.println("... and adding milk...");
            return;
        } else if (consumerResponse.equals("n")) {
            System.out.println("... why you don`t want milk ? ...");
            return;
        } else {
            System.out.println("... Unknown character ...");
            addCondiments();
        }
    }

    private String askConsumer() {
        System.out.println("Would you like to add a milk in your tea (y/n) ?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String response = "";
        try {
            response = br.readLine();
        } catch (IOException e) {
            System.err.println("I0 error trying to read your answer.");
        }
        return response;
    }
}
