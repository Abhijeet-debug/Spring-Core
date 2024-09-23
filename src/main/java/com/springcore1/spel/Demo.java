package com.springcore1.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{ 11+22 }")
	private int x;

	@Value("#{ 3+4+56+45} ")
	private int y;

	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private double z;

	@Value("#{ T(java.lang.Math).E }")
	private double E;

	@Value("#{ T(java.lang.Math).PI }")
	private double PI;

	@Value("#{ new java.lang.String('Abhijeet Kumar') }")
	private String name;

	@Value("#{ 8>5 }")
	private boolean check;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return E;
	}

	public void setE(double e) {
		E = e;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", E=" + E + ", PI=" + PI + ", name=" + name + ", check="
				+ check + "]";
	}

}
