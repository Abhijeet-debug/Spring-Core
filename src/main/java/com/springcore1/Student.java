package com.springcore1;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddres;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("Setting studentId");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setting studentName");
		this.studentName = studentName;
	}

	public String getStudentAddres() {
		return studentAddres;
	}

	public void setStudentAddres(String studentAddres) {
		System.out.println("Setting studentAddres");
		this.studentAddres = studentAddres;
	}

	public Student(int studentId, String studentName, String studentAddres) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddres = studentAddres;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddres=" + studentAddres
				+ "]";
	}

}
