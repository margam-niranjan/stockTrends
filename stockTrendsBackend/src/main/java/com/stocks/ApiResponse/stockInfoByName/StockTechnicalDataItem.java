package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockTechnicalDataItem{

	@JsonProperty("bsePrice")
	private String bsePrice;

	@JsonProperty("days")
	private int days;

	@JsonProperty("nsePrice")
	private String nsePrice;

	public void setBsePrice(String bsePrice){
		this.bsePrice = bsePrice;
	}

	public String getBsePrice(){
		return bsePrice;
	}

	public void setDays(int days){
		this.days = days;
	}

	public int getDays(){
		return days;
	}

	public void setNsePrice(String nsePrice){
		this.nsePrice = nsePrice;
	}

	public String getNsePrice(){
		return nsePrice;
	}
}