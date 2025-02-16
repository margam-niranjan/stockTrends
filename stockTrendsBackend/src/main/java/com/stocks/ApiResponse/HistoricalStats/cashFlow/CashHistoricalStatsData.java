package com.stocks.ApiResponse.HistoricalStats.cashFlow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CashHistoricalStatsData {

	@JsonProperty("Cash from Operating Activity")
	private CashFromOperatingActivity cashFromOperatingActivity;

	@JsonProperty("Cash from Investing Activity")
	private CashFromInvestingActivity cashFromInvestingActivity;

	@JsonProperty("Net Cash Flow")
	private NetCashFlow netCashFlow;

	@JsonProperty("Cash from Financing Activity")
	private CashFromFinancingActivity cashFromFinancingActivity;

	public void setCashFromOperatingActivity(CashFromOperatingActivity cashFromOperatingActivity){
		this.cashFromOperatingActivity = cashFromOperatingActivity;
	}

	public CashFromOperatingActivity getCashFromOperatingActivity(){
		return cashFromOperatingActivity;
	}

	public void setCashFromInvestingActivity(CashFromInvestingActivity cashFromInvestingActivity){
		this.cashFromInvestingActivity = cashFromInvestingActivity;
	}

	public CashFromInvestingActivity getCashFromInvestingActivity(){
		return cashFromInvestingActivity;
	}

	public void setNetCashFlow(NetCashFlow netCashFlow){
		this.netCashFlow = netCashFlow;
	}

	public NetCashFlow getNetCashFlow(){
		return netCashFlow;
	}

	public void setCashFromFinancingActivity(CashFromFinancingActivity cashFromFinancingActivity){
		this.cashFromFinancingActivity = cashFromFinancingActivity;
	}

	public CashFromFinancingActivity getCashFromFinancingActivity(){
		return cashFromFinancingActivity;
	}
}