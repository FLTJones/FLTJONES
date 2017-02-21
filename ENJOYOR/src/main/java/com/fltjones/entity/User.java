package com.fltjones.entity;

/**
 * 账户实体类
 * 
 * @author fltjones on 2017年1月5日
 *
 */
public class User {

	// 帐户id
	private int userid;

	// 帐号
	private String uname;

	// 密码
	private String upassword;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", uname=" + uname + ", upassword=" + upassword + "]";
	}

}
