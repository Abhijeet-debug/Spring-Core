package com.springcore1.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Student {

//	@Autowired
	private Samosa samosa;

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		System.out.println("Inside Parameterised Constructor");
		this.samosa = samosa;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void show() {
		this.samosa.display();
		System.out.println("Hii, This is Abhijeets");
	}

}
