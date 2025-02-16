package com.stocks.ApiResponse.mutualFunds;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditRiskItem{

	@JsonProperty("asset_size")
	private Object assetSize;

	@JsonProperty("1_year_return")
	private Object jsonMember1YearReturn;

	@JsonProperty("1_month_return")
	private Object jsonMember1MonthReturn;

	@JsonProperty("6_month_return")
	private Object jsonMember6MonthReturn;

	@JsonProperty("star_rating")
	private int starRating;

	@JsonProperty("5_year_return")
	private Object jsonMember5YearReturn;

	@JsonProperty("fund_name")
	private String fundName;

	@JsonProperty("percentage_change")
	private Object percentageChange;

	@JsonProperty("3_year_return")
	private Object jsonMember3YearReturn;

	@JsonProperty("latest_nav")
	private Object latestNav;

	@JsonProperty("3_month_return")
	private Object jsonMember3MonthReturn;

	public void setAssetSize(Object assetSize){
		this.assetSize = assetSize;
	}

	public Object getAssetSize(){
		return assetSize;
	}

	public void setJsonMember1YearReturn(Object jsonMember1YearReturn){
		this.jsonMember1YearReturn = jsonMember1YearReturn;
	}

	public Object getJsonMember1YearReturn(){
		return jsonMember1YearReturn;
	}

	public void setJsonMember1MonthReturn(Object jsonMember1MonthReturn){
		this.jsonMember1MonthReturn = jsonMember1MonthReturn;
	}

	public Object getJsonMember1MonthReturn(){
		return jsonMember1MonthReturn;
	}

	public void setJsonMember6MonthReturn(Object jsonMember6MonthReturn){
		this.jsonMember6MonthReturn = jsonMember6MonthReturn;
	}

	public Object getJsonMember6MonthReturn(){
		return jsonMember6MonthReturn;
	}

	public void setStarRating(int starRating){
		this.starRating = starRating;
	}

	public int getStarRating(){
		return starRating;
	}

	public void setJsonMember5YearReturn(Object jsonMember5YearReturn){
		this.jsonMember5YearReturn = jsonMember5YearReturn;
	}

	public Object getJsonMember5YearReturn(){
		return jsonMember5YearReturn;
	}

	public void setFundName(String fundName){
		this.fundName = fundName;
	}

	public String getFundName(){
		return fundName;
	}

	public void setPercentageChange(Object percentageChange){
		this.percentageChange = percentageChange;
	}

	public Object getPercentageChange(){
		return percentageChange;
	}

	public void setJsonMember3YearReturn(Object jsonMember3YearReturn){
		this.jsonMember3YearReturn = jsonMember3YearReturn;
	}

	public Object getJsonMember3YearReturn(){
		return jsonMember3YearReturn;
	}

	public void setLatestNav(Object latestNav){
		this.latestNav = latestNav;
	}

	public Object getLatestNav(){
		return latestNav;
	}

	public void setJsonMember3MonthReturn(Object jsonMember3MonthReturn){
		this.jsonMember3MonthReturn = jsonMember3MonthReturn;
	}

	public Object getJsonMember3MonthReturn(){
		return jsonMember3MonthReturn;
	}
}