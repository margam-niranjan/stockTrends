package com.stocks.ApiResponse.stockForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PredictedSurprise{

	@JsonProperty("unit")
	private Object unit;

	@JsonProperty("isSignificant")
	private Object isSignificant;

	@JsonProperty("value")
	private Object value;

	public void setUnit(Object unit){
		this.unit = unit;
	}

	public Object getUnit(){
		return unit;
	}

	public void setIsSignificant(Object isSignificant){
		this.isSignificant = isSignificant;
	}

	public Object getIsSignificant(){
		return isSignificant;
	}

	public void setValue(Object value){
		this.value = value;
	}

	public Object getValue(){
		return value;
	}
}