package com.PJ.Objects;

public class Product {

    private int id_product;
    private int price, amount;
    private String product_name;
    private String category;

    public Product(int id_product, int price, int amount, String product_name, String category) {
        this.id_product = id_product;
        this.price = price;
        this.amount = amount;
        this.product_name = product_name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id_product=" + id_product +
                ", price=" + price +
                ", amount=" + amount +
                ", product_name='" + product_name + '\'' +
                ", category='" + category + '\'' +
                '}';
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

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

}
