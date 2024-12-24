package com.stocks.ApiResponse.fetch52WeekData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Low52WeekItem{

	@JsonProperty("ticker")
	private String ticker;

	@JsonProperty("price")
	private Object price;

	@JsonProperty("company")
	private String company;

	@JsonProperty("52_week_low")
	private Object jsonMember52WeekLow;

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

	public void setJsonMember52WeekLow(Object jsonMember52WeekLow){
		this.jsonMember52WeekLow = jsonMember52WeekLow;
	}

	public Object getJsonMember52WeekLow(){
		return jsonMember52WeekLow;
	}
}