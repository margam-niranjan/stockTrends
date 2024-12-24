package com.stocks.ApiResponse.analystRecommendation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Recommendation{

	@JsonProperty("High")
	private int high;

	@JsonProperty("Mean")
	private Object mean;

	@JsonProperty("Low")
	private int low;

	@JsonProperty("NumberOfRecommendations")
	private int numberOfRecommendations;

	@JsonProperty("PreliminaryMean")
	private Object preliminaryMean;

	@JsonProperty("Statistics")
	private Statistics statistics;

	@JsonProperty("UnverifiedMean")
	private Object unverifiedMean;

	public void setHigh(int high){
		this.high = high;
	}

	public int getHigh(){
		return high;
	}

	public void setMean(Object mean){
		this.mean = mean;
	}

	public Object getMean(){
		return mean;
	}

	public void setLow(int low){
		this.low = low;
	}

	public int getLow(){
		return low;
	}

	public void setNumberOfRecommendations(int numberOfRecommendations){
		this.numberOfRecommendations = numberOfRecommendations;
	}

	public int getNumberOfRecommendations(){
		return numberOfRecommendations;
	}

	public void setPreliminaryMean(Object preliminaryMean){
		this.preliminaryMean = preliminaryMean;
	}

	public Object getPreliminaryMean(){
		return preliminaryMean;
	}

	public void setStatistics(Statistics statistics){
		this.statistics = statistics;
	}

	public Statistics getStatistics(){
		return statistics;
	}

	public void setUnverifiedMean(Object unverifiedMean){
		this.unverifiedMean = unverifiedMean;
	}

	public Object getUnverifiedMean(){
		return unverifiedMean;
	}
}