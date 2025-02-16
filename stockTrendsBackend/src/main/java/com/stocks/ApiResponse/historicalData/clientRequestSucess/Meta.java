package com.stocks.ApiResponse.historicalData.clientRequestSucess;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {

	@JsonProperty("is_weekly")
	private Boolean isWeekly;

	public Boolean getIsWeekly() {
		return isWeekly;
	}

	public void setIsWeekly(Boolean isWeekly) {
		this.isWeekly = isWeekly;
	}
}
