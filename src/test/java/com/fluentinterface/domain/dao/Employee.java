package com.fluentinterface.domain.dao;

public class Employee extends HumanCommon {
	private String department;
	private double salary;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
