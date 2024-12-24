package com.stocks.ApiResponse.HistoricalStats.ratios;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HistoricalStatsData{

	@JsonProperty("Debtor Days")
	private DebtorDays debtorDays;

	@JsonProperty("ROCE %")
	private ROCE rOCE;

	@JsonProperty("Working Capital Days")
	private WorkingCapitalDays workingCapitalDays;

	@JsonProperty("Cash Conversion Cycle")
	private CashConversionCycle cashConversionCycle;

	public void setDebtorDays(DebtorDays debtorDays){
		this.debtorDays = debtorDays;
	}

	public DebtorDays getDebtorDays(){
		return debtorDays;
	}

	public void setROCE(ROCE rOCE){
		this.rOCE = rOCE;
	}

	public ROCE getROCE(){
		return rOCE;
	}

	public void setWorkingCapitalDays(WorkingCapitalDays workingCapitalDays){
		this.workingCapitalDays = workingCapitalDays;
	}

	public WorkingCapitalDays getWorkingCapitalDays(){
		return workingCapitalDays;
	}

	public void setCashConversionCycle(CashConversionCycle cashConversionCycle){
		this.cashConversionCycle = cashConversionCycle;
	}

	public CashConversionCycle getCashConversionCycle(){
		return cashConversionCycle;
	}
}