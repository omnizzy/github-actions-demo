package com.ConvinienceStore.storeWK2.service.implementation;

import com.ConvinienceStore.storeWK2.model.Customer;
import com.ConvinienceStore.storeWK2.model.Product;
import com.ConvinienceStore.storeWK2.model.Staff;
import com.ConvinienceStore.storeWK2.service.CashierServices;
import com.ConvinienceStore.storeWK2.service.CustomerServices;

import java.io.File;
import java.util.Scanner;

public class CashierServicesImpl implements CustomerServices, CashierServices {

    Scanner storeLog;
    public void openFile() {
        try {
            storeLog = new Scanner(new File("/Users/decagon/Downloads/storeWK2/src/main/resources/storeLog"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void CloseFile() {
        storeLog.close();
    }
    @Override
    public String buyProduct(Staff staff, Customer customer, Product product) {
        openFile();
        String store[] = new String[5];
        while (storeLog.hasNext()){
            String temp[] = storeLog.next().split(",");
            if(product.getProductName().equals(temp[0])) {
                store = temp;
            }
        }

        product.setProductName(store[0]);
        Double productPrice = Double.parseDouble(store[1]);
        product.setProductPrice(productPrice);
        Integer productStock = Integer.parseInt(store[2]);
        product.setProductStock(productStock);
        product.setProductBrand(store[3]);
        product.setExpiryDate(store[4]);

        if(customer.getQuantityOfProduct() <= productStock){
            return  sellProduct(staff, customer, product);
        }
            return product.getProductName() + "is out of stock.";
    }

    @Override
    public String sellProduct(Staff staff, Customer customer, Product product) {
        Double totalAmount = product.getProductPrice() * customer.getQuantityOfProduct();
        if (customer.getWallet() >= totalAmount){
            return printReciept(staff, customer, product, totalAmount);
        }
        return "Insufficient funds";
    }

    @Override
    public String printReciept(Staff staff, Customer customer, Product product, Double total) {

        return staff.getName() + " sold " + customer.getQuantityOfProduct() + " " +
            product.getProductBrand() + " " + product.getProductName() + " @ " +
            product.getProductPrice() + "each " + "TotalAmount " + total;
    }
}
