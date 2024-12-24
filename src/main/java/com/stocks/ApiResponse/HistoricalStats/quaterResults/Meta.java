package com.stocks.ApiResponse.HistoricalStats.quaterResults;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta{

	@JsonProperty("is_weekly")
	private boolean isWeekly;

	public void setIsWeekly(boolean isWeekly){
		this.isWeekly = isWeekly;
	}

	public boolean isIsWeekly(){
		return isWeekly;
	}
}