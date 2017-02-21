package com.fltjones.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fltjones.entity.User;

/**
 * User DAO层
 * 
 * @author fltjones on 2017年1月5日
 *
 */
public interface UserDao {

	/**
	 * 条件查询
	 * @param userid
	 * @return
	 */
	User queryById(int userid);
	
	/**
	 * 列表查询
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
	/**
	 * 删除
	 * @param userid
	 * @return
	 */
	int deleteUser(int userid);
	
	/**
	 * 增加
	 * @param user
	 * @return
	 */
	int addUser(User user);
	
	/**
	 * 修改
	 * @param user
	 * @return
	 */
	int updateUser(User user);
	
}
