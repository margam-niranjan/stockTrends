package com.stocks.ApiResponse.stockForecasts;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Estimates{

	@JsonProperty("Estimate")
	private List<EstimateItem> estimate;

	public void setEstimate(List<EstimateItem> estimate){
		this.estimate = estimate;
	}

	public List<EstimateItem> getEstimate(){
		return estimate;
	}
}