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

        sc.insertCustomer("1","Admin","haslo", "Jan","Kowlaski", "Warszawa", "987454564");
        sc.insertCustomer("2","Ada","haslo1","Ada","Goro", "Warszawa", "987454564");
        sc.insertCustomer("3","Pawel","haslo2","Pawel","Typon", "Warszawa", "987454564");
        sc.insertCustomer("4","Robert","haslo3","Robert","Kiwi", "Warszawa", "987454564");
        sc.insertCustomer("5","Kasia","haslo4","Kasia","Warkon", "Warszawa", "987454564");

        sc.insertProduct("20", "Szampon Malinowy","1", "Kosmetyki");
        sc.insertProduct("14.50", "Szampon Kiwi","1", "Kosmetyki");
        sc.insertProduct("13.77", "Szampon Jagoda","1", "Kosmetyki");
        sc.insertProduct("45", "Szampon Balonowy","1", "Kosmetyki");
        sc.insertProduct("78", "Szampon Truskawkowy","1", "Kosmetyki");
        sc.insertProduct("136", "Szampon Czarna Porzeczka","1", "Kosmetyki");
        sc.insertProduct("890", "Płyn do kapieli - Pianka","1", "Kosmetyki");
        sc.insertProduct("45", "Balsam Malinowy","1", "Kosmetyki");
        sc.insertProduct("23", "Balsam Jagodowy","1", "Kosmetyki");
        sc.insertProduct("67", "Balsam Kiwi","1", "Kosmetyki");
        sc.insertProduct("12", "Balsam Balonowy","1", "Kosmetyki");
        sc.insertProduct("34", "Balsam miodowy","1", "Kosmetyki");
        sc.insertProduct("89", "Maskara","1", "Kosmetyki");
        sc.insertProduct("26", "Puder","1", "Kosmetyki");
        sc.insertProduct("35", "Puder","1", "Kosmetyki");


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


        closeConnection();
    }
}
