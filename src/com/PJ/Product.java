package com.PJ;

public class Product {

    private int id_product;
    private int price;
    private String ptroduct_name;

    public Product(int id_product, int price, String ptroduct_name) {
        this.id_product = id_product;
        this.price = price;
        this.ptroduct_name = ptroduct_name;
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

    public String getPtroduct_name() {
        return ptroduct_name;
    }

    public void setPtroduct_name(String ptroduct_name) {
        this.ptroduct_name = ptroduct_name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id_product=" + id_product +
                ", price=" + price +
                ", ptroduct_name='" + ptroduct_name + '\'' +
                '}';
    }
}
