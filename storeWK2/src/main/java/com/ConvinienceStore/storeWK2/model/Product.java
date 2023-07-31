package com.ConvinienceStore.storeWK2.model;

import java.time.LocalDate;
import java.util.Date;

public class Product {
    private String productName;
    private Double productPrice;
    private Integer productStock;
    private String productBrand;
    private String expiryDate;


    public Product(String productName, Double productPrice, Integer productStock, String productBrand, String expiryDate) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productBrand = productBrand;
        this.expiryDate = expiryDate;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productStock=" + productStock +
                ", productBrand='" + productBrand + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
