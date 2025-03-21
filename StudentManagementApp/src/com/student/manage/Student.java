package com.student.manage;

public class Student {

	private int studentId;
	private String studentName;
	private String studentPhone;
	private String stidentCity;
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStidentCity() {
		return stidentCity;
	}

	public void setStidentCity(String stidentCity) {
		this.stidentCity = stidentCity;
	}
	
	
	public Student(int studentId, String studentName, String studentPhone, String stidentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.stidentCity = stidentCity;
	}

	public Student(String studentName, String studentPhone, String stidentCity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.stidentCity = stidentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", stidentCity=" + stidentCity + "]";
	}

	
	
}
