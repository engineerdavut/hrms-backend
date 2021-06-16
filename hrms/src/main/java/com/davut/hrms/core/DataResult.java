package com.davut.hrms.core;

public class DataResult<T> extends Result{
	T data;

	public DataResult(T data, boolean success, String message) {
		super(success, message);
		// TODO Auto-generated constructor stub
		this.data=data;
	}
	public DataResult(T data, boolean success) {
		super(success);
		// TODO Auto-generated constructor stub
		this.data=data;
	}
	public T getData() {
		return this.data;
	}

}
