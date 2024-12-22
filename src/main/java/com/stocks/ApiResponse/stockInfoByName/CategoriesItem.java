package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoriesItem{

	@JsonProperty("holdingDate")
	private String holdingDate;

	@JsonProperty("percentage")
	private String percentage;

	public void setHoldingDate(String holdingDate){
		this.holdingDate = holdingDate;
	}

	public String getHoldingDate(){
		return holdingDate;
	}

	public void setPercentage(String percentage){
		this.percentage = percentage;
	}

	public String getPercentage(){
		return percentage;
	}
}