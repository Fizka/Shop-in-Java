package com.PJ.Objects;

public class Order {

    private int id_order;
    private int price;
    private int id_customer;
    private int id_basket;
    private String status;

    public Order(int id_basket, int id_order, int price,  int id_customer, String status) {
        this.id_order = id_order;
        this.price = price;
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

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id_order=" + id_order +
                ", price=" + price +
                ", id_customer=" + id_customer +
                ", id_basket=" + id_basket +
                ", status='" + status + '\'' +
                '}';
    }
}
