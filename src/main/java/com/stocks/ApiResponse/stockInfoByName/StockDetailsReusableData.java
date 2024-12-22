package com.stocks.ApiResponse.stockInfoByName;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StockDetailsReusableData{

	@JsonProperty("date")
	private String date;

	@JsonProperty("marketCap")
	private String marketCap;

	@JsonProperty("percentChange")
	private String percentChange;

	@JsonProperty("yhigh")
	private String yhigh;

	@JsonProperty("stockAnalyst")
	private List<StockAnalystItem> stockAnalyst;

	@JsonProperty("ylow")
	private String ylow;

	@JsonProperty("FiscalYear")
	private String fiscalYear;

	@JsonProperty("currentDividendYieldCommonStockPrimaryIssueLTM")
	private String currentDividendYieldCommonStockPrimaryIssueLTM;

	@JsonProperty("totalDebtPerTotalEquityMostRecentQuarter")
	private String totalDebtPerTotalEquityMostRecentQuarter;

	@JsonProperty("pPerEBasicExcludingExtraordinaryItemsTTM")
	private String pPerEBasicExcludingExtraordinaryItemsTTM;

	@JsonProperty("interimNetIncome")
	private String interimNetIncome;

	@JsonProperty("sectorPriceToEarningsValueRatio")
	private String sectorPriceToEarningsValueRatio;

	@JsonProperty("price5DayPercentChange")
	private String price5DayPercentChange;

	@JsonProperty("high")
	private String high;

	@JsonProperty("low")
	private String low;

	@JsonProperty("price")
	private String price;

	@JsonProperty("NetIncome")
	private String netIncome;

	@JsonProperty("averageRating")
	private String averageRating;

	@JsonProperty("priceYTDPricePercentChange")
	private String priceYTDPricePercentChange;

	@JsonProperty("time")
	private String time;

	@JsonProperty("close")
	private String close;

	@JsonProperty("peerCompanyList")
	private List<PeerCompanyListItem> peerCompanyList;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setMarketCap(String marketCap){
		this.marketCap = marketCap;
	}

	public String getMarketCap(){
		return marketCap;
	}

	public void setPercentChange(String percentChange){
		this.percentChange = percentChange;
	}

	public String getPercentChange(){
		return percentChange;
	}

	public void setYhigh(String yhigh){
		this.yhigh = yhigh;
	}

	public String getYhigh(){
		return yhigh;
	}

	public void setStockAnalyst(List<StockAnalystItem> stockAnalyst){
		this.stockAnalyst = stockAnalyst;
	}

	public List<StockAnalystItem> getStockAnalyst(){
		return stockAnalyst;
	}

	public void setYlow(String ylow){
		this.ylow = ylow;
	}

	public String getYlow(){
		return ylow;
	}

	public void setFiscalYear(String fiscalYear){
		this.fiscalYear = fiscalYear;
	}

	public String getFiscalYear(){
		return fiscalYear;
	}

	public void setCurrentDividendYieldCommonStockPrimaryIssueLTM(String currentDividendYieldCommonStockPrimaryIssueLTM){
		this.currentDividendYieldCommonStockPrimaryIssueLTM = currentDividendYieldCommonStockPrimaryIssueLTM;
	}

	public String getCurrentDividendYieldCommonStockPrimaryIssueLTM(){
		return currentDividendYieldCommonStockPrimaryIssueLTM;
	}

	public void setTotalDebtPerTotalEquityMostRecentQuarter(String totalDebtPerTotalEquityMostRecentQuarter){
		this.totalDebtPerTotalEquityMostRecentQuarter = totalDebtPerTotalEquityMostRecentQuarter;
	}

	public String getTotalDebtPerTotalEquityMostRecentQuarter(){
		return totalDebtPerTotalEquityMostRecentQuarter;
	}

	public void setPPerEBasicExcludingExtraordinaryItemsTTM(String pPerEBasicExcludingExtraordinaryItemsTTM){
		this.pPerEBasicExcludingExtraordinaryItemsTTM = pPerEBasicExcludingExtraordinaryItemsTTM;
	}

	public String getPPerEBasicExcludingExtraordinaryItemsTTM(){
		return pPerEBasicExcludingExtraordinaryItemsTTM;
	}

	public void setInterimNetIncome(String interimNetIncome){
		this.interimNetIncome = interimNetIncome;
	}

	public String getInterimNetIncome(){
		return interimNetIncome;
	}

	public void setSectorPriceToEarningsValueRatio(String sectorPriceToEarningsValueRatio){
		this.sectorPriceToEarningsValueRatio = sectorPriceToEarningsValueRatio;
	}

	public String getSectorPriceToEarningsValueRatio(){
		return sectorPriceToEarningsValueRatio;
	}

	public void setPrice5DayPercentChange(String price5DayPercentChange){
		this.price5DayPercentChange = price5DayPercentChange;
	}

	public String getPrice5DayPercentChange(){
		return price5DayPercentChange;
	}

	public void setHigh(String high){
		this.high = high;
	}

	public String getHigh(){
		return high;
	}

	public void setLow(String low){
		this.low = low;
	}

	public String getLow(){
		return low;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setNetIncome(String netIncome){
		this.netIncome = netIncome;
	}

	public String getNetIncome(){
		return netIncome;
	}

	public void setAverageRating(String averageRating){
		this.averageRating = averageRating;
	}

	public String getAverageRating(){
		return averageRating;
	}

	public void setPriceYTDPricePercentChange(String priceYTDPricePercentChange){
		this.priceYTDPricePercentChange = priceYTDPricePercentChange;
	}

	public String getPriceYTDPricePercentChange(){
		return priceYTDPricePercentChange;
	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
	}

	public void setClose(String close){
		this.close = close;
	}

	public String getClose(){
		return close;
	}

	public void setPeerCompanyList(List<PeerCompanyListItem> peerCompanyList){
		this.peerCompanyList = peerCompanyList;
	}

	public List<PeerCompanyListItem> getPeerCompanyList(){
		return peerCompanyList;
	}
}