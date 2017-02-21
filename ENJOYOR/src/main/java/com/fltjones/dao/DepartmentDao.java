package com.fltjones.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fltjones.entity.Department;

/**
 * Department DAO层
 * 
 * @author fltjones on 2016-12-15
 */
public interface DepartmentDao {

	/**
	 * 根据id查询部门
	 * 
	 * @param deid
	 * @return
	 */
	Department queryById(int deid);

	/**
	 * 增加部门
	 * 
	 * @param department
	 * @return
	 */
	int addDepartment(Department department);

	/**
	 * 修改部门信息
	 * 
	 * @param department
	 * @return
	 */
	int updateDepartment(Department department);

	/**
	 * 删除部门
	 * 
	 * @param deid
	 * @return
	 */
	int deleteDepartment(int deid);

	/**
	 * 全部查询
	 * 
	 * @param offet
	 * @param limit
	 * @return
	 */
	List<Department> queryAll(@Param("offset") int offset, @Param("limit") int limit);

}
