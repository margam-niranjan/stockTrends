package com.stocks.ApiResponse.analystRecommendation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatisticItem{

	@JsonProperty("NumberOfAnalysts")
	private int numberOfAnalysts;

	@JsonProperty("Recommendation")
	private int recommendation;

	public void setNumberOfAnalysts(int numberOfAnalysts){
		this.numberOfAnalysts = numberOfAnalysts;
	}

	public int getNumberOfAnalysts(){
		return numberOfAnalysts;
	}

	public void setRecommendation(int recommendation){
		this.recommendation = recommendation;
	}

	public int getRecommendation(){
		return recommendation;
	}
}