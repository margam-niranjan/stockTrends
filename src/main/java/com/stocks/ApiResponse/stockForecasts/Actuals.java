package com.stocks.ApiResponse.stockForecasts;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Actuals{

	@JsonProperty("Actual")
	private List<ActualItem> actual;

	public void setActual(List<ActualItem> actual){
		this.actual = actual;
	}

	public List<ActualItem> getActual(){
		return actual;
	}
}