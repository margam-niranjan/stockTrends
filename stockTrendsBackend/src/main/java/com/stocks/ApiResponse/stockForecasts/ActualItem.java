package com.stocks.ApiResponse.stockForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActualItem{

	@JsonProperty("CurrencyCode")
	private String currencyCode;

	@JsonProperty("PostReport30DayPriceChangePercent")
	private Object postReport30DayPriceChangePercent;

	@JsonProperty("SurprisePercent")
	private int surprisePercent;

	@JsonProperty("NumberOfEstimates")
	private int numberOfEstimates;

	@JsonProperty("ReportedDate")
	private String reportedDate;

	@JsonProperty("Surprise60DayPercent")
	private Object surprise60DayPercent;

	@JsonProperty("Reported")
	private Object reported;

	@JsonProperty("RestatedDate")
	private Object restatedDate;

	@JsonProperty("Restated")
	private Object restated;

	@JsonProperty("SurpriseMean")
	private Object surpriseMean;

	@JsonProperty("StandardizedUnexpectedEarnings")
	private Object standardizedUnexpectedEarnings;

	public void setCurrencyCode(String currencyCode){
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}

	public void setPostReport30DayPriceChangePercent(Object postReport30DayPriceChangePercent){
		this.postReport30DayPriceChangePercent = postReport30DayPriceChangePercent;
	}

	public Object getPostReport30DayPriceChangePercent(){
		return postReport30DayPriceChangePercent;
	}

	public void setSurprisePercent(int surprisePercent){
		this.surprisePercent = surprisePercent;
	}

	public int getSurprisePercent(){
		return surprisePercent;
	}

	public void setNumberOfEstimates(int numberOfEstimates){
		this.numberOfEstimates = numberOfEstimates;
	}

	public int getNumberOfEstimates(){
		return numberOfEstimates;
	}

	public void setReportedDate(String reportedDate){
		this.reportedDate = reportedDate;
	}

	public String getReportedDate(){
		return reportedDate;
	}

	public void setSurprise60DayPercent(Object surprise60DayPercent){
		this.surprise60DayPercent = surprise60DayPercent;
	}

	public Object getSurprise60DayPercent(){
		return surprise60DayPercent;
	}

	public void setReported(Object reported){
		this.reported = reported;
	}

	public Object getReported(){
		return reported;
	}

	public void setRestatedDate(Object restatedDate){
		this.restatedDate = restatedDate;
	}

	public Object getRestatedDate(){
		return restatedDate;
	}

	public void setRestated(Object restated){
		this.restated = restated;
	}

	public Object getRestated(){
		return restated;
	}

	public void setSurpriseMean(Object surpriseMean){
		this.surpriseMean = surpriseMean;
	}

	public Object getSurpriseMean(){
		return surpriseMean;
	}

	public void setStandardizedUnexpectedEarnings(Object standardizedUnexpectedEarnings){
		this.standardizedUnexpectedEarnings = standardizedUnexpectedEarnings;
	}

	public Object getStandardizedUnexpectedEarnings(){
		return standardizedUnexpectedEarnings;
	}
}