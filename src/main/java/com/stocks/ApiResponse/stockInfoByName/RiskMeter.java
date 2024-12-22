package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RiskMeter{

	@JsonProperty("stdDev")
	private Object stdDev;

	@JsonProperty("categoryName")
	private String categoryName;

	public void setStdDev(Object stdDev){
		this.stdDev = stdDev;
	}

	public Object getStdDev(){
		return stdDev;
	}

	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}

	public String getCategoryName(){
		return categoryName;
	}
}