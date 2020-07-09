package com.productjava.oop.product.ProductService;

import java.util.ArrayList;
import java.util.List;

import com.productjava.oop.product.models.Customer;
import com.productjava.oop.product.models.Product;

public class CustomerService {
	
	public List<Product> products;
	
	public CustomerService() {
		products = new ArrayList<>();
	}
	
	public void collectProduct(Product product ) {
		if(products != null) {
			products.add(product);
		}
		else {
			products= new ArrayList<>();
			products.add(product);
		}
	}
	
	public List<Product> getcollectProducts(){
		return products;
	}
	
	public Customer createCustomer(String name, long phone) {
		Customer customer = new Customer(name);
		if(products.size() > 0) {
			customer.setProducts(products);
		}
		return customer;
	}

}
