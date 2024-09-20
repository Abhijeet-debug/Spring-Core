package com.springcore1.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		AbstractApplicationContext contex = new ClassPathXmlApplicationContext(
				"com/springcore1/lifecycle/lifecycleconfig.xml");
		Samosa s1 = (Samosa) contex.getBean("s1");
		System.out.println(s1);
		// register shutdownHook
		contex.registerShutdownHook();

		System.out.println("-------------------------------------------------------------------------------------");

		Pepsi p1 = (Pepsi) contex.getBean("p1");
		System.out.println(p1);

		Example example1 = (Example) contex.getBean("example1");
		System.out.println(example1);

	}

}
