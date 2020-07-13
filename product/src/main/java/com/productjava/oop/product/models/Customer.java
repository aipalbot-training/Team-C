package com.productjava.oop.product.models;

import java.util.List;

import com.productjava.oop.product.utilities.Gender;

public class Customer {
	private String name;
	private Gender gender;
	public int age;
	public String address;
	public String phone;
	public String email;
	public List<Product> products;
	
	public List<Product> getProducts() {
		return products;
	}



	public void setProducts(List<Product> products) {
		this.products = products;
	}

	private CartItems cartItems; 
	
	public CartItems getCartItems() {
		return cartItems;
	}



	public void setCartItems(CartItems cartItems) {
		this.cartItems = cartItems;
	}



	public Customer(String name) {
		this.name = name;
	}

	
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}


}
