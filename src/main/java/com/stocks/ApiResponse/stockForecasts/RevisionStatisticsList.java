package com.stocks.ApiResponse.stockForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RevisionStatisticsList{

	@JsonProperty("revisionStatistics")
	private Object revisionStatistics;

	public void setRevisionStatistics(Object revisionStatistics){
		this.revisionStatistics = revisionStatistics;
	}

	public Object getRevisionStatistics(){
		return revisionStatistics;
	}
}