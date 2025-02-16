package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockAnalystItem{

	@JsonProperty("minValue")
	private Object minValue;

	@JsonProperty("numberOfAnalysts")
	private int numberOfAnalysts;

	@JsonProperty("ratingName")
	private String ratingName;

	@JsonProperty("maxValue")
	private int maxValue;

	@JsonProperty("ratingValue")
	private int ratingValue;

	@JsonProperty("colorCode")
	private String colorCode;

	@JsonProperty("numberOfAnalysts3MonthAgo")
	private String numberOfAnalysts3MonthAgo;

	@JsonProperty("numberOfAnalysts1WeekAgo")
	private String numberOfAnalysts1WeekAgo;

	@JsonProperty("numberOfAnalystsLatest")
	private String numberOfAnalystsLatest;

	@JsonProperty("numberOfAnalysts1MonthAgo")
	private String numberOfAnalysts1MonthAgo;

	@JsonProperty("numberOfAnalysts2MonthAgo")
	private String numberOfAnalysts2MonthAgo;

	public void setMinValue(Object minValue){
		this.minValue = minValue;
	}

	public Object getMinValue(){
		return minValue;
	}

	public void setNumberOfAnalysts(int numberOfAnalysts){
		this.numberOfAnalysts = numberOfAnalysts;
	}

	public int getNumberOfAnalysts(){
		return numberOfAnalysts;
	}

	public void setRatingName(String ratingName){
		this.ratingName = ratingName;
	}

	public String getRatingName(){
		return ratingName;
	}

	public void setMaxValue(int maxValue){
		this.maxValue = maxValue;
	}

	public int getMaxValue(){
		return maxValue;
	}

	public void setRatingValue(int ratingValue){
		this.ratingValue = ratingValue;
	}

	public int getRatingValue(){
		return ratingValue;
	}

	public void setColorCode(String colorCode){
		this.colorCode = colorCode;
	}

	public String getColorCode(){
		return colorCode;
	}

	public void setNumberOfAnalysts3MonthAgo(String numberOfAnalysts3MonthAgo){
		this.numberOfAnalysts3MonthAgo = numberOfAnalysts3MonthAgo;
	}

	public String getNumberOfAnalysts3MonthAgo(){
		return numberOfAnalysts3MonthAgo;
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