package com.unibuc.Facade;

import java.util.ArrayList;
import java.util.Arrays;

public class DeliveryServer {

    private BeverageMenu beverageMenu;
    private DessertMenu dessertMenu;
    private StandardMenu standardMenu;
    private VeganMenu veganMenu;
    private VegetarianMenu vegetarianMenu;

    public DeliveryServer() {
        this.beverageMenu = new BeverageMenu(250);
        this.dessertMenu = new DessertMenu(new ArrayList<String>(Arrays.asList("Chocolate", "Caramel", "Strawberries")), 150);
        this.standardMenu = new StandardMenu(2, new ArrayList<String>(Arrays.asList("Chicken", "Beef", "Pork")));
        this.veganMenu = new VeganMenu(new ArrayList<String>(Arrays.asList("Soybean", "Peanuts")));
        this.vegetarianMenu = new VegetarianMenu(new ArrayList<String>(Arrays.asList("Milk", "Cheese", "Eggs", "Yogurt")));
    }

    public void displayBeverageMenu(){
        this.beverageMenu.displayMenu();
    }

    public void displayDessertMenu(){
        this.dessertMenu.displayMenu();
    }

    public void displayStandardMenu(){
        this.standardMenu.displayMenu();
    }

    public void displayVeganMenu(){
        this.veganMenu.displayMenu();
    }

    public void displayVegetarianMenu(){
        this.vegetarianMenu.displayMenu();
    }
}
