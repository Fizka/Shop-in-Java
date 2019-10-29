package com.PJ.Database;

import com.PJ.Database.CreateStatement;
import com.PJ.Database.ShopDatabase;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStatement extends CreateStatement implements ShopDatabase {


public boolean insertCustomer(String user_Name, String user_Passwd )
{
    try{
        PreparedStatement prepStmt = conn.prepareStatement("insert into Customer values (NULL, ?, ?);");
        prepStmt.setString(1,user_Name);
        prepStmt.setString(2,user_Passwd);
        prepStmt.execute();
    } catch (SQLException e)
    {
        System.err.println("Error - Values not insert into table Customer");
        e.printStackTrace();
        return false;
    }
    return true;
}

    public boolean insertShopAssistant(String id_order, String price, String address, String telefon_number, String id_customer, String status)
    {
        try{
            PreparedStatement prepStmt = conn.prepareStatement("insert into ShopAssistant values (NULL, ?, ?, ?, ?, ?, ?);");
            prepStmt.setString(1,id_order);
            prepStmt.setString(2,price);
            prepStmt.setString(3,address);
            prepStmt.setString(4,telefon_number);
            prepStmt.setString(5,id_customer);
            prepStmt.setString(6,status);
            prepStmt.execute();
        } catch (SQLException e)
        {
            System.err.println("Error - Values not insert into table ShopAssistant");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean insertOrder(String id_basket,String id_product,String amount )
    {
        try{
            PreparedStatement prepStmt = conn.prepareStatement("insert into OrderShip values (NULL, ?, ?, ?);");
            prepStmt.setString(1,id_basket);
            prepStmt.setString(2,id_product);
            prepStmt.setString(3,amount);
            prepStmt.execute();
        } catch (SQLException e)
        {
            System.err.println("Error - Values not insert into table Order");
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

    public boolean insertProduct( String price, String product_name )
    {
        try{
            PreparedStatement prepStmt = conn.prepareStatement("insert into Product values (NULL,  ?, ?);");
            prepStmt.setString(1,price);
            prepStmt.setString(2,product_name);
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
