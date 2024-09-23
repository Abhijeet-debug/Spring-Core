package com.springcore1.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore1.javaconfig")
public class ConfigClass {

//	@Bean
//	public Samosa getSamosaObj() {
//		return new Samosa();
//	}
	@Autowired
	Samosa samosa;

//	@Bean
	@Bean(name = { "student1", "temp", "student2" })
	public Student getStudentObj() {
//		return new Student(getSamosaObj());
		return new Student(samosa);
	}

}
