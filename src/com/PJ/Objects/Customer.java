package com.PJ.Objects;

public class Customer {

    private String user_Name;
    private String user_Passwd;
    private int id_customer, telefon_number,id_basket;
    private String firstName;
    private String  lastName, address;

    public Customer(String user_Name, String user_Passwd, int id_customer, int telefon_number, String firstName, String lastName, String address, int id_basket) {
        this.user_Name = user_Name;
        this.user_Passwd = user_Passwd;
        this.id_customer = id_customer;
        this.telefon_number = telefon_number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id_basket = id_basket;
    }

    public int getId_basket() {
        return id_basket;
    }

    public void setId_basket(int id_basket) {
        this.id_basket = id_basket;
    }

    public int getTelefon_number() {
        return telefon_number;
    }

    public void setTelefon_number(int telefon_number) {
        this.telefon_number = telefon_number;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNameString() {
        return lastName;
    }

    public void setLastNameString(String lastNameString) {
        this.lastName = lastNameString;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "user_Name='" + user_Name + '\'' +
                ", user_Passwd='" + user_Passwd + '\'' +
                ", id_customer=" + id_customer +
                ", telefon_number=" + telefon_number +
                ", id_basket=" + id_basket +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
