package com.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext contex = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) contex.getBean("student1");
		System.out.println(student1);

		Student student2 = (Student) contex.getBean("student2");
		System.out.println(student2);
	}
}
