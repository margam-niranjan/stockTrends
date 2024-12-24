package com.stocks.ApiResponse.analystRecommendation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PriceTargetSnapshotItem{

	@JsonProperty("CurrencyCode")
	private String currencyCode;

	@JsonProperty("High")
	private int high;

	@JsonProperty("Mean")
	private int mean;

	@JsonProperty("NumberOfEstimates")
	private int numberOfEstimates;

	@JsonProperty("Low")
	private int low;

	@JsonProperty("Median")
	private int median;

	@JsonProperty("StandardDeviation")
	private int standardDeviation;

	@JsonProperty("Age")
	private String age;

	public void setCurrencyCode(String currencyCode){
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}

	public void setHigh(int high){
		this.high = high;
	}

	public int getHigh(){
		return high;
	}

	public void setMean(int mean){
		this.mean = mean;
	}

	public int getMean(){
		return mean;
	}

	public void setNumberOfEstimates(int numberOfEstimates){
		this.numberOfEstimates = numberOfEstimates;
	}

	public int getNumberOfEstimates(){
		return numberOfEstimates;
	}

	public void setLow(int low){
		this.low = low;
	}

	public int getLow(){
		return low;
	}

	public void setMedian(int median){
		this.median = median;
	}

	public int getMedian(){
		return median;
	}

	public void setStandardDeviation(int standardDeviation){
		this.standardDeviation = standardDeviation;
	}

	public int getStandardDeviation(){
		return standardDeviation;
	}

	public void setAge(String age){
		this.age = age;
	}

	public String getAge(){
		return age;
	}
}