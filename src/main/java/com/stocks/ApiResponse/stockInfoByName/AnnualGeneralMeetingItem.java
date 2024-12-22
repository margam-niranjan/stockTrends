package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnnualGeneralMeetingItem{

	@JsonProperty("dateOfAnnouncement")
	private String dateOfAnnouncement;

	@JsonProperty("agmDate")
	private String agmDate;

	@JsonProperty("purpose")
	private String purpose;

	@JsonProperty("companyName")
	private String companyName;

	@JsonProperty("recordDate")
	private String recordDate;

	@JsonProperty("tickerId")
	private String tickerId;

	@JsonProperty("remarks")
	private String remarks;

	public void setDateOfAnnouncement(String dateOfAnnouncement){
		this.dateOfAnnouncement = dateOfAnnouncement;
	}

	public String getDateOfAnnouncement(){
		return dateOfAnnouncement;
	}

	public void setAgmDate(String agmDate){
		this.agmDate = agmDate;
	}

	public String getAgmDate(){
		return agmDate;
	}

	public void setPurpose(String purpose){
		this.purpose = purpose;
	}

	public String getPurpose(){
		return purpose;
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