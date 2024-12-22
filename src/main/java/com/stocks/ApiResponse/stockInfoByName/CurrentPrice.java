package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentPrice{

	@JsonProperty("NSE")
	private String nSE;

	@JsonProperty("BSE")
	private String bSE;

	public void setNSE(String nSE){
		this.nSE = nSE;
	}

	public String getNSE(){
		return nSE;
	}

	public void setBSE(String bSE){
		this.bSE = bSE;
	}

	public String getBSE(){
		return bSE;
	}
}