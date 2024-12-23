package com.stocks.ApiResponse.stockForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FiscalPeriod{

	@JsonProperty("Type")
	private String type;

	@JsonProperty("Year")
	private int year;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}
}