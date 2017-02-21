package com.fltjones.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fltjones.dao.DepartmentDao;
import com.fltjones.dao.EmployeeDao;
import com.fltjones.entity.Department;
import com.fltjones.exception.DepartmentException;
import com.fltjones.service.DepartmentService;

/**
 * @author fltjones on2016年12月19日 使用注解控制事务方法的优点： 1.开发团队达成一致约定，明确标注事务方法的编程风格
 *         2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
 *         3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private DepartmentDao departmentDao;

	private DepartmentService departmentService;

	// 列表查询
	public List<Department> getDepartmentList() {
		return departmentDao.queryAll(0, 100);
	}

	// 条件查询
	public Department getById(int deid) {
		return departmentDao.queryById(deid);
	}

	// 修改信息
	public int updateDepartment(Department department) {
		return departmentDao.updateDepartment(department);
	}

	// 删除信息
	public int delDepartment(int deid) {
		return departmentDao.deleteDepartment(deid);
	}

	// 增加信息
	public int addDepartment(Department department) {
		return departmentDao.addDepartment(department);
	}

}
