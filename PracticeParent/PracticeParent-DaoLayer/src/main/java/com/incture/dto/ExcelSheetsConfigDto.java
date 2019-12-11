package com.incture.dto;

import java.util.List;

public class ExcelSheetsConfigDto extends BaseDto {

	private String sheetId;
	private String sheetName;
	private boolean isVisible;
	private Integer sequnceNo;
	private Boolean isProtected;

	public Boolean getIsProtected() {
		return isProtected;
	}

	public void setIsProtected(Boolean isProtected) {
		this.isProtected = isProtected;
	}

	private List<ExcelHeaderConfigDto> headers;

	public String getSheetId() {
		return sheetId;
	}

	public void setSheetId(String sheetId) {
		this.sheetId = sheetId;
	}

	public String getSheetName() {
		return sheetName;
	}

	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public Integer getSequnceNo() {
		return sequnceNo;
	}

	public void setSequnceNo(Integer sequnceNo) {
		this.sequnceNo = sequnceNo;
	}

	public List<ExcelHeaderConfigDto> getHeaders() {
		return headers;
	}

	public void setHeaders(List<ExcelHeaderConfigDto> headers) {
		this.headers = headers;
	}

	@Override
	public String toString() {
		return "ExcelSheetsConfigDto [sheetId=" + sheetId + ", sheetName=" + sheetName + ", isVisible=" + isVisible
				+ ", sequnceNo=" + sequnceNo + ", isProtected=" + isProtected + ", headers=" + headers + "]";
	}

	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
