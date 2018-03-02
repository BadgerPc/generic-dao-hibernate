package com.bytestree;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bytestree.model.Employee;
import com.bytestree.service.EmployeeService;

@Component
public class MyApplication {

	final static Logger logger = Logger.getLogger(MyApplication.class);

	@Autowired
	private EmployeeService employeeService;
	
	public void performDbTasks()
	{
		// Get all employees
		List<Employee> employeeList = employeeService.getAllEmployees();
		printEmployees(employeeList);
		
		Employee empNew = new Employee("Bytes", "Tree", "Senior Developer", 2000);

		// Save new employee
		employeeService.addNewEmployee(empNew);

		// Get all employees - to check added employee
		employeeList = employeeService.getAllEmployees();
		printEmployees(employeeList);

		Integer maxSalary = employeeService.getMaxSalary();
		logger.debug("Maximum salary given to employee is: " + maxSalary);

	}

	private void printEmployees(List<Employee> emplist) {
		if (emplist != null) {
			logger.debug("Found total " + emplist.size() + " records.");
			for (Employee employee : emplist) {
				logger.debug(employee.toString());
			}
		}
	}
}
