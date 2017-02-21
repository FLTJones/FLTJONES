package com.fltjones.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fltjones.entity.Department;

/**
 * @author fltjones on2016年12月19日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
			"classpath:spring/spring-dao.xml",
			"classpath:spring/spring-service.xml"})
public class DepartmentServiceTest {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private DepartmentService departmentService;
	
	
	@Test
	public void testGetById() throws Exception {
		int deid = 1;
		Department department = departmentService.getById(deid);
		logger.info("department={}",department);
	}

	@Test
	public void testGetDepartmentList() throws Exception {
		List<Department> list = departmentService.getDepartmentList();
		logger.info ("list={}" ,list);
	}

}
