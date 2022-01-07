package com.uni.hw3.model.vo;

public class Employee {
	
	private String empNAme;
	private String dept;
	private String job;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public Employee() {
		
	}

	public Employee(String empNAme, String dept, String job, char gender, int salary, double bonusPoint, String phone,
			String address) {
		super();
		this.empNAme = empNAme;
		this.dept = dept;
		this.job = job;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}

	public String getEmpNAme() {
		return empNAme;
	}

	public void setEmpNAme(String empNAme) {
		this.empNAme = empNAme;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String information(){
		return "Employee [사원명=" + empNAme + ", 부서=" + dept + ", 직급=" + job + ", 성별=" + gender + ", 봉급="
				+ salary + ", 보너스=" + bonusPoint + ", 연락처=" + phone + ", 주소=" + address + "]";
	}

	
	
	
	
	
	
	
}
