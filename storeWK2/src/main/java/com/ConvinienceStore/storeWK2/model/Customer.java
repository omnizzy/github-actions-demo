package com.ConvinienceStore.storeWK2.model;

import com.ConvinienceStore.storeWK2.Enums.Sex;

public class Customer extends BaseClass {
    private Double wallet;

    private Integer quantityOfProduct;

    public Customer(String name, Sex sex, Double wallet, Integer quantityOfProduct) {
        super(name, sex);
        this.wallet = wallet;
        this.quantityOfProduct = quantityOfProduct;
    }

    public Double getWallet() {
        return wallet;
    }

    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }

    public Integer getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(Integer quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "wallet=" + wallet +
                ", quantityOfProduct=" + quantityOfProduct +
                '}';
    }
}

