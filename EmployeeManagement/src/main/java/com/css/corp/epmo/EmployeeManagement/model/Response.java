package com.css.corp.epmo.EmployeeManagement.model;

import com.css.corp.epmo.EmployeeManagement.constant.Result;

public class Response {

	private Object data;

	private Result result;

	public Response(Result result) {

		this.result = result;
	}

	public Response(Result result, Object data) {

		this.result = result;
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Response [data=" + data + ", result=" + result + "]";
	}
	
	
	

}
