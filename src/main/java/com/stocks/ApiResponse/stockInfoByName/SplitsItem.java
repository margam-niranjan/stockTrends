package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SplitsItem{

	@JsonProperty("xsDate")
	private String xsDate;

	@JsonProperty("newFaceValue")
	private int newFaceValue;

	@JsonProperty("companyName")
	private String companyName;

	@JsonProperty("recordDate")
	private String recordDate;

	@JsonProperty("sortDate")
	private String sortDate;

	@JsonProperty("oldFaceValue")
	private int oldFaceValue;

	@JsonProperty("tickerId")
	private String tickerId;

	@JsonProperty("remarks")
	private String remarks;

	public void setXsDate(String xsDate){
		this.xsDate = xsDate;
	}

	public String getXsDate(){
		return xsDate;
	}

	public void setNewFaceValue(int newFaceValue){
		this.newFaceValue = newFaceValue;
	}

	public int getNewFaceValue(){
		return newFaceValue;
	}

	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	public String getCompanyName(){
		return companyName;
	}

	public void setRecordDate(String recordDate){
		this.recordDate = recordDate;
	}

	public String getRecordDate(){
		return recordDate;
	}

	public void setSortDate(String sortDate){
		this.sortDate = sortDate;
	}

	public String getSortDate(){
		return sortDate;
	}

	public void setOldFaceValue(int oldFaceValue){
		this.oldFaceValue = oldFaceValue;
	}

	public int getOldFaceValue(){
		return oldFaceValue;
	}

	public void setTickerId(String tickerId){
		this.tickerId = tickerId;
	}

	public String getTickerId(){
		return tickerId;
	}

	public void setRemarks(String remarks){
		this.remarks = remarks;
	}

	public String getRemarks(){
		return remarks;
	}
}