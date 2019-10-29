package com.PJ.Objects;

public class Inventory {

    private int id_product;
    private int amount;
    private String category;
    private int id_inventory;

    public Inventory(int id_product, int amount, String category, int id_inventory) {
        this.id_product = id_product;
        this.amount = amount;
        this.category = category;
        this.id_inventory = id_inventory;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id_product=" + id_product +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", id_inventory=" + id_inventory +
                '}';
    }

    public int getId_inventory() {
        return id_inventory;
    }

    public void setId_inventory(int id_inventory) {
        this.id_inventory = id_inventory;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
