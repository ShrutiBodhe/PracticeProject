package com.incture.dto;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTemplateResponseDto {

	private XSSFWorkbook workbook;
	private String message;
	private String status;
	private ExcelMasterConfigDto masterConfigDto;

	public XSSFWorkbook getWorkbook() {
		return workbook;
	}

	public void setWorkbook(XSSFWorkbook workbook) {
		this.workbook = workbook;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ExcelMasterConfigDto getMasterConfigDto() {
		return masterConfigDto;
	}

	public void setMasterConfigDto(ExcelMasterConfigDto masterConfigDto) {
		this.masterConfigDto = masterConfigDto;
	}

}
