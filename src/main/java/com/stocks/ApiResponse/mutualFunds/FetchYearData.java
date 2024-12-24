package com.stocks.ApiResponse.mutualFunds;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FetchYearData{

	@JsonProperty("Debt")
	private Debt debt;

	@JsonProperty("Solutions Oriented")
	private SolutionsOriented solutionsOriented;

	@JsonProperty("Equity")
	private Equity equity;

	@JsonProperty("Hybrid")
	private Hybrid hybrid;

	@JsonProperty("Global Fund of Funds")
	private GlobalFundOfFunds globalFundOfFunds;

	@JsonProperty("Index Funds")
	private IndexFunds indexFunds;

	@JsonProperty("Other")
	private Other other;

	public void setDebt(Debt debt){
		this.debt = debt;
	}

	public Debt getDebt(){
		return debt;
	}

	public void setSolutionsOriented(SolutionsOriented solutionsOriented){
		this.solutionsOriented = solutionsOriented;
	}

	public SolutionsOriented getSolutionsOriented(){
		return solutionsOriented;
	}

	public void setEquity(Equity equity){
		this.equity = equity;
	}

	public Equity getEquity(){
		return equity;
	}

	public void setHybrid(Hybrid hybrid){
		this.hybrid = hybrid;
	}

	public Hybrid getHybrid(){
		return hybrid;
	}

	public void setGlobalFundOfFunds(GlobalFundOfFunds globalFundOfFunds){
		this.globalFundOfFunds = globalFundOfFunds;
	}

	public GlobalFundOfFunds getGlobalFundOfFunds(){
		return globalFundOfFunds;
	}

	public void setIndexFunds(IndexFunds indexFunds){
		this.indexFunds = indexFunds;
	}

	public IndexFunds getIndexFunds(){
		return indexFunds;
	}

	public void setOther(Other other){
		this.other = other;
	}

	public Other getOther(){
		return other;
	}
}