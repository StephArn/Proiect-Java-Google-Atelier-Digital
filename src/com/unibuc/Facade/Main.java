package com.unibuc.Facade;

//m-am inspirat din ce am facut pentru prezentarea de la ultimul curs
// DeliveryServer este clasa Facade care gestioneaza multiplele feluri de meniuri

public class Main {

    public static void main(String[] args) {

        DeliveryServer deliveryServer = new DeliveryServer();

        System.out.println("Beverages Menu:");
        System.out.println();
        deliveryServer.displayBeverageMenu();

        System.out.println();

        System.out.println("Dessert Menu:");
        System.out.println();
        deliveryServer.displayDessertMenu();

        System.out.println();

        System.out.println("Standard Menu:");
        System.out.println();
        deliveryServer.displayStandardMenu();

        System.out.println();

        System.out.println("Vegan Menu:");
        System.out.println();
        deliveryServer.displayVeganMenu();

        System.out.println();

        System.out.println("Vegetarian Menu:");
        System.out.println();
        deliveryServer.displayVegetarianMenu();


    }
}
