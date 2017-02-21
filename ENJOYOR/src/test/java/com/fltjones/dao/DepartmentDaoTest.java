package com.fltjones.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fltjones.entity.Department;

/**
*	@author fltjones on2016年12月15日
*配置spring和junit整合
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class DepartmentDaoTest {

	//注入Dao实现类
	@Resource
	private DepartmentDao departmentDao;
	
	@Test
	public void testQueryById() throws Exception{
		int deid = 1;
		Department department = departmentDao.queryById(deid);
		System.out.println("测试1");
		System.out.println(department.getDename());
		System.out.println(department);
		System.out.println("测试2");
		// 测试1
		// 工程部 Department [deid=1, dename=工程部, demstate=1]
		// 测试2
	}
	
		@Test
	public void testQueryAll() throws Exception{
		List<Department> departments = departmentDao.queryAll(0, 10);
		for(Department department : departments){
			System.out.println(department);
		}
		// Department [deid=3, dename=财务部, demstate=1]
		// Department [deid=2, dename=设计部, demstate=1]
		// Department [deid=1, dename=工程部, demstate=1]
	}
		
	@Test
	public void testInsertDepartment() throws Exception{
		
	}
	
}
