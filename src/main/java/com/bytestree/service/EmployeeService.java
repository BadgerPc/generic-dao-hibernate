package com.bytestree.service;

import java.util.List;

import com.bytestree.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	void addNewEmployee(Employee employee);

	Integer getMaxSalary();
}
