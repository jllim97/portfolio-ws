package com.example.demo.repository;

import lombok.Data;
import lombok.ToString;

@ToString
public class ResponseModel<T> {
	
	public ResponseModel() {}

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ResponseModel<T> success(T data) {
		ResponseModel<T> responseModel = new ResponseModel();
		responseModel.setData(data);
		return responseModel;
	}
}
