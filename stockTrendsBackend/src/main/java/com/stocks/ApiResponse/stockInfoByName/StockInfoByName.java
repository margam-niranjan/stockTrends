package com.stocks.ApiResponse.stockInfoByName;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StockInfoByName{

	@JsonProperty("yearLow")
	private String yearLow;

	@JsonProperty("financials")
	private List<FinancialsItem> financials;

	@JsonProperty("futureOverviewData")
	private FutureOverviewData futureOverviewData;

	@JsonProperty("percentChange")
	private String percentChange;

	@JsonProperty("recosBar")
	private RecosBar recosBar;

	@JsonProperty("stockFinancialData")
	private List<StockFinancialDataItem> stockFinancialData;

	@JsonProperty("companyName")
	private String companyName;

	@JsonProperty("shareholding")
	private List<ShareholdingItem> shareholding;

	@JsonProperty("currentPrice")
	private CurrentPrice currentPrice;

	@JsonProperty("industry")
	private String industry;

	@JsonProperty("stockDetailsReusableData")
	private StockDetailsReusableData stockDetailsReusableData;

	@JsonProperty("yearHigh")
	private String yearHigh;

	@JsonProperty("futureExpiryDates")
	private List<String> futureExpiryDates;

	@JsonProperty("recentNews")
	private List<RecentNewsItem> recentNews;

	@JsonProperty("keyMetrics")
	private KeyMetrics keyMetrics;

	@JsonProperty("initialStockFinancialData")
	private InitialStockFinancialData initialStockFinancialData;

	@JsonProperty("analystView")
	private List<AnalystViewItem> analystView;

	@JsonProperty("companyProfile")
	private CompanyProfile companyProfile;

	@JsonProperty("stockCorporateActionData")
	private StockCorporateActionData stockCorporateActionData;

	@JsonProperty("stockTechnicalData")
	private List<StockTechnicalDataItem> stockTechnicalData;

	@JsonProperty("riskMeter")
	private RiskMeter riskMeter;

	public void setYearLow(String yearLow){
		this.yearLow = yearLow;
	}

	public String getYearLow(){
		return yearLow;
	}

	public void setFinancials(List<FinancialsItem> financials){
		this.financials = financials;
	}

	public List<FinancialsItem> getFinancials(){
		return financials;
	}

	public void setFutureOverviewData(FutureOverviewData futureOverviewData){
		this.futureOverviewData = futureOverviewData;
	}

	public FutureOverviewData getFutureOverviewData(){
		return futureOverviewData;
	}

	public void setPercentChange(String percentChange){
		this.percentChange = percentChange;
	}

	public String getPercentChange(){
		return percentChange;
	}

	public void setRecosBar(RecosBar recosBar){
		this.recosBar = recosBar;
	}

	public RecosBar getRecosBar(){
		return recosBar;
	}

	public void setStockFinancialData(List<StockFinancialDataItem> stockFinancialData){
		this.stockFinancialData = stockFinancialData;
	}

	public List<StockFinancialDataItem> getStockFinancialData(){
		return stockFinancialData;
	}

	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	public String getCompanyName(){
		return companyName;
	}

	public void setShareholding(List<ShareholdingItem> shareholding){
		this.shareholding = shareholding;
	}

	public List<ShareholdingItem> getShareholding(){
		return shareholding;
	}

	public void setCurrentPrice(CurrentPrice currentPrice){
		this.currentPrice = currentPrice;
	}

	public CurrentPrice getCurrentPrice(){
		return currentPrice;
	}

	public void setIndustry(String industry){
		this.industry = industry;
	}

	public String getIndustry(){
		return industry;
	}

	public void setStockDetailsReusableData(StockDetailsReusableData stockDetailsReusableData){
		this.stockDetailsReusableData = stockDetailsReusableData;
	}

	public StockDetailsReusableData getStockDetailsReusableData(){
		return stockDetailsReusableData;
	}

	public void setYearHigh(String yearHigh){
		this.yearHigh = yearHigh;
	}

	public String getYearHigh(){
		return yearHigh;
	}

	public void setFutureExpiryDates(List<String> futureExpiryDates){
		this.futureExpiryDates = futureExpiryDates;
	}

	public List<String> getFutureExpiryDates(){
		return futureExpiryDates;
	}

	public void setRecentNews(List<RecentNewsItem> recentNews){
		this.recentNews = recentNews;
	}

	public List<RecentNewsItem> getRecentNews(){
		return recentNews;
	}

	public void setKeyMetrics(KeyMetrics keyMetrics){
		this.keyMetrics = keyMetrics;
	}

	public KeyMetrics getKeyMetrics(){
		return keyMetrics;
	}

	public void setInitialStockFinancialData(InitialStockFinancialData initialStockFinancialData){
		this.initialStockFinancialData = initialStockFinancialData;
	}

	public InitialStockFinancialData getInitialStockFinancialData(){
		return initialStockFinancialData;
	}

	public void setAnalystView(List<AnalystViewItem> analystView){
		this.analystView = analystView;
	}

	public List<AnalystViewItem> getAnalystView(){
		return analystView;
	}

	public void setCompanyProfile(CompanyProfile companyProfile){
		this.companyProfile = companyProfile;
	}

	public CompanyProfile getCompanyProfile(){
		return companyProfile;
	}

	public void setStockCorporateActionData(StockCorporateActionData stockCorporateActionData){
		this.stockCorporateActionData = stockCorporateActionData;
	}

	public StockCorporateActionData getStockCorporateActionData(){
		return stockCorporateActionData;
	}

	public void setStockTechnicalData(List<StockTechnicalDataItem> stockTechnicalData){
		this.stockTechnicalData = stockTechnicalData;
	}

	public List<StockTechnicalDataItem> getStockTechnicalData(){
		return stockTechnicalData;
	}

	public void setRiskMeter(RiskMeter riskMeter){
		this.riskMeter = riskMeter;
	}

	public RiskMeter getRiskMeter(){
		return riskMeter;
	}
}