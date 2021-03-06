package com.fltjones.dto;

/**
*	@author fltjones on2016年12月19日
*/

//所有的ajax请求回放类型，封装json结果
public class DepartmentResult<T> {

	private boolean success;
	
	private T data;
	
	private String error;
	
	public DepartmentResult(boolean success, T data){
		this.success = success;
		this.data = data;
	}
	
	public DepartmentResult(boolean success, String error){
		this.success = success;
		this.error = error;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
}
