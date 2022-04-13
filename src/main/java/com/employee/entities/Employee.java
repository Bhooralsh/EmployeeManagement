package com.employee.entities;

public class Employee {

	private int empId;
	private String name;
	private String address;
	private String department;
	private String email;
	public Employee() {
		super();
	}
	public Employee(int empId, String name, String address, String department, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.department = department;
		this.email = email;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", department=" + department
				+ ", email=" + email + "]";
	}
	
	
	
}
