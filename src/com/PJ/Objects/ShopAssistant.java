package com.PJ.Objects;

public class ShopAssistant {

    private int id_order;
    private int price;
    private String address;
    private int telefon_number;
    private int id_customer;
    private int id_basket;
    private String status;

    public ShopAssistant(int id_basket,int id_order, int price, String address, int telefon_number, int id_customer, String status) {
        this.id_order = id_order;
        this.price = price;
        this.address = address;
        this.telefon_number = telefon_number;
        this.id_customer = id_customer;
        this.id_basket = id_basket;
        this.status = status;
    }

    public int getId_basket() {
        return id_basket;
    }

    public void setId_basket(int id_basket) {
        this.id_basket = id_basket;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelefon_number() {
        return telefon_number;
    }

    public void setTelefon_number(int telefon_number) {
        this.telefon_number = telefon_number;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    @Override
    public String toString() {
        return "ShopAssistant{" +
                "id_order=" + id_order +
                ", price=" + price +
                ", address='" + address + '\'' +
                ", telefon_number=" + telefon_number +
                ", id_customer=" + id_customer +
                ", id_basket=" + id_basket +
                ", status=" + status +
                '}';
    }
}
