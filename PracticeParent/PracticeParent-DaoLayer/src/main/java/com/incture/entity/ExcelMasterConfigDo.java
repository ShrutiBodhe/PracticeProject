package com.incture.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EXCEL_MASTER_CONFIG")
public class ExcelMasterConfigDo implements BaseDo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EXCEL_ID", columnDefinition = "NVARCHAR(25)")
	private String excelId;

	@Column(name = "EXCEL_NAME", columnDefinition = "NVARCHAR(200)")
	private String excelName;

	@OneToMany(mappedBy = "master", cascade = CascadeType.ALL)
	private List<ExcelSheetsConfigDo> sheets;

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

	public List<ExcelSheetsConfigDo> getSheets() {
		return sheets;
	}

	public void setSheets(List<ExcelSheetsConfigDo> sheets) {
		this.sheets = sheets;
	}

	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
