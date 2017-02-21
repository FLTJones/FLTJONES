package com.fltjones.service;

import java.util.List;

import com.fltjones.entity.User;

/**
 * 在“使用者”角度设计接口 三方面：方法定义粒度，参数，返回类型（return 类型/异常）
 * 
 * @author fltjones on 2017年1月5日
 *
 */
public interface UserService {

	/**
	 * 列表查询
	 * 
	 * @return
	 */
	List<User> getUserList();

	/**
	 * 条件查询
	 * 
	 * @param userid
	 * @return
	 */
	User getById(int userid);

	/**
	 * 增加
	 * 
	 * @param user
	 * @return
	 */
	int addUser(User user);

	/**
	 * 更新
	 * 
	 * @param user
	 * @return
	 */
	int updateUser(User user);

	/**
	 * 删除
	 * 
	 * @param userid
	 * @return
	 */
	int delUser(int userid);

}
