package com.productjava.oop.product.models;

import com.productjava.oop.product.utilities.Category;

public class Product {

	
	public String name;
	public String brand;
	public String code;
	public String promoCode;
	public String promoAnswer;
	

	public double price;
	public double discount;
	public int quantity;
	public String description;
	public String postion;
	public double weight;
	public double pricePerQuantity;
	
	public String getPromoAnswer() {
		return promoAnswer;
	}
	public void setPromoAnswer(String promoAnswer) {
		this.promoAnswer = promoAnswer;
	}
	
	public String getPromoCode() {
		return promoCode;
	}
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
	
	public double getPricePerQuantity() {
		return pricePerQuantity;
	}
	public void setPricePerQuantity(double pricePerQuantity) {
		this.pricePerQuantity = pricePerQuantity;
	}

	private Category category;
	
	
	public Category getCategory() {
		return category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPostion() {
		return postion;
	}
	public void setPostion(String postion) {
		this.postion = postion;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	public String toString() {
		return "Name: " + this.name + 
				", Code: " + this.code +
				", Price: " + this.price +  
				", Quantity: " + this.quantity + 
				", TotalPrice " + this.pricePerQuantity;
	}
	
}
