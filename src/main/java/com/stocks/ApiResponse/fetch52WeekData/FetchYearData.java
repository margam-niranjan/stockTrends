package com.stocks.ApiResponse.fetch52WeekData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FetchYearData{

	@JsonProperty("BSE_52WeekHighLow")
	private BSE52WeekHighLow bSE52WeekHighLow;

	@JsonProperty("NSE_52WeekHighLow")
	private NSE52WeekHighLow nSE52WeekHighLow;

	public void setBSE52WeekHighLow(BSE52WeekHighLow bSE52WeekHighLow){
		this.bSE52WeekHighLow = bSE52WeekHighLow;
	}

	public BSE52WeekHighLow getBSE52WeekHighLow(){
		return bSE52WeekHighLow;
	}

	public void setNSE52WeekHighLow(NSE52WeekHighLow nSE52WeekHighLow){
		this.nSE52WeekHighLow = nSE52WeekHighLow;
	}

	public NSE52WeekHighLow getNSE52WeekHighLow(){
		return nSE52WeekHighLow;
	}
}