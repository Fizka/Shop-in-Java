package com.PJ.Database;

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
            conn = DriverManager.getConnection(ShopDatabase.DB_URL);
            stat = conn.createStatement();
        } catch(SQLException e)
        {
            System.err.println("Error - no connection to the database");
            e.printStackTrace();
        }

        createTables();

    }

    public boolean createTables(){

        String createProduct = "CREATE TABLE IF NOT EXISTS `Product` ( " +
                "`id_product` INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "`price` INT,"
                + "`product_name` varchar(255)"
                + " )";

        String createCustomer = "CREATE TABLE IF NOT EXISTS `Customer` ( "
                + "`id_customer` INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "`user_Name` varchar(255),"
                + "`user_Passwd` varchar(255),"
                + "`first_Name` varchar(255),"
                + "`last_Name` varchar(255)"
                + " )";

        String createShopAssistant = "CREATE TABLE IF NOT EXISTS `ShopAssistant` ( "
                + "`id_basket` INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "`id_order` INT, "
                + "`price` INT,"
                + "`address` varchar(255),"
                + "`telefon_number` INT,"
                + "`id_customer` INT,"
                + "`status` varchar(255)"
                + " )";

        String createOrder = "CREATE TABLE IF NOT EXISTS `OrderShip` ( " +
                "`id_order` INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "`id_basket` INT,"
                + "`id_product` INT,"
                + "`amount` INT"
                + " )";


        String createInventory = "CREATE TABLE IF NOT EXISTS `Inventory` ( "
                + "`id_inventory` INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "`id_product` INT,"
                + "`amount` INT,"
                + "`category` varchar(255)"
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
