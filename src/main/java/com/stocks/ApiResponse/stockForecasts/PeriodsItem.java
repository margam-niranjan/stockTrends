package com.stocks.ApiResponse.stockForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PeriodsItem{

	@JsonProperty("CalendarMonth")
	private int calendarMonth;

	@JsonProperty("CalendarYear")
	private int calendarYear;

	@JsonProperty("ActualReportDate")
	private String actualReportDate;

	@JsonProperty("RelativePeriod")
	private RelativePeriod relativePeriod;

	@JsonProperty("Actuals")
	private Actuals actuals;

	@JsonProperty("Estimates")
	private Object estimates;

	@JsonProperty("EstimateSnapshots")
	private Object estimateSnapshots;

	@JsonProperty("FiscalPeriod")
	private FiscalPeriod fiscalPeriod;

	public void setCalendarMonth(int calendarMonth){
		this.calendarMonth = calendarMonth;
	}

	public int getCalendarMonth(){
		return calendarMonth;
	}

	public void setCalendarYear(int calendarYear){
		this.calendarYear = calendarYear;
	}

	public int getCalendarYear(){
		return calendarYear;
	}

	public void setActualReportDate(String actualReportDate){
		this.actualReportDate = actualReportDate;
	}

	public String getActualReportDate(){
		return actualReportDate;
	}

	public void setRelativePeriod(RelativePeriod relativePeriod){
		this.relativePeriod = relativePeriod;
	}

	public RelativePeriod getRelativePeriod(){
		return relativePeriod;
	}

	public void setActuals(Actuals actuals){
		this.actuals = actuals;
	}

	public Actuals getActuals(){
		return actuals;
	}

	public void setEstimates(Object estimates){
		this.estimates = estimates;
	}

	public Object getEstimates(){
		return estimates;
	}

	public void setEstimateSnapshots(Object estimateSnapshots){
		this.estimateSnapshots = estimateSnapshots;
	}

	public Object getEstimateSnapshots(){
		return estimateSnapshots;
	}

	public void setFiscalPeriod(FiscalPeriod fiscalPeriod){
		this.fiscalPeriod = fiscalPeriod;
	}

	public FiscalPeriod getFiscalPeriod(){
		return fiscalPeriod;
	}
}