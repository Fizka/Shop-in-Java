package com.PJ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatement implements ShopDatabase {

    Connection conn;
    Statement stat;

    public CreateStatement(){

        try{
            Class.forName(ShopDatabase.DRIVER);
        } catch (ClassNotFoundException e){
            System.err.println("\"Error - no JDBC driver\"");
            e.printStackTrace();
        }

        try{
            conn = DriverManager.getConnection(DB_URL);
            stat = conn.createStatement();
        } catch(SQLException e)
        {
            System.err.println("Error - no connection to the database");
            e.printStackTrace();
        }

    }

    public boolean createTables(){

        String createCustomer = "CREATE TABLE IF NOT EXISTS `Customer` ( " +
                "user_Name TEXT"
                + "user_Passwd TEXT"
                + "id_customer INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL"
                + "FOREIGN KEY(`id_customer`) REFERENCES `ShopAssistant` (`id_customer`)"
                + "ON DELETE CASCADE ON UPDATE NO ACTION"
                + " )";


        String createShopAssistant = "CREATE TABLE IF NOT EXISTS `ShopAssistant` ( " +
                "id_order INTEGER"
                + "price INTEGER"
                + "address TEXT"
                + "telefon_number INTEGER"
                + "id_customer INTEGER"
                + "id_basket INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL"
                + "FOREIGN KEY(`id_basket`) REFERENCES `Order` (`id_basket`)"
                + "ON DELETE CASCADE ON UPDATE NO ACTION"
                + " )";

        String createOrder = "CREATE TABLE IF NOT EXISTS `Order` ( " +
                "id_order INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL"
                + "id_basket INTEGER"
                + "id_product INTEGER"
                + "amount INTEGER"
                + " )";


        String createInventory = "CREATE TABLE IF NOT EXISTS `Inventory` ( " +
                 "id_product INTEGER"
                + "amount INTEGER"
                + "category TEXT"
                + "id_inventory INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL"
                + "FOREIGN KEY(`id_inventory`) REFERENCES `Product` (`id_inventory`)"
                + "ON DELETE CASCADE ON UPDATE NO ACTION"
                + " )";


        String createProduct = "CREATE TABLE IF NOT EXISTS `Product` ( " +
                "id_product INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL"
                + "price INTEGER"
                + "product_name TEXT"
                + "FOREIGN KEY(`id_product`) REFERENCES `Inventory` (`id_product`)"
                + "ON DELETE CASCADE ON UPDATE NO ACTION"
                + " )";

        try{
            stat.execute(createCustomer);
            stat.execute(createInventory);
            stat.execute(createOrder);
            stat.execute(createProduct);
            stat.execute(createShopAssistant);
        } catch (SQLException e)
        {
            System.err.println("Error - table not created ");
            e.printStackTrace();
            return false;
        }

        return true;

    }

    public void closeConnection(){
        try{
            conn.close();
        } catch (SQLException e)
        {
            System.err.println("Error - connection to the database is still open");
            e.printStackTrace();
        }
    }

}
