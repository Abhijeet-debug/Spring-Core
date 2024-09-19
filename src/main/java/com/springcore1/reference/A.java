package com.springcore1.reference;

public class A {
	private int x;
	private B bObjecct;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public B getbObjecct() {
		return bObjecct;
	}

	public void setbObjecct(B bObjecct) {
		this.bObjecct = bObjecct;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", bObjecct=" + bObjecct + "]";
	}

}
