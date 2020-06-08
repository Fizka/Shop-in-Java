package com.PJ.Objects;

public class Basket {

//order czyli cos juz kupione!
    private int id_basket;
    private int amount;
    private int id_product;

    public Basket(int id_product, int id_basket, int amount) {
        this.id_basket = id_basket;
        this.amount = amount;
        this.id_product = id_product;
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
        return "Basket{" +
                ", id_basket=" + id_basket +
                ", amount=" + amount +
                ", id_product=" + id_product +
                '}';
    }
}
