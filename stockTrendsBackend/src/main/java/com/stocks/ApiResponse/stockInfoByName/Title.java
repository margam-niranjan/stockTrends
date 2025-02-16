package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Title{

	@JsonProperty("abbr1")
	private String abbr1;

	@JsonProperty("startMonth")
	private String startMonth;

	@JsonProperty("abbr2")
	private String abbr2;

	@JsonProperty("startDay")
	private String startDay;

	@JsonProperty("iD2")
	private String iD2;

	@JsonProperty("iD1")
	private String iD1;

	@JsonProperty("startYear")
	private String startYear;

	@JsonProperty("Value")
	private String value;

	public void setAbbr1(String abbr1){
		this.abbr1 = abbr1;
	}

	public String getAbbr1(){
		return abbr1;
	}

	public void setStartMonth(String startMonth){
		this.startMonth = startMonth;
	}

	public String getStartMonth(){
		return startMonth;
	}

	public void setAbbr2(String abbr2){
		this.abbr2 = abbr2;
	}

	public String getAbbr2(){
		return abbr2;
	}

	public void setStartDay(String startDay){
		this.startDay = startDay;
	}

	public String getStartDay(){
		return startDay;
	}

	public void setID2(String iD2){
		this.iD2 = iD2;
	}

	public String getID2(){
		return iD2;
	}

	public void setID1(String iD1){
		this.iD1 = iD1;
	}

	public String getID1(){
		return iD1;
	}

	public void setStartYear(String startYear){
		this.startYear = startYear;
	}

	public String getStartYear(){
		return startYear;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}
}