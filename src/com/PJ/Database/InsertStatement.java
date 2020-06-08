package com.PJ.Database;

import com.PJ.Database.CreateStatement;
import com.PJ.Database.ShopDatabase;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStatement extends CreateStatement implements ShopDatabase {


public boolean insertCustomer(String id_basket, String user_Name, String user_Passwd, String first_Name, String last_Name, String address, String telefon_number )
{
    try{
        PreparedStatement prepStmt = conn.prepareStatement("insert into Customer values (NULL, ?, ?, ?, ?, ?, ?, ?);");
        prepStmt.setString(1,id_basket);
        prepStmt.setString(2,user_Name);
        prepStmt.setString(3,user_Passwd);
        prepStmt.setString(4,first_Name);
        prepStmt.setString(5,last_Name);
        prepStmt.setString(6,address);
        prepStmt.setString(7,telefon_number);
        prepStmt.execute();
    } catch (SQLException e)
    {
        System.err.println("Error - Values not insert into table Customer");
        e.printStackTrace();
        return false;
    }
    return true;
}

    public boolean insertOrder(String id_basket, String price, String id_customer, String status)
    {
        try{
            PreparedStatement prepStmt = conn.prepareStatement("insert into Order values (NULL, ?, ?, ?, ?);");
            prepStmt.setString(1,id_basket);
            prepStmt.setString(2,price);
            prepStmt.setString(3,id_customer);
            prepStmt.setString(4,status);
            prepStmt.execute();
        } catch (SQLException e)
        {
            System.err.println("Error - Values not insert into table Order");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean insertBasket(String id_product,String quantity )
    {
        try{
            PreparedStatement prepStmt = conn.prepareStatement("insert into Basket values (NULL, ?, ?);");
            prepStmt.setString(1,id_product);
            prepStmt.setString(2,quantity);
            prepStmt.execute();
        } catch (SQLException e)
        {
            System.err.println("Error - Values not insert into table Basket");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean insertInventory(String id_product,String amount,String category )
    {
        try{
            PreparedStatement prepStmt = conn.prepareStatement("insert into Inventory values (NULL, ?, ?, ?);");
            prepStmt.setString(1,id_product);
            prepStmt.setString(2,amount);
            prepStmt.setString(3,category);
            prepStmt.execute();
        } catch (SQLException e)
        {
            System.err.println("Error - Values not insert into table Inventory");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean insertProduct( String price, String product_name,String amount,String category )
    {
        try{
            PreparedStatement prepStmt = conn.prepareStatement("insert into Product values (NULL,  ?, ?, ?, ?);");
            prepStmt.setString(1,price);
            prepStmt.setString(2,product_name);
            prepStmt.setString(3,amount);
            prepStmt.setString(4,category);
            prepStmt.execute();
        } catch (SQLException e)
        {
            System.err.println("Error - Values not insert into table Product");
            e.printStackTrace();
            return false;
        }
        return true;
    }




}
