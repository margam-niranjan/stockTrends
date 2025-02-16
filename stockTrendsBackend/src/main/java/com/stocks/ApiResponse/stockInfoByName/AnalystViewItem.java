package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnalystViewItem{

	@JsonProperty("numberOfAnalysts3MonthAgo")
	private String numberOfAnalysts3MonthAgo;

	@JsonProperty("ratingName")
	private String ratingName;

	@JsonProperty("ratingValue")
	private int ratingValue;

	@JsonProperty("numberOfAnalysts1WeekAgo")
	private String numberOfAnalysts1WeekAgo;

	@JsonProperty("numberOfAnalystsLatest")
	private String numberOfAnalystsLatest;

	@JsonProperty("colorCode")
	private String colorCode;

	@JsonProperty("numberOfAnalysts1MonthAgo")
	private String numberOfAnalysts1MonthAgo;

	@JsonProperty("numberOfAnalysts2MonthAgo")
	private String numberOfAnalysts2MonthAgo;

	public void setNumberOfAnalysts3MonthAgo(String numberOfAnalysts3MonthAgo){
		this.numberOfAnalysts3MonthAgo = numberOfAnalysts3MonthAgo;
	}

	public String getNumberOfAnalysts3MonthAgo(){
		return numberOfAnalysts3MonthAgo;
	}

	public void setRatingName(String ratingName){
		this.ratingName = ratingName;
	}

	public String getRatingName(){
		return ratingName;
	}

	public void setRatingValue(int ratingValue){
		this.ratingValue = ratingValue;
	}

	public int getRatingValue(){
		return ratingValue;
	}

	public void setNumberOfAnalysts1WeekAgo(String numberOfAnalysts1WeekAgo){
		this.numberOfAnalysts1WeekAgo = numberOfAnalysts1WeekAgo;
	}

	public String getNumberOfAnalysts1WeekAgo(){
		return numberOfAnalysts1WeekAgo;
	}

	public void setNumberOfAnalystsLatest(String numberOfAnalystsLatest){
		this.numberOfAnalystsLatest = numberOfAnalystsLatest;
	}

	public String getNumberOfAnalystsLatest(){
		return numberOfAnalystsLatest;
	}

	public void setColorCode(String colorCode){
		this.colorCode = colorCode;
	}

	public String getColorCode(){
		return colorCode;
	}

	public void setNumberOfAnalysts1MonthAgo(String numberOfAnalysts1MonthAgo){
		this.numberOfAnalysts1MonthAgo = numberOfAnalysts1MonthAgo;
	}

	public String getNumberOfAnalysts1MonthAgo(){
		return numberOfAnalysts1MonthAgo;
	}

	public void setNumberOfAnalysts2MonthAgo(String numberOfAnalysts2MonthAgo){
		this.numberOfAnalysts2MonthAgo = numberOfAnalysts2MonthAgo;
	}

	public String getNumberOfAnalysts2MonthAgo(){
		return numberOfAnalysts2MonthAgo;
	}
}