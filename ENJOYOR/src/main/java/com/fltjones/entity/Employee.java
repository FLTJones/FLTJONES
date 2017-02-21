package com.fltjones.entity;

/**
 * 员工表实体类
 * @author fltjones on 2016-12-15 
 */
public class Employee {
	// 主键
	private int eid;
	// 姓名
	private String ename;
	// 性别
	private String sex;
	// 工作编号
	private String eon;
	// 密码
	private String password;
	// 对应的部门编号
	private int deid;

	// 多对一
	private Department department;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEon() {
		return eon;
	}

	public void setEon(String eon) {
		this.eon = eon;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getDeid() {
		return deid;
	}

	public void setDeid(int deid) {
		this.deid = deid;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sex=" + sex + ", eon=" + eon + ", password=" + password
				+ ", deid=" + deid + "]";
	}

}
