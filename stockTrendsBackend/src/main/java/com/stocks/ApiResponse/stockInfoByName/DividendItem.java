package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DividendItem{

	@JsonProperty("dateOfAnnouncement")
	private String dateOfAnnouncement;

	@JsonProperty("instrumentType")
	private int instrumentType;

	@JsonProperty("bookClosureStartDate")
	private String bookClosureStartDate;

	@JsonProperty("companyName")
	private String companyName;

	@JsonProperty("sortDate")
	private String sortDate;

	@JsonProperty("interimOrFinal")
	private String interimOrFinal;

	@JsonProperty("percentage")
	private int percentage;

	@JsonProperty("bookClosureEndDate")
	private String bookClosureEndDate;

	@JsonProperty("recordDate")
	private String recordDate;

	@JsonProperty("tickerId")
	private String tickerId;

	@JsonProperty("xdDate")
	private String xdDate;

	@JsonProperty("value")
	private Object value;

	@JsonProperty("remarks")
	private String remarks;

	public void setDateOfAnnouncement(String dateOfAnnouncement){
		this.dateOfAnnouncement = dateOfAnnouncement;
	}

	public String getDateOfAnnouncement(){
		return dateOfAnnouncement;
	}

	public void setInstrumentType(int instrumentType){
		this.instrumentType = instrumentType;
	}

	public int getInstrumentType(){
		return instrumentType;
	}

	public void setBookClosureStartDate(String bookClosureStartDate){
		this.bookClosureStartDate = bookClosureStartDate;
	}

	public String getBookClosureStartDate(){
		return bookClosureStartDate;
	}

	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	public String getCompanyName(){
		return companyName;
	}

	public void setSortDate(String sortDate){
		this.sortDate = sortDate;
	}

	public String getSortDate(){
		return sortDate;
	}

	public void setInterimOrFinal(String interimOrFinal){
		this.interimOrFinal = interimOrFinal;
	}

	public String getInterimOrFinal(){
		return interimOrFinal;
	}

	public void setPercentage(int percentage){
		this.percentage = percentage;
	}

	public int getPercentage(){
		return percentage;
	}

	public void setBookClosureEndDate(String bookClosureEndDate){
		this.bookClosureEndDate = bookClosureEndDate;
	}

	public String getBookClosureEndDate(){
		return bookClosureEndDate;
	}

	public void setRecordDate(String recordDate){
		this.recordDate = recordDate;
	}

	public String getRecordDate(){
		return recordDate;
	}

	public void setTickerId(String tickerId){
		this.tickerId = tickerId;
	}

	public String getTickerId(){
		return tickerId;
	}

	public void setXdDate(String xdDate){
		this.xdDate = xdDate;
	}

	public String getXdDate(){
		return xdDate;
	}

	public void setValue(Object value){
		this.value = value;
	}

	public Object getValue(){
		return value;
	}

	public void setRemarks(String remarks){
		this.remarks = remarks;
	}

	public String getRemarks(){
		return remarks;
	}
}