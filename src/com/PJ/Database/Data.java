package com.PJ.Database;

import com.PJ.Objects.*;

import java.awt.*;
import java.util.List;

public class Data extends SelectStatement{

    public Data(){

        addDate();
        print();

    }

    public static void main(String [] args){

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Data();
            }
        });
    }

    void addDate(){

        SelectStatement sc = new SelectStatement();
/*
        sc.insertCustomer("Admin","haslo", "Admin","God");
        sc.insertCustomer("Ada","haslo1","Ada","Goro");
        sc.insertCustomer("Pawel","haslo2","Pawel","Typon");
        sc.insertCustomer("Robert","haslo3","Robert","Kiwi");
        sc.insertCustomer("Kasia","haslo4","Kasia","Warkon");
        sc.insertCustomer("Asia","haslo5","Asia","Zygon");
        sc.insertCustomer("Dorota","haslo6","Dorota","Lolo");
        sc.insertCustomer("Magda","haslo7","Magda","Fame");

        sc.insertProduct("20", "Szampon Malinowy");
        sc.insertProduct("14.50", "Szampon Kiwi");
        sc.insertProduct("13.77", "Szampon Jagoda");
        sc.insertProduct("45", "Szampon Balonowy");
        sc.insertProduct("78", "Szampon Truskawkowy");
        sc.insertProduct("136", "Szampon Czarna Porzeczka");
        sc.insertProduct("890", "Płyn do kapieli - Pianka");
        sc.insertProduct("45", "Balsam Malinowy");
        sc.insertProduct("23", "Balsam Jagodowy");
        sc.insertProduct("67", "Balsam Kiwi");
        sc.insertProduct("12", "Balsam Balonowy");
        sc.insertProduct("34", "Balsam miodowy");
        sc.insertProduct("89", "Maskara");
        sc.insertProduct("26", "Puder");
        sc.insertProduct("35", "Puder");


        sc.insertInventory("1", "42", "Kosmetyki do ciala");
        sc.insertInventory("2", "21", "Kosmetyki do ciala");
        sc.insertInventory("3", "11", "Kosmetyki do ciala");
        sc.insertInventory("4", "30", "Kosmetyki do ciala");
        sc.insertInventory("5", "34", "Kosmetyki do ciala");
        sc.insertInventory("6", "78", "Kosmetyki do ciala");
        sc.insertInventory("7", "44", "Kosmetyki do ciala");
        sc.insertInventory("8", "97", "Kosmetyki do ciala");
        sc.insertInventory("9", "23", "Kosmetyki do ciala");
        sc.insertInventory("10", "46", "Kosmetyki do ciala");
        sc.insertInventory("11", "58", "Kosmetyki do ciala");
        sc.insertInventory("12", "23", "Kosmetyki do ciala");
        sc.insertInventory("13", "99", "Makijaz");
        sc.insertInventory("14", "22", "Makijaz");
        sc.insertInventory("15", "48", "Makijaz");

        sc.insertOrder("","","","", "1","zakonczone");
        sc.insertOrder("","","","", "1","zakonczone");
        sc.insertOrder("","","","", "2","zakonczone");
        sc.insertOrder("","","","", "2","zakonczone");
        sc.insertOrder("","","","", "3","zakonczone");
        sc.insertOrder("","","","", "4","zakonczone");
        sc.insertOrder("","","","", "5","w realizacji");
        sc.insertOrder("","","","", "6","w realizacji");

//kiedy przyjmujemy zamkowienie
        sc.insertOrder("1", "1", "1");
        sc.insertOrder("2", "2", "1");
        sc.insertOrder("3", "3", "4");
        sc.insertOrder("4", "4", "3");
        sc.insertOrder("5", "7", "2");
        sc.insertOrder("6", "1", "1");
        sc.insertOrder("7", "9", "1");
        sc.insertOrder("8", "12", "1");
        sc.insertOrder("6", "5", "1");
        sc.insertOrder("6", "6", "1");
        sc.insertOrder("7", "8", "1");
        sc.insertOrder("1", "2", "1");
        sc.insertOrder("1", "1", "1");
*/


    }

    void print(){

        List<Customer> customerList = selectCustomer();
        List<Product> productList = selectProduct();
        List<Inventory> inventoryList = selectInventory();
        List<Basket> orderList = selectBusket();
        List<Order> basketList = selectOrder();

        System.out.println("Customer list: ");
        for(Customer c: customerList)
            System.out.println(c);

        System.out.println("Product list: ");
        for(Product c: productList)
            System.out.println(c);

        System.out.println("Inventory list: ");
        for(Inventory c: inventoryList)
            System.out.println(c);

        System.out.println("Basket list: ");
        for(Basket c: orderList)
            System.out.println(c);

        System.out.println("Order list: ");
        for(Order c: basketList)
            System.out.println(c);

        closeConnection();
    }
}
