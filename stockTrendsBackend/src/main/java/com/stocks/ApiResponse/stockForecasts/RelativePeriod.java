package com.stocks.ApiResponse.stockForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RelativePeriod{

	@JsonProperty("Type")
	private String type;

	@JsonProperty("Number")
	private int number;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setNumber(int number){
		this.number = number;
	}

	public int getNumber(){
		return number;
	}
}