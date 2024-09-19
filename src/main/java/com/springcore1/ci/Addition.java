package com.springcore1.ci;

public class Addition {
	private int a;
	private int b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int , int");
	}

	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor : double , double");
	}

	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String , String");
	}

	public void sum() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println("Sum :" + (this.a + this.b));
	}

}
