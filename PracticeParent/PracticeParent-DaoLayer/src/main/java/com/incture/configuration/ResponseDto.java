package com.incture.configuration;

/**
 * @author Polireddy.M
 *
 */
public class ResponseDto {

	private boolean status;
	private Integer statusCode;
	private String message;
	private Object data;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseDto [status=" + status + ", statusCode=" + statusCode + ", message=" + message + ", data="
				+ data + "]";
	}

}
