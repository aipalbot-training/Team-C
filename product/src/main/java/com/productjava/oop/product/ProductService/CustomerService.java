package com.productjava.oop.product.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.productjava.oop.product.models.CartItems;
import com.productjava.oop.product.models.Customer;
import com.productjava.oop.product.models.Product;
import com.productjava.oop.product.utilities.Gender;

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
	
	public List<Product> getcollecttedProducts(){
		return products;
	}
	
	public Customer createCustomer(String name, String phone, String gender) {
		Customer customer = new Customer(name);
		
		Gender sex = Gender.valueOf(gender);
		
		customer.setGender(sex);
		if(products.size() > 0) {
			customer.setProducts(products);
		}
		return customer;
	}
	
	public void calculateTotalPrice(Customer customer) {
		calculatePriceRange(customer);
		
	
	}
	
	private void calculatePriceRange(Customer customer) {
		double cartTotalPrice = 0;
		int cartQuantity = 0;
		double discount = 0.3;
		double tax = 0.1;
		String promo = "FREE";	
			for(Product p: customer.getProducts()){
				if(p.getPromoAnswer().equalsIgnoreCase("yes")) {
				
				if(p.getPromoCode().equalsIgnoreCase(promo)){
				p.setDiscount(discount);
				double pricePerQuantity = p.getQuantity()*p.getPrice();
				p.setPricePerQuantity(pricePerQuantity);
				
				}
		
			else {
				System.out.println("Invalid Code");
					double pricePerQuantity = p.getQuantity()*p.getPrice();
					p.setPricePerQuantity(pricePerQuantity);
					}
				}
			else {
					double pricePerQuantity = p.getQuantity()*p.getPrice();
					p.setPricePerQuantity(pricePerQuantity);
				}
				cartQuantity += p.getQuantity();
				cartTotalPrice += p.getPricePerQuantity()*(1 + tax);
			}
			

		CartItems items = new CartItems();
		items.setTotalQuantity(cartQuantity);
		items.setTotalPrice(cartTotalPrice);
		customer.setCartItems(items);
			
		}
		
	}

