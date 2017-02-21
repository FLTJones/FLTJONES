package com.fltjones.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fltjones.entity.Employee;

/**
 * Employee DAO层
 * 
 * @author fltjones on2016年12月15日
 */
public interface EmployeeDao {

	/**
	 * 创建员工信息
	 * 
	 * @param employee
	 * @return
	 */
	int insertEmployee(Employee employee);

	/**
	 * 根据id查询Employee并连接部门
	 * 
	 * @param deid
	 * @return
	 */
	Employee queryById(int eid);

	/**
	 * 全部查询
	 * 
	 * @param offet
	 * @param limit
	 * @return
	 */
	List<Employee> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * 删除员工
	 * 
	 * @param deid
	 * @return
	 */
	int deleteEmployee(int eid);

	/**
	 * 修改员工信息
	 * 
	 * @param department
	 * @return
	 */
	int updateEmployee(Employee employee);

}
