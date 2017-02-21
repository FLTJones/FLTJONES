package com.fltjones.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fltjones.entity.Department;
import com.fltjones.entity.Employee;

/**
*	@author fltjones on2016年12月19日
*	配置spring和junit整合
*/

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class EmployeeDaoTest {
	
	//注入Dao实现类
		@Resource
		private EmployeeDao employeeDao;

	@Test
	public void testQueryAll() throws Exception{
		List<Employee> employees = employeeDao.queryAll(0, 10);
		for(Employee employee : employees){
			System.out.println(employee);
		}
		// Employee [eid=9, ename=小九, sex=1, eon=009, password=123456, deid=1]
		// Employee [eid=8, ename=天天, sex=1, eon=008, password=123456, deid=2]
		// Employee [eid=7, ename=王丽, sex=2, eon=007, password=123456, deid=3]
		// Employee [eid=6, ename=倩倩, sex=2, eon=006, password=123456, deid=3]
		// Employee [eid=5, ename=明明, sex=1, eon=005, password=123456, deid=1]
		// Employee [eid=4, ename=小候, sex=1, eon=004, password=123456, deid=3]
		// Employee [eid=3, ename=小钱, sex=1, eon=003, password=123456, deid=2]
		// Employee [eid=2, ename=小红, sex=2, eon=002, password=123456, deid=1]
		// Employee [eid=1, ename=小明, sex=1, eon=001, password=123456, deid=1]
	}
	
	@Test
	public void testinsertEmployee() throws Exception{
		Employee employee = new Employee();
		int insertCount = employeeDao.insertEmployee(employee);
		System.out.println("insertCount=" + insertCount );
	}
	
	@Test
	public void queryById() throws Exception{
		int eid = 5;
		Employee employee = employeeDao.queryById(eid);
		System.out.println(employee);
		// Employee [eid=5, ename=明明, sex=1, eon=005, password=123456, deid=1]
	}
	
}
