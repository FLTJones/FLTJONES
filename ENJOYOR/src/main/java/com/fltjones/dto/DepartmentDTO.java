package com.fltjones.dto;

/**
*	@author fltjones on2016年12月19日
*/
public class DepartmentDTO {
	
	//部门id
	private int deid;
	
	//部门状态
	private String demstate;

	public int getDeid() {
		return deid;
	}

	public void setDeid(int deid) {
		this.deid = deid;
	}

	public String getDemstate() {
		return demstate;
	}

	public void setDemstate(String demstate) {
		this.demstate = demstate;
	}
	
	@Override
	public String toString() {
		return "DepartmentDTO [deid=" + deid + ", demstate=" + demstate + "]";
	}
	
}
