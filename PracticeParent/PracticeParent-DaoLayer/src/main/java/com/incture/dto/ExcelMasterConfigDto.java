package com.incture.dto;

import java.util.List;

public class ExcelMasterConfigDto extends BaseDto {

	private String excelId;
	private String excelName;
	private List<ExcelSheetsConfigDto> sheets;

	public String getExcelId() {
		return excelId;
	}

	public void setExcelId(String excelId) {
		this.excelId = excelId;
	}

	public String getExcelName() {
		return excelName;
	}

	public void setExcelName(String excelName) {
		this.excelName = excelName;
	}

	public List<ExcelSheetsConfigDto> getSheets() {
		return sheets;
	}

	public void setSheets(List<ExcelSheetsConfigDto> sheets) {
		this.sheets = sheets;
	}

	@Override
	public String toString() {
		return "ExcelMasterConfigDto [excelId=" + excelId + ", excelName=" + excelName + ", sheets=" + sheets + "]";
	}

	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
