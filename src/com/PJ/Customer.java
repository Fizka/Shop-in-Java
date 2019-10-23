package com.PJ;

public class Customer {

    private String user_Name;
    private String user_Passwd;
    private int id_customer;

    public Customer(String user_Name, String user_Passwd, int id_customer) {
        this.user_Name = user_Name;
        this.user_Passwd = user_Passwd;
        this.id_customer = id_customer;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_Passwd() {
        return user_Passwd;
    }

    public void setUser_Passwd(String user_Passwd) {
        this.user_Passwd = user_Passwd;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }
}
