package com.springcore1.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price for pepsi");
		this.price = price;
	}

	public Pepsi() {
		super();
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// this method is for initializing
		System.out.println("Inside init of pepsi");
	}

	@Override
	public void destroy() throws Exception {
		// this method is for destroying
		System.out.println("Inside destroy of pepsi");
	}

}
