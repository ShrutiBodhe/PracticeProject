package com.incture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EXCEL_COLUMN_CONFIG")
public class ExcelColumnConfigDo implements BaseDo {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COLUMN_ID", columnDefinition = "NVARCHAR(25)")
	private String columnId;

	@Column(name = "COLUMN_NAME", columnDefinition = "NVARCHAR(200)")
	private String columnName;

	@Column(name = "FORMULA", columnDefinition = "NVARCHAR(200)")
	private String formula;

	@Column(name = "BACKGROUND_COLOR", columnDefinition = "NVARCHAR(50)")
	private String backgroundColor;

	@Column(name = "MANDATORY")
	private boolean isMandatory;

	@Column(name = "DATA_TYPE", columnDefinition = "NVARCHAR(50)")
	private String dataType;

	@Column(name = "FIELD_MAPPING", columnDefinition = "NVARCHAR(25)")
	private String fieldMapping;

	@Column(name = "SEQUENCE_NO")
	private Integer sequenceNo;

	@Column(name = "COLUMN_MERGE_NOS")
	private Integer mergetotalColumns;

	@Column(name = "EDITABLE")
	private boolean isEditable;

	@Column(name = "VISIBLE")
	private boolean isVisible;

	@ManyToOne
	@JoinColumn(name = "HEADER_ID")
	private ExcelHeaderConfigDo headers;

	@Column(name = "ALIGNMENT", columnDefinition = "NVARCHAR(25)")
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

	public ExcelHeaderConfigDo getHeaders() {
		return headers;
	}

	public void setHeaders(ExcelHeaderConfigDo headers) {
		this.headers = headers;
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
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
