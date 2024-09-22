package com.springcore1.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTestApp {

	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext(
				"com/springcore1/bean/scope/beanscopeoconfig.xml");
		Student student1 = contex.getBean("student", Student.class);
		System.out.println(student1.hashCode());
		Student student2 = contex.getBean("student", Student.class);
		System.out.println(student2.hashCode());

		System.out.println();
		System.out.println("----------------------------------------------------------------------------");

		Teacher teacher1 = contex.getBean("teacher", Teacher.class);
		System.out.println(teacher1.hashCode());
		Teacher teacher2 = contex.getBean("teacher", Teacher.class);
		System.out.println(teacher2.hashCode());
	}

}
