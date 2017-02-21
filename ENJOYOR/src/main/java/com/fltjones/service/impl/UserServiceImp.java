package com.fltjones.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fltjones.dao.UserDao;
import com.fltjones.entity.Employee;
import com.fltjones.entity.User;
import com.fltjones.service.EmployeeService;
import com.fltjones.service.UserService;

/**
 * 
 * @author fltjones on 2017年1月5日
 *
 */
@Service
public class UserServiceImp implements UserService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private UserDao userDao;

	//列表查询
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userDao.queryAll(0, 100);
	}

	//条件查询
	public User getById(int userid) {
		// TODO Auto-generated method stub
		return userDao.queryById(userid);
	}

	//添加
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	//更新
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	//删除
	public int delUser(int userid) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(userid);
	}

}
