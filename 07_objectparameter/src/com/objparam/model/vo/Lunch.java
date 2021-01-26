package com.objparam.model.vo;

public class Lunch {
	
	private String category;
	private String name;
	private int price;
	private int capacity;
	
	public Lunch() {}
	
	public Lunch(String category, String name, int price, int capacity) {
		this.category = category;
		this.name = name;
		this.price = price;
		this.capacity = capacity;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getCapacity() {
		return capacity;
	}
}
