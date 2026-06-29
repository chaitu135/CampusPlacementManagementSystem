package com.placement.model;

public class Student {
	private int studentId;
	private int userId;
	private String rollNumber;
	private String fullName;
	private String phone;
	private String branch;
	private int yearOfPassout;
	private double cgpa;

	public Student() {

	}

	public Student(int userId, String rollNumber, String fullName, String phone, String branch, int yearOfPassout,
			double cgpa) {
		setUserId(userId);
		setRollNumber(rollNumber);
		setFullName(fullName);
		setPhone(phone);
		setBranch(branch);
		setYearOfPassout(yearOfPassout);
		setCgpa(cgpa);
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getYearOfPassout() {
		return yearOfPassout;
	}

	public void setYearOfPassout(int yearOfPassout) {
		this.yearOfPassout = yearOfPassout;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", userId=" + userId + ", rollNumber=" + rollNumber + ", fullName="
				+ fullName + ", phone=" + phone + ", branch=" + branch + ", yearOfPassout=" + yearOfPassout + ", cgpa="
				+ cgpa + "]";
	}

}
