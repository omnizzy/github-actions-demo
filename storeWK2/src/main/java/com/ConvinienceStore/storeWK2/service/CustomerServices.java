package com.ConvinienceStore.storeWK2.service;

import com.ConvinienceStore.storeWK2.model.Customer;
import com.ConvinienceStore.storeWK2.model.Product;
import com.ConvinienceStore.storeWK2.model.Staff;

public interface CustomerServices {
    String buyProduct(Staff staff, Customer customer, Product product);
}
