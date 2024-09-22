package com.springcore1.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTestApp {

	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("com/springcore1/stereotype/stereoconfig.xml");
//		Student student = contex.getBean("student", Student.class);
		Student student1 = contex.getBean("student1", Student.class);
		System.out.println(student1);
		System.out.println(student1.getAddresses());
		System.out.println(student1.getAddresses().getClass().getName());
	}

}
