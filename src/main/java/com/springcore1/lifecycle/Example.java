package com.springcore1.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		System.out.println("Setting Subject for Example");
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Calling init for Example");
	}

	@PreDestroy
	public void end() {
		System.out.println("Calling destroy for Example");
	}
}
