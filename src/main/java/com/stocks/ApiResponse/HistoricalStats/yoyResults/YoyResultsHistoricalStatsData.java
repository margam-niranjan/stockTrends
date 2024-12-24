package com.stocks.ApiResponse.HistoricalStats.yoyResults;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YoyResultsHistoricalStatsData {

	@JsonProperty("Interest")
	private Interest interest;

	@JsonProperty("Dividend Payout %")
	private DividendPayout dividendPayout;

	@JsonProperty("Operating Profit")
	private OperatingProfit operatingProfit;

	@JsonProperty("Depreciation")
	private Depreciation depreciation;

	@JsonProperty("Sales")
	private Sales sales;

	@JsonProperty("Expenses")
	private Expenses expenses;

	@JsonProperty("Profit before tax")
	private ProfitBeforeTax profitBeforeTax;

	@JsonProperty("Net Profit")
	private NetProfit netProfit;

	@JsonProperty("Other Income")
	private OtherIncome otherIncome;

	@JsonProperty("Tax %")
	private Tax tax;

	@JsonProperty("EPS in Rs")
	private EPSInRs ePSInRs;

	@JsonProperty("OPM %")
	private OPM oPM;

	public void setInterest(Interest interest){
		this.interest = interest;
	}

	public Interest getInterest(){
		return interest;
	}

	public void setDividendPayout(DividendPayout dividendPayout){
		this.dividendPayout = dividendPayout;
	}

	public DividendPayout getDividendPayout(){
		return dividendPayout;
	}

	public void setOperatingProfit(OperatingProfit operatingProfit){
		this.operatingProfit = operatingProfit;
	}

	public OperatingProfit getOperatingProfit(){
		return operatingProfit;
	}

	public void setDepreciation(Depreciation depreciation){
		this.depreciation = depreciation;
	}

	public Depreciation getDepreciation(){
		return depreciation;
	}

	public void setSales(Sales sales){
		this.sales = sales;
	}

	public Sales getSales(){
		return sales;
	}

	public void setExpenses(Expenses expenses){
		this.expenses = expenses;
	}

	public Expenses getExpenses(){
		return expenses;
	}

	public void setProfitBeforeTax(ProfitBeforeTax profitBeforeTax){
		this.profitBeforeTax = profitBeforeTax;
	}

	public ProfitBeforeTax getProfitBeforeTax(){
		return profitBeforeTax;
	}

	public void setNetProfit(NetProfit netProfit){
		this.netProfit = netProfit;
	}

	public NetProfit getNetProfit(){
		return netProfit;
	}

	public void setOtherIncome(OtherIncome otherIncome){
		this.otherIncome = otherIncome;
	}

	public OtherIncome getOtherIncome(){
		return otherIncome;
	}

	public void setTax(Tax tax){
		this.tax = tax;
	}

	public Tax getTax(){
		return tax;
	}

	public void setEPSInRs(EPSInRs ePSInRs){
		this.ePSInRs = ePSInRs;
	}

	public EPSInRs getEPSInRs(){
		return ePSInRs;
	}

	public void setOPM(OPM oPM){
		this.oPM = oPM;
	}

	public OPM getOPM(){
		return oPM;
	}
}