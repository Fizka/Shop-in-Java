package com.PJ.Server;

import com.PJ.Database.SelectStatement;
import com.PJ.Objects.Customer;

import java.util.List;

public class UserValidator {

    static public Customer dateCustomer;

    public static SelectStatement data = new SelectStatement();
    public static List <Customer> listCustomer = data.selectCustomer();

    public static Boolean authenticate(String name, String passwd) {


        for(int i = 0; i<listCustomer.size(); i++)
        {
            System.out.println(listCustomer.get(i).getUser_Name());
            if(listCustomer.get(i).getUser_Name().equals(name) & listCustomer.get(i).getUser_Passwd().equals(passwd))
            {
                dateCustomer =  listCustomer.get(i);
                return true;
            }
        }
        return false;

    }


}
