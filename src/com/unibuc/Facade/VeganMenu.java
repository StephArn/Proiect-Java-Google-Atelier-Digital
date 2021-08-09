package com.unibuc.Facade;

import java.util.ArrayList;

public class VeganMenu implements Menu{

    private ArrayList<String> allergenList;

    public VeganMenu(ArrayList<String> allergenList) {
        this.allergenList = allergenList;
    }

    @Override
    public void displayMenu() {
        System.out.println("Sweet Potato Curry");
        System.out.println("Vegan Chilli");
        System.out.println("Vegan Burger");
        System.out.println("Broccoli Vegan Pasta");
        System.out.println("Avocado Toast");
        System.out.println("Cauliflower Tacos");
        System.out.println("Spring Salad");
        System.out.println("Vegan Pizza");
        System.out.println("Black Bean Burrito");
        System.out.println("Vegan Mushroom Risotto");

        System.out.println("List of allergens: " + toString(allergenList));
    }

    private StringBuilder toString(ArrayList<String> allergenList) {

        StringBuilder result = new StringBuilder();
        for (String ingredient : allergenList){
            result.append(" ").append(ingredient).append(" ");
        }

        return result;

    }

}
