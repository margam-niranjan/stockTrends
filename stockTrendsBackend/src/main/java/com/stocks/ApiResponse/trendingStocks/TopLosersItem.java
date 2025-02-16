package com.stocks.ApiResponse.trendingStocks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TopLosersItem{

	@JsonProperty("date")
	private String date;

	@JsonProperty("ask_size")
	private String askSize;

	@JsonProperty("low_circuit_limit")
	private String lowCircuitLimit;

	@JsonProperty("exchange_type")
	private String exchangeType;

	@JsonProperty("ric")
	private String ric;

	@JsonProperty("net_change")
	private String netChange;

	@JsonProperty("long_term_trends")
	private String longTermTrends;

	@JsonProperty("high")
	private String high;

	@JsonProperty("low")
	private String low;

	@JsonProperty("price")
	private String price;

	@JsonProperty("lot_size")
	private String lotSize;

	@JsonProperty("percent_change")
	private String percentChange;

	@JsonProperty("close")
	private String close;

	@JsonProperty("short_term_trends")
	private String shortTermTrends;

	@JsonProperty("year_low")
	private String yearLow;

	@JsonProperty("volume")
	private String volume;

	@JsonProperty("ticker_id")
	private String tickerId;

	@JsonProperty("up_circuit_limit")
	private String upCircuitLimit;

	@JsonProperty("bid_size")
	private String bidSize;

	@JsonProperty("company_name")
	private String companyName;

	@JsonProperty("ask")
	private String ask;

	@JsonProperty("time")
	private String time;

	@JsonProperty("overall_rating")
	private String overallRating;

	@JsonProperty("year_high")
	private String yearHigh;

	@JsonProperty("bid")
	private String bid;

	@JsonProperty("open")
	private String open;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setAskSize(String askSize){
		this.askSize = askSize;
	}

	public String getAskSize(){
		return askSize;
	}

	public void setLowCircuitLimit(String lowCircuitLimit){
		this.lowCircuitLimit = lowCircuitLimit;
	}

	public String getLowCircuitLimit(){
		return lowCircuitLimit;
	}

	public void setExchangeType(String exchangeType){
		this.exchangeType = exchangeType;
	}

	public String getExchangeType(){
		return exchangeType;
	}

	public void setRic(String ric){
		this.ric = ric;
	}

	public String getRic(){
		return ric;
	}

	public void setNetChange(String netChange){
		this.netChange = netChange;
	}

	public String getNetChange(){
		return netChange;
	}

	public void setLongTermTrends(String longTermTrends){
		this.longTermTrends = longTermTrends;
	}

	public String getLongTermTrends(){
		return longTermTrends;
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

	public void setLotSize(String lotSize){
		this.lotSize = lotSize;
	}

	public String getLotSize(){
		return lotSize;
	}

	public void setPercentChange(String percentChange){
		this.percentChange = percentChange;
	}

	public String getPercentChange(){
		return percentChange;
	}

	public void setClose(String close){
		this.close = close;
	}

	public String getClose(){
		return close;
	}

	public void setShortTermTrends(String shortTermTrends){
		this.shortTermTrends = shortTermTrends;
	}

	public String getShortTermTrends(){
		return shortTermTrends;
	}

	public void setYearLow(String yearLow){
		this.yearLow = yearLow;
	}

	public String getYearLow(){
		return yearLow;
	}

	public void setVolume(String volume){
		this.volume = volume;
	}

	public String getVolume(){
		return volume;
	}

	public void setTickerId(String tickerId){
		this.tickerId = tickerId;
	}

	public String getTickerId(){
		return tickerId;
	}

	public void setUpCircuitLimit(String upCircuitLimit){
		this.upCircuitLimit = upCircuitLimit;
	}

	public String getUpCircuitLimit(){
		return upCircuitLimit;
	}

	public void setBidSize(String bidSize){
		this.bidSize = bidSize;
	}

	public String getBidSize(){
		return bidSize;
	}

	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	public String getCompanyName(){
		return companyName;
	}

	public void setAsk(String ask){
		this.ask = ask;
	}

	public String getAsk(){
		return ask;
	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
	}

	public void setOverallRating(String overallRating){
		this.overallRating = overallRating;
	}

	public String getOverallRating(){
		return overallRating;
	}

	public void setYearHigh(String yearHigh){
		this.yearHigh = yearHigh;
	}

	public String getYearHigh(){
		return yearHigh;
	}

	public void setBid(String bid){
		this.bid = bid;
	}

	public String getBid(){
		return bid;
	}

	public void setOpen(String open){
		this.open = open;
	}

	public String getOpen(){
		return open;
	}
}