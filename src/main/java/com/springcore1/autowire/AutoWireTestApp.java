package com.springcore1.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireTestApp {

	public static void main(String[] args) {

		ApplicationContext contex = new ClassPathXmlApplicationContext("com/springcore1/autowire/autowireconfig.xml");
		Employee employee1 = contex.getBean("employee1", Employee.class);
		System.out.println(employee1);
	}

}
