package com.PJ.Database;

import com.PJ.Objects.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class SelectStatement extends InsertStatement implements ShopDatabase {

    public List<Customer> selectCustomer() {
        List<Customer> list_Customer = new LinkedList<Customer>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM Customer");
            int id_customer;
            String user_Passwd, user_Name;
            while (result.next()) {
                id_customer = result.getInt("id_customer");
                user_Passwd = result.getString("user_Passwd");
                user_Name = result.getString("user_Name");

                list_Customer.add(new Customer(user_Name, user_Passwd, id_customer));
            }
        } catch (SQLException e) {
            System.out.println("Error - Select Statement did not work");
            e.printStackTrace();
            return null;
        }
        return list_Customer;
    }

    public List<ShopAssistant> selectShopAssistant() {
        List<ShopAssistant> list_ShopAssistant = new LinkedList<ShopAssistant>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM ShopAssistant");
            int id_order, price, telefon_number, id_customer, id_basket;
            String address, status;
            while (result.next()) {

                id_order = result.getInt("id_order");
                price = result.getInt("price");
                telefon_number = result.getInt("telefon_number");
                id_customer = result.getInt("id_customer");
                address = result.getString("address");
                id_basket = result.getInt("id_basket");
                status = result.getString("status");

                list_ShopAssistant.add(new ShopAssistant(id_basket,id_order, price , address, telefon_number, id_customer, status));
            }
        } catch (SQLException e) {
            System.out.println("Error - Select Statement did not work");
            e.printStackTrace();
            return null;
        }
        return list_ShopAssistant;
    }

    public List<Shipment> selectOrder() {
        List<Shipment> list_Shipment = new LinkedList<Shipment>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM OrderShip");
            int id_order, id_basket, id_product, amount;

            while (result.next()) {
                id_order = result.getInt("id_order");
                id_basket = result.getInt("id_basket");
                id_product = result.getInt("id_product");
                amount = result.getInt("amount");


                list_Shipment.add(new Shipment(id_product, id_order, id_basket, amount));
            }
        } catch (SQLException e) {
            System.out.println("Error - Select Statement did not work");
            e.printStackTrace();
            return null;
        }
        return list_Shipment;
    }

    public List<Inventory> selectInventory() {
        List<Inventory> list_Inventory = new LinkedList<Inventory>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM Inventory");
            int id_product, id_inventory, amount;
            String category;
            while (result.next()) {
                id_product = result.getInt("id_product");
                category = result.getString("category");
                id_inventory = result.getInt("id_inventory");
                amount = result.getInt("amount");

                list_Inventory.add(new Inventory(id_product, amount, category, id_inventory));
            }
        } catch (SQLException e) {
            System.out.println("Error - Select Statement did not work");
            e.printStackTrace();
            return null;
        }
        return list_Inventory;
    }


    public  List<Product> selectProduct() {
        List<Product> list_Product = new LinkedList<Product>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM Product");
            int id_product,price;
            String product_name;
            while (result.next()) {
                id_product = result.getInt("id_product");
                price = result.getInt("price");
                product_name = result.getString("product_name");

                list_Product.add(new Product(id_product, price, product_name));
            }
        } catch (SQLException e) {
            System.out.println("Error - Select Statement did not work");
            e.printStackTrace();
            return null;
        }
        return list_Product;
    }
}