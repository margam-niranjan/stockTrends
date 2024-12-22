package com.stocks.ApiResponse.trendingStocks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrendingStocksData {

	@JsonProperty("trending_stocks")
	private TrendingStocks trendingStocks;

	public void setTrendingStocks(TrendingStocks trendingStocks){
		this.trendingStocks = trendingStocks;
	}

	public TrendingStocks getTrendingStocks(){
		return trendingStocks;
	}
}