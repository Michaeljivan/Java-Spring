package com.example.objects;

public class Car {
	private String Model;
	private int year;
	private double price;
	
	public Car(String model, int year, double price) {
		super();
		Model = model;
		this.year = year;
		this.price = price;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}