package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BoardMeetingsItem{

	@JsonProperty("purpose")
	private String purpose;

	@JsonProperty("companyName")
	private String companyName;

	@JsonProperty("boardMeetDate")
	private String boardMeetDate;

	@JsonProperty("tickerId")
	private String tickerId;

	@JsonProperty("remarks")
	private String remarks;

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

	public void setBoardMeetDate(String boardMeetDate){
		this.boardMeetDate = boardMeetDate;
	}

	public String getBoardMeetDate(){
		return boardMeetDate;
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