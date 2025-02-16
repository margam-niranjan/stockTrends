package com.stocks.ApiResponse.stockInfoByName;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RecosBar{

	@JsonProperty("stockAnalyst")
	private List<StockAnalystItem> stockAnalyst;

	@JsonProperty("isDataPresent")
	private boolean isDataPresent;

	@JsonProperty("noOfRecommendations")
	private int noOfRecommendations;

	@JsonProperty("meanValue")
	private Object meanValue;

	@JsonProperty("tickerPercentage")
	private Object tickerPercentage;

	@JsonProperty("tickerRatingValue")
	private int tickerRatingValue;

	public void setStockAnalyst(List<StockAnalystItem> stockAnalyst){
		this.stockAnalyst = stockAnalyst;
	}

	public List<StockAnalystItem> getStockAnalyst(){
		return stockAnalyst;
	}

	public void setIsDataPresent(boolean isDataPresent){
		this.isDataPresent = isDataPresent;
	}

	public boolean isIsDataPresent(){
		return isDataPresent;
	}

	public void setNoOfRecommendations(int noOfRecommendations){
		this.noOfRecommendations = noOfRecommendations;
	}

	public int getNoOfRecommendations(){
		return noOfRecommendations;
	}

	public void setMeanValue(Object meanValue){
		this.meanValue = meanValue;
	}

	public Object getMeanValue(){
		return meanValue;
	}

	public void setTickerPercentage(Object tickerPercentage){
		this.tickerPercentage = tickerPercentage;
	}

	public Object getTickerPercentage(){
		return tickerPercentage;
	}

	public void setTickerRatingValue(int tickerRatingValue){
		this.tickerRatingValue = tickerRatingValue;
	}

	public int getTickerRatingValue(){
		return tickerRatingValue;
	}
}