package com.springcore1.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {

		ApplicationContext contex = new ClassPathXmlApplicationContext("com/springcore1/spel/config.xml");
		Demo d1 = contex.getBean("demo", Demo.class);
		System.out.println(d1);
		

		SpelExpressionParser spelParser = new SpelExpressionParser();
		Expression expression = spelParser.parseExpression("22+11");
		System.out.println(expression.getValue());
	}

}
