package com.fltjones.service;

import java.util.List;

import com.fltjones.entity.Employee;

/**
 * 
 * @author fltjones on 2016年12月23日
 *
 */
public interface EmployeeService {

	/**
	 * 查询所有员工记录
	 * 
	 * @return
	 */
	List<Employee> getEmployeeList();

	/**
	 * 查询单个员工记录
	 * 
	 * @param deid
	 * @return
	 */
	Employee getById(int eid);

	/**
	 * 修改员工信息
	 * 
	 * @param department
	 * @return
	 */
	int updateEmployee(Employee employee);

	/**
	 * 删除员工信息
	 * 
	 * @param deid
	 * @return
	 */
	int delEmployee(int eid);

	/**
	 * 增加员工
	 * 
	 * @param department
	 */
	int addEmployee(Employee employee);

}
