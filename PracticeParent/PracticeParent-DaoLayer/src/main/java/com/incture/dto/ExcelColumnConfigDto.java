package com.incture.dto;

public class ExcelColumnConfigDto extends BaseDto {

	private String columnId;
	private String columnName;
	private String formula;
	private String backgroundColor;
	private boolean isMandatory;
	private String dataType;
	private String fieldMapping;
	private Integer sequenceNo;
	private Integer mergetotalColumns;
	private boolean isEditable;
	private boolean isVisible;
	private String alignment;

	public String getColumnId() {
		return columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public boolean isMandatory() {
		return isMandatory;
	}

	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getFieldMapping() {
		return fieldMapping;
	}

	public void setFieldMapping(String fieldMapping) {
		this.fieldMapping = fieldMapping;
	}

	public Integer getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public Integer getMergetotalColumns() {
		return mergetotalColumns;
	}

	public void setMergetotalColumns(Integer mergetotalColumns) {
		this.mergetotalColumns = mergetotalColumns;
	}

	public boolean isEditable() {
		return isEditable;
	}

	public void setEditable(boolean isEditable) {
		this.isEditable = isEditable;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	@Override
	public String toString() {
		return "ExcelColumnConfigDto [columnId=" + columnId + ", columnName=" + columnName + ", formula=" + formula
				+ ", backgroundColor=" + backgroundColor + ", isMandatory=" + isMandatory + ", dataType=" + dataType
				+ ", fieldMapping=" + fieldMapping + ", sequenceNo=" + sequenceNo + ", mergetotalColumns="
				+ mergetotalColumns + ", isEditable=" + isEditable + ", isVisible=" + isVisible + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.incture.dto.BaseDto#getPrimaryKey()
	 */
	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
