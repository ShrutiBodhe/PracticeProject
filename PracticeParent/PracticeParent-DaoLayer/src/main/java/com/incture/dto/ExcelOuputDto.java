package com.incture.dto;

import java.util.List;

public class ExcelOuputDto {
	private List<List<String>> headers;
	private List<List<String>> data;

	public List<List<String>> getHeaders() {
		return headers;
	}

	public void setHeaders(List<List<String>> headers) {
		this.headers = headers;
	}

	public List<List<String>> getData() {
		return data;
	}

	public void setData(List<List<String>> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ExcelOuputDto [data=" + data + ", headers=" + headers + "]";
	}

}
