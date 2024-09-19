package com.springcore1.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EnployeeTestApp {

	public static void main(String[] args) {
		System.out.println("Hello Spring Learners...");

		ApplicationContext contex = new ClassPathXmlApplicationContext(
				"com/springcore1/collections/collectionconfig.xml");
		Employee employee1 = (Employee) contex.getBean("employee1");
		System.out.println(employee1.getName());
		System.out.println(employee1.getPhones());
		System.out.println(employee1.getAddresses());
		System.out.println(employee1.getCourses());
	}

}
