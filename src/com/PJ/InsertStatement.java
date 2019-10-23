package com.PJ;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStatement extends  CreateStatement implements ShopDatabase {


public boolean insertCustomer(String user_Name, String user_Passwd, int id_customer )
{
    try{
        PreparedStatement prepStmt = conn.prepareStatement();
        prepStmt.setString(1,);
        prepStmt.setString(1,);
        prepStmt.setString(1,);
        prepStmt.execute();
    } catch (SQLException e)
    {
        System.err.println("Error - Values not insert into table Competition");
        e.printStackTrace();
        return false;
    }
    return true;
}

    public boolean insertShopAssistant(int id_order, int price, String address, int telefon_number, int id_customer, int  id_basket)
    {
        try{
            PreparedStatement prepStmt = conn.prepareStatement();
            prepStmt.setString(1,);
            prepStmt.setString(1,);
            prepStmt.setString(1,);
            prepStmt.setString(1,);
            prepStmt.setString(1,);
            prepStmt.setString(1,);
            prepStmt.execute();
        } catch (SQLException e)
        {
            System.err.println("Error - Values not insert into table Competition");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean insertOrder(int id_order,int id_basket,int id_product,int amount )
    {
        try{
            PreparedStatement prepStmt = conn.prepareStatement();
            prepStmt.setString(1,);
            prepStmt.setString(1,);
            prepStmt.setString(1,);
            prepStmt.setString(1,);
            prepStmt.execute();
        } catch (SQLException e)
        {
            System.err.println("Error - Values not insert into table Competition");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean insertInventory(int id_product,int amount,String category, int id_inventory )
    {
        try{
            PreparedStatement prepStmt = conn.prepareStatement();
            prepStmt.setString(1,);
            prepStmt.setString(1,);
            prepStmt.setString(1,);
            prepStmt.setString(1,);

            prepStmt.execute();
        } catch (SQLException e)
        {
            System.err.println("Error - Values not insert into table Competition");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean insertProduct(int id_product, int price, String product_name, )
    {
        try{
            PreparedStatement prepStmt = conn.prepareStatement();
            prepStmt.setString(1,);
            prepStmt.execute();
        } catch (SQLException e)
        {
            System.err.println("Error - Values not insert into table Competition");
            e.printStackTrace();
            return false;
        }
        return true;
    }


}
