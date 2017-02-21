package com.fltjones.service;

import java.util.List;

import com.fltjones.entity.Department;

/**
 * 在“使用者”角度设计接口 三方面：方法定义粒度，参数，返回类型（return 类型/异常）
 * 
 * @author fltjones on2016年12月19日
 */
public interface DepartmentService {

	/**
	 * 查询所有部门记录
	 * 
	 * @return
	 */
	List<Department> getDepartmentList();

	/**
	 * 查询单个部门记录
	 * 
	 * @param deid
	 * @return
	 */
	Department getById(int deid);

	/**
	 * 修改部门信息
	 * 
	 * @param department
	 * @return
	 */
	int updateDepartment(Department department);

	/**
	 * 删除部门信息
	 * 
	 * @param deid
	 * @return
	 */
	int delDepartment(int deid);

	/**
	 * 增加部门
	 * 
	 * @param department
	 */
	int addDepartment(Department department);
}
