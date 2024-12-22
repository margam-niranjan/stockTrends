package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PeerCompanyListItem{

	@JsonProperty("netChange")
	private int netChange;

	@JsonProperty("marketCap")
	private Object marketCap;

	@JsonProperty("returnOnAverageEquity5YearAverage")
	private Object returnOnAverageEquity5YearAverage;

	@JsonProperty("priceToBookValueRatio")
	private Object priceToBookValueRatio;

	@JsonProperty("percentChange")
	private Object percentChange;

	@JsonProperty("yhigh")
	private Object yhigh;

	@JsonProperty("overallRating")
	private String overallRating;

	@JsonProperty("ylow")
	private int ylow;

	@JsonProperty("ltDebtPerEquityMostRecentFiscalYear")
	private Object ltDebtPerEquityMostRecentFiscalYear;

	@JsonProperty("companyName")
	private String companyName;

	@JsonProperty("netProfitMarginPercentTrailing12Month")
	private Object netProfitMarginPercentTrailing12Month;

	@JsonProperty("dividendYieldIndicatedAnnualDividend")
	private Object dividendYieldIndicatedAnnualDividend;

	@JsonProperty("netProfitMargin5YearAverage")
	private Object netProfitMargin5YearAverage;

	@JsonProperty("languageSupport")
	private String languageSupport;

	@JsonProperty("returnOnAverageEquityTrailing12Month")
	private Object returnOnAverageEquityTrailing12Month;

	@JsonProperty("price")
	private Object price;

	@JsonProperty("imageUrl")
	private String imageUrl;

	@JsonProperty("totalSharesOutstanding")
	private Object totalSharesOutstanding;

	@JsonProperty("tickerId")
	private String tickerId;

	@JsonProperty("priceToEarningsValueRatio")
	private Object priceToEarningsValueRatio;

	public void setNetChange(int netChange){
		this.netChange = netChange;
	}

	public int getNetChange(){
		return netChange;
	}

	public void setMarketCap(Object marketCap){
		this.marketCap = marketCap;
	}

	public Object getMarketCap(){
		return marketCap;
	}

	public void setReturnOnAverageEquity5YearAverage(Object returnOnAverageEquity5YearAverage){
		this.returnOnAverageEquity5YearAverage = returnOnAverageEquity5YearAverage;
	}

	public Object getReturnOnAverageEquity5YearAverage(){
		return returnOnAverageEquity5YearAverage;
	}

	public void setPriceToBookValueRatio(Object priceToBookValueRatio){
		this.priceToBookValueRatio = priceToBookValueRatio;
	}

	public Object getPriceToBookValueRatio(){
		return priceToBookValueRatio;
	}

	public void setPercentChange(Object percentChange){
		this.percentChange = percentChange;
	}

	public Object getPercentChange(){
		return percentChange;
	}

	public void setYhigh(Object yhigh){
		this.yhigh = yhigh;
	}

	public Object getYhigh(){
		return yhigh;
	}

	public void setOverallRating(String overallRating){
		this.overallRating = overallRating;
	}

	public String getOverallRating(){
		return overallRating;
	}

	public void setYlow(int ylow){
		this.ylow = ylow;
	}

	public int getYlow(){
		return ylow;
	}

	public void setLtDebtPerEquityMostRecentFiscalYear(Object ltDebtPerEquityMostRecentFiscalYear){
		this.ltDebtPerEquityMostRecentFiscalYear = ltDebtPerEquityMostRecentFiscalYear;
	}

	public Object getLtDebtPerEquityMostRecentFiscalYear(){
		return ltDebtPerEquityMostRecentFiscalYear;
	}

	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	public String getCompanyName(){
		return companyName;
	}

	public void setNetProfitMarginPercentTrailing12Month(Object netProfitMarginPercentTrailing12Month){
		this.netProfitMarginPercentTrailing12Month = netProfitMarginPercentTrailing12Month;
	}

	public Object getNetProfitMarginPercentTrailing12Month(){
		return netProfitMarginPercentTrailing12Month;
	}

	public void setDividendYieldIndicatedAnnualDividend(Object dividendYieldIndicatedAnnualDividend){
		this.dividendYieldIndicatedAnnualDividend = dividendYieldIndicatedAnnualDividend;
	}

	public Object getDividendYieldIndicatedAnnualDividend(){
		return dividendYieldIndicatedAnnualDividend;
	}

	public void setNetProfitMargin5YearAverage(Object netProfitMargin5YearAverage){
		this.netProfitMargin5YearAverage = netProfitMargin5YearAverage;
	}

	public Object getNetProfitMargin5YearAverage(){
		return netProfitMargin5YearAverage;
	}

	public void setLanguageSupport(String languageSupport){
		this.languageSupport = languageSupport;
	}

	public String getLanguageSupport(){
		return languageSupport;
	}

	public void setReturnOnAverageEquityTrailing12Month(Object returnOnAverageEquityTrailing12Month){
		this.returnOnAverageEquityTrailing12Month = returnOnAverageEquityTrailing12Month;
	}

	public Object getReturnOnAverageEquityTrailing12Month(){
		return returnOnAverageEquityTrailing12Month;
	}

	public void setPrice(Object price){
		this.price = price;
	}

	public Object getPrice(){
		return price;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setTotalSharesOutstanding(Object totalSharesOutstanding){
		this.totalSharesOutstanding = totalSharesOutstanding;
	}

	public Object getTotalSharesOutstanding(){
		return totalSharesOutstanding;
	}

	public void setTickerId(String tickerId){
		this.tickerId = tickerId;
	}

	public String getTickerId(){
		return tickerId;
	}

	public void setPriceToEarningsValueRatio(Object priceToEarningsValueRatio){
		this.priceToEarningsValueRatio = priceToEarningsValueRatio;
	}

	public Object getPriceToEarningsValueRatio(){
		return priceToEarningsValueRatio;
	}
}