package com.unibuc.Facade;

import java.util.ArrayList;

public class VegetarianMenu implements Menu{
    private ArrayList<String> nonVeganIngredients;

    public VegetarianMenu(ArrayList<String> nonVeganIngredients) {
        this.nonVeganIngredients = nonVeganIngredients;
    }

    @Override
    public void displayMenu() {

        System.out.println("Cheese Omelette with Tomatoes");
        System.out.println("Grilled Feta Cheese with Olives");
        System.out.println("Spring Salad");
        System.out.println("Potato Salad");
        System.out.println("Mushroom Skewers with Yogurt Dressing");
        System.out.println("Vegetarian Burger");
        System.out.println("Margherita Pizza");

        System.out.println("Non-Vegan Ingredients found on the menu: " + toString(nonVeganIngredients));
    }

    private StringBuilder toString(ArrayList<String> nonVeganIngredients) {

        StringBuilder result = new StringBuilder();
        for (String ingredient : nonVeganIngredients){
            result.append(" ").append(ingredient).append(" ");
        }

        return result;

    }
}
