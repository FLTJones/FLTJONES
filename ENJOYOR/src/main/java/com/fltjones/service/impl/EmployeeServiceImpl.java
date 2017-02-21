package com.fltjones.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fltjones.dao.EmployeeDao;
import com.fltjones.entity.Employee;
import com.fltjones.service.EmployeeService;

/**
 * @author fltjones on 2016年12月20日
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private EmployeeDao employeeDao;

	public List<Employee> getEmployeeList() {

		return employeeDao.queryAll(0, 100);
	}

	public Employee getById(int eid) {
		// TODO Auto-generated method stub
		return employeeDao.queryById(eid);
	}

	public int updateEmployee(Employee employee) {

		return employeeDao.updateEmployee(employee);
	}

	public int delEmployee(int eid) {
		return employeeDao.deleteEmployee(eid);
	}

	public int addEmployee(Employee employee) {
		return employeeDao.insertEmployee(employee);
	}

}
