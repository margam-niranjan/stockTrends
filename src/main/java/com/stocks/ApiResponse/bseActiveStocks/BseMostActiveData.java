package com.stocks.ApiResponse.bseActiveStocks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BseMostActiveData {

	@JsonProperty("ticker")
	private String ticker;

	@JsonProperty("long_term_trend")
	private String longTermTrend;

	@JsonProperty("low_circuit_limit")
	private Object lowCircuitLimit;

	@JsonProperty("52_week_low")
	private Object jsonMember52WeekLow;

	@JsonProperty("net_change")
	private Object netChange;

	@JsonProperty("volume")
	private int volume;

	@JsonProperty("high")
	private Object high;

	@JsonProperty("up_circuit_limit")
	private Object upCircuitLimit;

	@JsonProperty("low")
	private Object low;

	@JsonProperty("price")
	private Object price;

	@JsonProperty("ask")
	private Object ask;

	@JsonProperty("company")
	private String company;

	@JsonProperty("overall_rating")
	private String overallRating;

	@JsonProperty("52_week_high")
	private Object jsonMember52WeekHigh;

	@JsonProperty("bid")
	private Object bid;

	@JsonProperty("percent_change")
	private Object percentChange;

	@JsonProperty("close")
	private Object close;

	@JsonProperty("open")
	private Object open;

	@JsonProperty("short_term_trend")
	private String shortTermTrend;

	public void setTicker(String ticker){
		this.ticker = ticker;
	}

	public String getTicker(){
		return ticker;
	}

	public void setLongTermTrend(String longTermTrend){
		this.longTermTrend = longTermTrend;
	}

	public String getLongTermTrend(){
		return longTermTrend;
	}

	public void setLowCircuitLimit(Object lowCircuitLimit){
		this.lowCircuitLimit = lowCircuitLimit;
	}

	public Object getLowCircuitLimit(){
		return lowCircuitLimit;
	}

	public void setJsonMember52WeekLow(Object jsonMember52WeekLow){
		this.jsonMember52WeekLow = jsonMember52WeekLow;
	}

	public Object getJsonMember52WeekLow(){
		return jsonMember52WeekLow;
	}

	public void setNetChange(Object netChange){
		this.netChange = netChange;
	}

	public Object getNetChange(){
		return netChange;
	}

	public void setVolume(int volume){
		this.volume = volume;
	}

	public int getVolume(){
		return volume;
	}

	public void setHigh(Object high){
		this.high = high;
	}

	public Object getHigh(){
		return high;
	}

	public void setUpCircuitLimit(Object upCircuitLimit){
		this.upCircuitLimit = upCircuitLimit;
	}

	public Object getUpCircuitLimit(){
		return upCircuitLimit;
	}

	public void setLow(Object low){
		this.low = low;
	}

	public Object getLow(){
		return low;
	}

	public void setPrice(Object price){
		this.price = price;
	}

	public Object getPrice(){
		return price;
	}

	public void setAsk(Object ask){
		this.ask = ask;
	}

	public Object getAsk(){
		return ask;
	}

	public void setCompany(String company){
		this.company = company;
	}

	public String getCompany(){
		return company;
	}

	public void setOverallRating(String overallRating){
		this.overallRating = overallRating;
	}

	public String getOverallRating(){
		return overallRating;
	}

	public void setJsonMember52WeekHigh(Object jsonMember52WeekHigh){
		this.jsonMember52WeekHigh = jsonMember52WeekHigh;
	}

	public Object getJsonMember52WeekHigh(){
		return jsonMember52WeekHigh;
	}

	public void setBid(Object bid){
		this.bid = bid;
	}

	public Object getBid(){
		return bid;
	}

	public void setPercentChange(Object percentChange){
		this.percentChange = percentChange;
	}

	public Object getPercentChange(){
		return percentChange;
	}

	public void setClose(Object close){
		this.close = close;
	}

	public Object getClose(){
		return close;
	}

	public void setOpen(Object open){
		this.open = open;
	}

	public Object getOpen(){
		return open;
	}

	public void setShortTermTrend(String shortTermTrend){
		this.shortTermTrend = shortTermTrend;
	}

	public String getShortTermTrend(){
		return shortTermTrend;
	}
}