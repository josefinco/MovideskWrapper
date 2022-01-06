package com.br.model;

public class ResponseMessage {

	private String message;
	private String statusCode;

	public ResponseMessage(String message, String statusCode) {
		super();
		this.message = message;
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "ResponseMessage [message=" + message + ", statusCode=" + statusCode + "]";
	}

}