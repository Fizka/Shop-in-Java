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
            int id_customer, id_basket, telefon_number;
            String user_Passwd, user_Name, first_Name,last_Name, address ;
            while (result.next()) {
                id_customer = result.getInt("id_customer");
                id_basket = result.getInt("id_basket");
                user_Name = result.getString("user_Name");
                user_Passwd = result.getString("user_Passwd");
                first_Name = result.getString("first_Name");
                last_Name = result.getString("last_Name");
                address = result.getString("address");
                telefon_number = result.getInt("telefon_number");

                list_Customer.add(new Customer( user_Name,user_Passwd, id_customer,
                        telefon_number, first_Name,last_Name, address, id_basket ));
            }
        } catch (SQLException e) {
            System.out.println("Error - Select Statement did not work");
            e.printStackTrace();
            return null;
        }
        return list_Customer;
    }

    public List<Order> selectOrder() {
        List<Order> list_Order = new LinkedList<Order>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM Order");
            int id_order, price, id_customer, id_basket;
            String  status;
            while (result.next()) {

                id_order = result.getInt("id_order");
                id_basket = result.getInt("id_basket");
                price = result.getInt("price");
                id_customer = result.getInt("id_customer");
                status = result.getString("status");

                list_Order.add(new Order(id_basket, id_order, price , id_customer, status));
            }
        } catch (SQLException e) {
            System.out.println("Error - Select Statement did not work");
            e.printStackTrace();
            return null;
        }
        return list_Order;
    }

    public List<Basket> selectBusket() {
        List<Basket> list_Basket = new LinkedList<Basket>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM OrderShip");
            int id_product, id_basket, quantity;

            while (result.next()) {
                id_basket = result.getInt("id_basket");
                id_product = result.getInt("id_product");
                quantity = result.getInt("quantity");



                list_Basket.add(new Basket(id_product, id_basket, quantity));
            }
        } catch (SQLException e) {
            System.out.println("Error - Select Statement did not work");
            e.printStackTrace();
            return null;
        }
        return list_Basket;
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
            int id_product,price, amount;
            String product_name, category;
            while (result.next()) {
                id_product = result.getInt("id_product");
                price = result.getInt("price");
                product_name = result.getString("product_name");
                amount = result.getInt("amount");
                category = result.getString("category");


                list_Product.add(new Product(id_product, price,amount, product_name, category));
            }
        } catch (SQLException e) {
            System.out.println("Error - Select Statement did not work");
            e.printStackTrace();
            return null;
        }
        return list_Product;
    }
}