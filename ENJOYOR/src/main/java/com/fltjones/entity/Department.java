package com.fltjones.entity;

/**
 * 部门表实体类
 * 
 * @author fltjones on 2016-12-15
 */
public class Department {
	// 主键
	private int deid;
	// 部门名
	private String dename;
	// 部门状态
	private String demstate;

	public int getDeid() {
		return deid;
	}

	public void setDeid(int deid) {
		this.deid = deid;
	}

	public String getDename() {
		return dename;
	}

	public void setDename(String dename) {
		this.dename = dename;
	}

	public String getDemstate() {
		return demstate;
	}

	public void setDemstate(String demstate) {
		this.demstate = demstate;
	}

	@Override
	public String toString() {
		return "Department [deid=" + deid + ", dename=" + dename + ", demstate=" + demstate + "]";
	}

}
