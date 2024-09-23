package com.springcore1.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTestApp {

	public static void main(String[] args) {

		ApplicationContext contex = new AnnotationConfigApplicationContext(ConfigClass.class);
//		Student student1 = contex.getBean("student", Student.class);
//		System.out.println(student1);
//		student1.show();
//
//		Samosa samosa = contex.getBean("samosa", Samosa.class);
//		samosa.display();

//		Student student1 = contex.getBean("getStudentObj", Student.class);
//		student1.show();

		Student student1 = contex.getBean("student1", Student.class);
		student1.show();

	}

}
