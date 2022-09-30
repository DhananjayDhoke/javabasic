package com.firstProject.firstSpringProject.helloworld;

public class helloWordBean {

	private String message;

	public helloWordBean(String message) {
		this.message = message;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "helloWordBean [message=" + message + "]";
	}

}
