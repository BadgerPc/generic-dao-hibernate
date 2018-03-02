package com.bytestree.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import com.bytestree.model.Employee;

@Repository
public class EmployeeDaoImpl extends AbstractGenericDao<Employee> implements EmployeeDao {

	@Override
	public Integer getMaxSalary() {
		Criteria criteria = getSession().createCriteria(Employee.class).setProjection(Projections.max("salary"));
		Integer maxSalary = (Integer) criteria.uniqueResult();
		return maxSalary;
	}

}
