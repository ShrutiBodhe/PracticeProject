package com.incture.dto;

import java.util.List;

public class ExcelHeaderConfigDto extends BaseDto {

	private String headerId;
	private Integer sequenceNo;
	private List<ExcelColumnConfigDto> columns;

	public String getHeaderId() {
		return headerId;
	}

	public void setHeaderId(String headerId) {
		this.headerId = headerId;
	}

	public Integer getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public List<ExcelColumnConfigDto> getColumns() {
		return columns;
	}

	public void setColumns(List<ExcelColumnConfigDto> columns) {
		this.columns = columns;
	}

	@Override
	public String toString() {
		return "ExcelHeaderConfigDto [headerId=" + headerId + ", sequenceNo=" + sequenceNo + ", columns=" + columns
				+ "]";
	}

	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
