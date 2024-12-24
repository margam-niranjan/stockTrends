package com.stocks.ApiResponse.analystRecommendation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Statistics{

	@JsonProperty("Statistic")
	private List<StatisticItem> statistic;

	public void setStatistic(List<StatisticItem> statistic){
		this.statistic = statistic;
	}

	public List<StatisticItem> getStatistic(){
		return statistic;
	}
}