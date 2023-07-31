package com.ConvinienceStore.storeWK2.service;

import com.ConvinienceStore.storeWK2.model.Customer;
import com.ConvinienceStore.storeWK2.model.Product;
import com.ConvinienceStore.storeWK2.model.Staff;

public interface CashierServices {
    String sellProduct (Staff staff, Customer customer, Product product);
    String printReciept(Staff staff, Customer customer, Product product, Double total);
}
