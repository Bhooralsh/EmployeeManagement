package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.employee.entities.Employee;

@Service
public class EmployeeService {

	public static List<Employee> list = new ArrayList<>();

	static {
		list.add(new Employee(1, "asad", "makhdoom bilawal society", "computer science", "bhooralsh27@gmail.com"));
		list.add(new Employee(2, "abeer", "system limited", "IIB", "abeer@gmail.com"));
		list.add(new Employee(3, "arslan", "duabi limited", "T", "arslanr@gmail.com"));
		list.add(new Employee(4, "shahbaz", "karachi pakistan", "IT", "shahbaz@gmail.com"));


	}

	public List<Employee> getAllEmployee() {

		return list;
	}

	public Employee getEmployeeById(int id) {
		Employee employee = null;
		try {
			employee = list.stream().filter(e -> e.getEmpId() == id).findFirst().get();
		} catch (Exception e) {
			e.printStackTrace();

		}

		return employee;

	}

	public Employee addEmployee(Employee e) {
		list.add(e);
		return e;
	}

	public void deleteEmployee(int empId) {
		list = list.stream().filter(employee -> employee.getEmpId() != empId).collect(Collectors.toList());
	}

	public void updateEmployee(Employee employee, int empId) {
		list.stream().map(b -> {

			if (b.getEmpId() == empId) {
				b.setName(employee.getName());
				b.setAddress(employee.getAddress());
				b.setDepartment(employee.getAddress());
				b.setEmail(employee.getEmail());
			}
			return b;
		}).collect(Collectors.toList());
	}
	
	

}
