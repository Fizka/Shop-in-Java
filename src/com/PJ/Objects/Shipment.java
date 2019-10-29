package com.PJ.Objects;

public class Shipment {

    private int id_order;
    private int id_basket;
    private int amount;
    private int id_product;

    public Shipment(int id_product, int id_order, int id_basket, int amount) {
        this.id_order = id_order;
        this.id_basket = id_basket;
        this.amount = amount;
        this.id_product = id_product;
    }

    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public int getId_product() {
        return id_basket;
    }

    public void setId_product(int id_product) {
        this.id_basket = id_product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId_basket() {
        return id_basket;
    }

    public void setId_basket(int id_basket) {
        this.id_basket = id_basket;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "id_order=" + id_order +
                ", id_basket=" + id_basket +
                ", amount=" + amount +
                ", id_product=" + id_product +
                '}';
    }
}
