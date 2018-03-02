package com.bytestree.dao;

import com.bytestree.model.Employee;

public interface EmployeeDao extends GenericDao<Employee> {

	Integer getMaxSalary();
}
