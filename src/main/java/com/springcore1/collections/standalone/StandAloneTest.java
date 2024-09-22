package com.springcore1.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandAloneTest {

	public static void main(String[] args) {

		ApplicationContext contex = new ClassPathXmlApplicationContext(
				"com/springcore1/collections/standalone/standaloneconfig.xml");
		Person person1 = contex.getBean("person1", Person.class);
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println(person1.getFeeStructure().getClass().getName());
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println(person1.getDbProperties());
	}

}
