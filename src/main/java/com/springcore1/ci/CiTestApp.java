package com.springcore1.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiTestApp {

	public static void main(String[] args) {

		System.out.println("This is Constructor Injection Test Application...!");
		ApplicationContext contex = new ClassPathXmlApplicationContext(
				"com/springcore1/ci/contrucrorinjectionconfig.xml");
		Player player1 = (Player) contex.getBean("player1");
		System.out.println(player1);
		System.out.println(player1.getpAdress().getCity());

		Addition add = (Addition) contex.getBean("add");
		add.sum();
	}

}
