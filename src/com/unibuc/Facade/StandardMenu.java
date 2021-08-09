package com.unibuc.Facade;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class StandardMenu implements Menu{

    private int spicinessIndex;
    private ArrayList<String> meatOptions;

    public StandardMenu(int spicinessIndex, ArrayList<String> meatOptions) {
        this.spicinessIndex = spicinessIndex;
        this.meatOptions = meatOptions;
    }

    @Override
    public void displayMenu() {
        System.out.println("Burger with Fries");
        System.out.println("Mac 'n' Cheese");
        System.out.println("Caesar Salad");
        System.out.println("Greek Salad");
        System.out.println("Pepperoni Pizza");
        System.out.println("Margherita Pizza");
        System.out.println("Lasagna");
        System.out.println("Carbonara Pasta");
        System.out.println("Grilled Meat with Mashed Potatoes");
        System.out.println("Steak with Steamed Vegetables");
        System.out.println("Fish and Chips");
        System.out.println("Fried Rice");

        System.out.println("Available meat options are: " + toString(meatOptions));
        System.out.println("Food spiciness index (out of 10) is: " + spicinessIndex);

    }

    private StringBuilder toString(ArrayList<String> meatOptions) {

        StringBuilder result = new StringBuilder();
        for (String ingredient : meatOptions){
            result.append(" ").append(ingredient).append(" ");
        }

        return result;

    }
}
