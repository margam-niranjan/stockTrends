package com.stocks.ApiResponse.trendingStocks;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TrendingStocks{

	@JsonProperty("top_gainers")
	private List<TopGainersItem> topGainers;

	@JsonProperty("top_losers")
	private List<TopLosersItem> topLosers;

	public void setTopGainers(List<TopGainersItem> topGainers){
		this.topGainers = topGainers;
	}

	public List<TopGainersItem> getTopGainers(){
		return topGainers;
	}

	public void setTopLosers(List<TopLosersItem> topLosers){
		this.topLosers = topLosers;
	}

	public List<TopLosersItem> getTopLosers(){
		return topLosers;
	}
}