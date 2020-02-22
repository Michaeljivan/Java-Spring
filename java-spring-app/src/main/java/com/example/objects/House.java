package com.example.objects;

public class House {
	private int squareft;
	private double price;
	private String state;
	
	public House(int squareft, double price, String state) {
		super();
		this.squareft = squareft;
		this.price = price;
		this.state = state;
	}

	public int getSquareft() {
		return squareft;
	}

	public void setSquareft(int squareft) {
		this.squareft = squareft;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
