package com.unibuc.Facade;

import java.util.ArrayList;

public class DessertMenu implements Menu{

    private ArrayList<String> toppings;
    private double standardQuantity;

    public DessertMenu(ArrayList<String> toppings, double standardQuantity) {
        this.toppings = toppings;
        this.standardQuantity = standardQuantity;
    }

    @Override
    public void displayMenu() {

        System.out.println("Cheesecake");
        System.out.println("Lavacake");
        System.out.println("Ice Cream");
        System.out.println("Creme Brulee");
        System.out.println("Berry Tart");
        System.out.println("Apple Pie");
        System.out.println("Vanilla Pudding");

        System.out.println("The quantity for each dessert is: " + standardQuantity);
        System.out.println("Available toppings are: " + toString(toppings));

    }

    private StringBuilder toString(ArrayList<String> toppings) {

        StringBuilder result = new StringBuilder();
        for (String ingredient : toppings){
            result.append(" ").append(ingredient).append(" ");
        }

        return result;

    }
}
