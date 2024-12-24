package com.stocks.ApiResponse.HistoricalStats.balanceSheet;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HistoricalStatsData{

	@JsonProperty("Reserves")
	private Reserves reserves;

	@JsonProperty("Fixed Assets")
	private FixedAssets fixedAssets;

	@JsonProperty("CWIP")
	private CWIP cWIP;

	@JsonProperty("Total Liabilities")
	private TotalLiabilities totalLiabilities;

	@JsonProperty("Investments")
	private Investments investments;

	@JsonProperty("Other Assets")
	private OtherAssets otherAssets;

	@JsonProperty("Borrowings")
	private Borrowings borrowings;

	@JsonProperty("Other Liabilities")
	private OtherLiabilities otherLiabilities;

	@JsonProperty("Total Assets")
	private TotalAssets totalAssets;

	@JsonProperty("Equity Capital")
	private EquityCapital equityCapital;

	public void setReserves(Reserves reserves){
		this.reserves = reserves;
	}

	public Reserves getReserves(){
		return reserves;
	}

	public void setFixedAssets(FixedAssets fixedAssets){
		this.fixedAssets = fixedAssets;
	}

	public FixedAssets getFixedAssets(){
		return fixedAssets;
	}

	public void setCWIP(CWIP cWIP){
		this.cWIP = cWIP;
	}

	public CWIP getCWIP(){
		return cWIP;
	}

	public void setTotalLiabilities(TotalLiabilities totalLiabilities){
		this.totalLiabilities = totalLiabilities;
	}

	public TotalLiabilities getTotalLiabilities(){
		return totalLiabilities;
	}

	public void setInvestments(Investments investments){
		this.investments = investments;
	}

	public Investments getInvestments(){
		return investments;
	}

	public void setOtherAssets(OtherAssets otherAssets){
		this.otherAssets = otherAssets;
	}

	public OtherAssets getOtherAssets(){
		return otherAssets;
	}

	public void setBorrowings(Borrowings borrowings){
		this.borrowings = borrowings;
	}

	public Borrowings getBorrowings(){
		return borrowings;
	}

	public void setOtherLiabilities(OtherLiabilities otherLiabilities){
		this.otherLiabilities = otherLiabilities;
	}

	public OtherLiabilities getOtherLiabilities(){
		return otherLiabilities;
	}

	public void setTotalAssets(TotalAssets totalAssets){
		this.totalAssets = totalAssets;
	}

	public TotalAssets getTotalAssets(){
		return totalAssets;
	}

	public void setEquityCapital(EquityCapital equityCapital){
		this.equityCapital = equityCapital;
	}

	public EquityCapital getEquityCapital(){
		return equityCapital;
	}
}