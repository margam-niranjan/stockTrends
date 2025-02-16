package com.stocks.ApiResponse.fetch52WeekData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class High52WeekItem{

	@JsonProperty("ticker")
	private String ticker;

	@JsonProperty("price")
	private Object price;

	@JsonProperty("company")
	private String company;

	@JsonProperty("52_week_high")
	private Object jsonMember52WeekHigh;

	public void setTicker(String ticker){
		this.ticker = ticker;
	}

	public String getTicker(){
		return ticker;
	}

	public void setPrice(Object price){
		this.price = price;
	}

	public Object getPrice(){
		return price;
	}

	public void setCompany(String company){
		this.company = company;
	}

	public String getCompany(){
		return company;
	}

	public void setJsonMember52WeekHigh(Object jsonMember52WeekHigh){
		this.jsonMember52WeekHigh = jsonMember52WeekHigh;
	}

	public Object getJsonMember52WeekHigh(){
		return jsonMember52WeekHigh;
	}
}