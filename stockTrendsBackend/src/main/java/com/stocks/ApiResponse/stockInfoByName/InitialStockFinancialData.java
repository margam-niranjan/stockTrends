package com.stocks.ApiResponse.stockInfoByName;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InitialStockFinancialData{

	@JsonProperty("headers")
	private List<HeadersItem> headers;

	@JsonProperty("data")
	private List<DataItem> data;

	public void setHeaders(List<HeadersItem> headers){
		this.headers = headers;
	}

	public List<HeadersItem> getHeaders(){
		return headers;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}
}