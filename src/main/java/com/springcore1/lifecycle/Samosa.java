package com.springcore1.lifecycle;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price for Samosa : ");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	// we can also change the name of init method and destroy method but signature
	// should be the same.
	public void init() {
		System.out.println("Calling init method of Samosa");
	}

	public void destroy() {
		System.out.println("Calling destroy method of Samosa");
	}

}
