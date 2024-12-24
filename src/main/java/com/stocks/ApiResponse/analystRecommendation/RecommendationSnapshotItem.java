package com.stocks.ApiResponse.analystRecommendation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecommendationSnapshotItem{

	@JsonProperty("High")
	private int high;

	@JsonProperty("Mean")
	private Object mean;

	@JsonProperty("Low")
	private int low;

	@JsonProperty("NumberOfRecommendations")
	private int numberOfRecommendations;

	@JsonProperty("Statistics")
	private Statistics statistics;

	@JsonProperty("Age")
	private String age;

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

	public void setStatistics(Statistics statistics){
		this.statistics = statistics;
	}

	public Statistics getStatistics(){
		return statistics;
	}

	public void setAge(String age){
		this.age = age;
	}

	public String getAge(){
		return age;
	}
}