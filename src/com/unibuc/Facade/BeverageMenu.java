package com.unibuc.Facade;

public class BeverageMenu implements Menu{
    private double standardQuantity;

    public BeverageMenu(double standardQuantity) {
        this.standardQuantity = standardQuantity;
    }

    @Override
    public void displayMenu() {

        System.out.println("Water");
        System.out.println("Lemonade");
        System.out.println("Coke");
        System.out.println("Sprite");
        System.out.println("Coffee");
        System.out.println("Tea");
        System.out.println("Wine");
        System.out.println("Beer");
        System.out.println("Whiskey");
        System.out.println("Hugo");
        System.out.println("Cosmopolitan");

        System.out.println("The quantity for each drink is: " + standardQuantity);

    }

}
