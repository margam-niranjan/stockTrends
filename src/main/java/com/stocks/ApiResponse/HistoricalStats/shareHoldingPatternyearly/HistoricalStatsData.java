package com.stocks.ApiResponse.HistoricalStats.shareHoldingPatternyearly;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HistoricalStatsData{

	@JsonProperty("Government")
	private Government government;

	@JsonProperty("No. of Shareholders")
	private NoOfShareholders noOfShareholders;

	@JsonProperty("Public")
	private Public public;

	@JsonProperty("FIIs")
	private FIIs fIIs;

	@JsonProperty("Promoters")
	private Promoters promoters;

	@JsonProperty("DIIs")
	private DIIs dIIs;

	public void setGovernment(Government government){
		this.government = government;
	}

	public Government getGovernment(){
		return government;
	}

	public void setNoOfShareholders(NoOfShareholders noOfShareholders){
		this.noOfShareholders = noOfShareholders;
	}

	public NoOfShareholders getNoOfShareholders(){
		return noOfShareholders;
	}

	public void setPublic(Public public){
		this.public = public;
	}

	public Public getPublic(){
		return public;
	}

	public void setFIIs(FIIs fIIs){
		this.fIIs = fIIs;
	}

	public FIIs getFIIs(){
		return fIIs;
	}

	public void setPromoters(Promoters promoters){
		this.promoters = promoters;
	}

	public Promoters getPromoters(){
		return promoters;
	}

	public void setDIIs(DIIs dIIs){
		this.dIIs = dIIs;
	}

	public DIIs getDIIs(){
		return dIIs;
	}
}