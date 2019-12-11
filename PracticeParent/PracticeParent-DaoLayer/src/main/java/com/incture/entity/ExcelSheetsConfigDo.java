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
@Table(name = "EXCEL_SHEETS_CONFIG")
public class ExcelSheetsConfigDo implements BaseDo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SHEET_ID", columnDefinition = "NVARCHAR(25)")
	private String sheetId;

	@Column(name = "SHEET_NAME", columnDefinition = "NVARCHAR(100)")
	private String sheetName;

	@Column(name = "IS_VISIBLE")
	private boolean isVisible;

	@Column(name = "SEQUENCE_NO")
	private Integer sequnceNo;

	@Column(name = "IS_PROTECTED")
	private Boolean isProtected;

	@ManyToOne
	@JoinColumn(name = "EXCEL_ID")
	private ExcelMasterConfigDo master;

	@OneToMany(mappedBy = "sheet", cascade = CascadeType.ALL)
	private List<ExcelHeaderConfigDo> headers;

	public Boolean getIsProtected() {
		return isProtected;
	}

	public void setIsProtected(Boolean isProtected) {
		this.isProtected = isProtected;
	}

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

	public ExcelMasterConfigDo getMaster() {
		return master;
	}

	public void setMaster(ExcelMasterConfigDo master) {
		this.master = master;
	}

	public List<ExcelHeaderConfigDo> getHeaders() {
		return headers;
	}

	public void setHeaders(List<ExcelHeaderConfigDo> headers) {
		this.headers = headers;
	}

	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
