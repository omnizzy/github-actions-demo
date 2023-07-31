package com.ConvinienceStore.storeWK2;

import com.ConvinienceStore.storeWK2.Enums.Qualification;
import com.ConvinienceStore.storeWK2.Enums.Roles;
import com.ConvinienceStore.storeWK2.Enums.Sex;
import com.ConvinienceStore.storeWK2.model.Applicant;
import com.ConvinienceStore.storeWK2.model.Customer;
import com.ConvinienceStore.storeWK2.model.Product;
import com.ConvinienceStore.storeWK2.model.Staff;
import com.ConvinienceStore.storeWK2.service.ManagerServices;
import com.ConvinienceStore.storeWK2.service.implementation.CashierServicesImpl;
import com.ConvinienceStore.storeWK2.service.implementation.ManagerServicesImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreWk2Application {

	public static void main(String[] args) {
		SpringApplication.run(StoreWk2Application.class, args);

		Applicant applicant = new Applicant("Mark", Sex.Male, "361839", Qualification.Ssce, 25);
		Staff staff = new Staff("John", Sex.Male, "187", Roles.Manager);
		Staff staff1 = new Staff("Jessica", Sex.Female, "209", Roles.Cashier);
		Product product = new Product("milk");
		Customer customer = new Customer("Daniel", Sex.Male, 3500.00, 2);

		CashierServicesImpl cashier = new CashierServicesImpl();
		ManagerServicesImpl manager = new ManagerServicesImpl();

		cashier.buyProduct(staff, customer, product);
		System.out.println(cashier.buyProduct(staff, customer, product));

		manager.hireApplicant(staff, applicant);
		System.out.println(manager.hireApplicant(staff, applicant));


	}

}
