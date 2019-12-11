package com.incture.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EXCEL_HEADERS_CONFIG")
public class ExcelHeaderConfigDo implements BaseDo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "HEADER_ID", columnDefinition = "NVARCHAR(25)")
	private String headerId;

	@Column(name = "SEQUENCE_NO")
	private Integer sequenceNo;

	@ManyToOne
	@JoinColumn(name = "SHEET_ID")
	private ExcelSheetsConfigDo sheet;

	@OneToMany(mappedBy = "headers", cascade = CascadeType.ALL)
	private List<ExcelColumnConfigDo> columns;

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

	public ExcelSheetsConfigDo getSheet() {
		return sheet;
	}

	public void setSheet(ExcelSheetsConfigDo sheet) {
		this.sheet = sheet;
	}

	public List<ExcelColumnConfigDo> getColumns() {
		return columns;
	}

	public void setColumns(List<ExcelColumnConfigDo> columns) {
		this.columns = columns;
	}

	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
