package com.springcore1.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTestApp {

	public static void main(String[] args) {
		System.out.println("Hello reference users...1");

		ApplicationContext contex = new ClassPathXmlApplicationContext("com/springcore1/reference/referenceconfig.xml");
		A aref = (A) contex.getBean("aref");
		System.out.println(aref.getX());
		System.out.println(aref.getbObjecct());
		System.out.println(aref.getbObjecct().getY());

	}

}
