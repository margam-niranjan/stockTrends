package com.stocks.ApiResponse.stockForecasts;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StockForecastsData{

	@JsonProperty("measureCode")
	private String measureCode;

	@JsonProperty("periods")
	private List<PeriodsItem> periods;

	@JsonProperty("measureName")
	private String measureName;

	public void setMeasureCode(String measureCode){
		this.measureCode = measureCode;
	}

	public String getMeasureCode(){
		return measureCode;
	}

	public void setPeriods(List<PeriodsItem> periods){
		this.periods = periods;
	}

	public List<PeriodsItem> getPeriods(){
		return periods;
	}

	public void setMeasureName(String measureName){
		this.measureName = measureName;
	}

	public String getMeasureName(){
		return measureName;
	}
}