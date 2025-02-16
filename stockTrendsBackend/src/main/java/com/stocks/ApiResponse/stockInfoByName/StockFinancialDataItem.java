package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockFinancialDataItem{

	@JsonProperty("Type")
	private String type;

	@JsonProperty("FiscalYear")
	private String fiscalYear;

	@JsonProperty("fiscalPeriodNumber")
	private int fiscalPeriodNumber;

	@JsonProperty("stockFinancialMap")
	private StockFinancialMap stockFinancialMap;

	@JsonProperty("StatementDate")
	private String statementDate;

	@JsonProperty("EndDate")
	private String endDate;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setFiscalYear(String fiscalYear){
		this.fiscalYear = fiscalYear;
	}

	public String getFiscalYear(){
		return fiscalYear;
	}

	public void setFiscalPeriodNumber(int fiscalPeriodNumber){
		this.fiscalPeriodNumber = fiscalPeriodNumber;
	}

	public int getFiscalPeriodNumber(){
		return fiscalPeriodNumber;
	}

	public void setStockFinancialMap(StockFinancialMap stockFinancialMap){
		this.stockFinancialMap = stockFinancialMap;
	}

	public StockFinancialMap getStockFinancialMap(){
		return stockFinancialMap;
	}

	public void setStatementDate(String statementDate){
		this.statementDate = statementDate;
	}

	public String getStatementDate(){
		return statementDate;
	}

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}
}