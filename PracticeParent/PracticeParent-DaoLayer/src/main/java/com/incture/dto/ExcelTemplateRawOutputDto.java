package com.incture.dto;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTemplateRawOutputDto {

	private ExcelMasterConfigDto excelMasterConfigDto;
	private XSSFWorkbook workbook;

	public ExcelMasterConfigDto getExcelMasterConfigDto() {
		return excelMasterConfigDto;
	}

	public void setExcelMasterConfigDto(ExcelMasterConfigDto excelMasterConfigDto) {
		this.excelMasterConfigDto = excelMasterConfigDto;
	}

	public XSSFWorkbook getWorkbook() {
		return workbook;
	}

	public void setWorkbook(XSSFWorkbook workbook) {
		this.workbook = workbook;
	}

}
