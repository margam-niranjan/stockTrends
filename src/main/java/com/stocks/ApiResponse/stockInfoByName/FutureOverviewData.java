package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FutureOverviewData{

	@JsonProperty("date")
	private String date;

	@JsonProperty("lowCircuitLimit")
	private String lowCircuitLimit;

	@JsonProperty("yhigh")
	private String yhigh;

	@JsonProperty("spotPrice")
	private String spotPrice;

	@JsonProperty("ylow")
	private String ylow;

	@JsonProperty("openInterest")
	private String openInterest;

	@JsonProperty("futureDateType")
	private String futureDateType;

	@JsonProperty("displayName")
	private String displayName;

	@JsonProperty("noOfDaysForAverage")
	private String noOfDaysForAverage;

	@JsonProperty("vwap")
	private String vwap;

	@JsonProperty("openPrice")
	private String openPrice;

	@JsonProperty("exchangeType")
	private String exchangeType;

	@JsonProperty("turnOver")
	private String turnOver;

	@JsonProperty("prevClose")
	private String prevClose;

	@JsonProperty("expiryDate")
	private String expiryDate;

	@JsonProperty("masterRic")
	private String masterRic;

	@JsonProperty("high")
	private String high;

	@JsonProperty("yearHighDate")
	private String yearHighDate;

	@JsonProperty("yearLowDate")
	private String yearLowDate;

	@JsonProperty("low")
	private String low;

	@JsonProperty("lowPrice")
	private String lowPrice;

	@JsonProperty("price")
	private String price;

	@JsonProperty("highPrice")
	private String highPrice;

	@JsonProperty("upCircuitLimit")
	private String upCircuitLimit;

	@JsonProperty("close")
	private String close;

	@JsonProperty("askSize")
	private String askSize;

	@JsonProperty("netChange")
	private String netChange;

	@JsonProperty("percentChange")
	private String percentChange;

	@JsonProperty("priceArrow")
	private String priceArrow;

	@JsonProperty("marketLot")
	private String marketLot;

	@JsonProperty("rollOverCost")
	private String rollOverCost;

	@JsonProperty("bidSize")
	private String bidSize;

	@JsonProperty("lotSize")
	private String lotSize;

	@JsonProperty("noOfContractTraded")
	private String noOfContractTraded;

	@JsonProperty("deviation")
	private String deviation;

	@JsonProperty("actualDeviation")
	private String actualDeviation;

	@JsonProperty("tick")
	private String tick;

	@JsonProperty("volume")
	private String volume;

	@JsonProperty("openInterestChange")
	private String openInterestChange;

	@JsonProperty("averageVolume")
	private String averageVolume;

	@JsonProperty("rollOverPercentage")
	private String rollOverPercentage;

	@JsonProperty("ask")
	private String ask;

	@JsonProperty("time")
	private String time;

	@JsonProperty("averagePrice")
	private String averagePrice;

	@JsonProperty("openIntPercentageChange")
	private String openIntPercentageChange;

	@JsonProperty("tickerId")
	private String tickerId;

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

	public void setLowCircuitLimit(String lowCircuitLimit){
		this.lowCircuitLimit = lowCircuitLimit;
	}

	public String getLowCircuitLimit(){
		return lowCircuitLimit;
	}

	public void setYhigh(String yhigh){
		this.yhigh = yhigh;
	}

	public String getYhigh(){
		return yhigh;
	}

	public void setSpotPrice(String spotPrice){
		this.spotPrice = spotPrice;
	}

	public String getSpotPrice(){
		return spotPrice;
	}

	public void setYlow(String ylow){
		this.ylow = ylow;
	}

	public String getYlow(){
		return ylow;
	}

	public void setOpenInterest(String openInterest){
		this.openInterest = openInterest;
	}

	public String getOpenInterest(){
		return openInterest;
	}

	public void setFutureDateType(String futureDateType){
		this.futureDateType = futureDateType;
	}

	public String getFutureDateType(){
		return futureDateType;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setNoOfDaysForAverage(String noOfDaysForAverage){
		this.noOfDaysForAverage = noOfDaysForAverage;
	}

	public String getNoOfDaysForAverage(){
		return noOfDaysForAverage;
	}

	public void setVwap(String vwap){
		this.vwap = vwap;
	}

	public String getVwap(){
		return vwap;
	}

	public void setOpenPrice(String openPrice){
		this.openPrice = openPrice;
	}

	public String getOpenPrice(){
		return openPrice;
	}

	public void setExchangeType(String exchangeType){
		this.exchangeType = exchangeType;
	}

	public String getExchangeType(){
		return exchangeType;
	}

	public void setTurnOver(String turnOver){
		this.turnOver = turnOver;
	}

	public String getTurnOver(){
		return turnOver;
	}

	public void setPrevClose(String prevClose){
		this.prevClose = prevClose;
	}

	public String getPrevClose(){
		return prevClose;
	}

	public void setExpiryDate(String expiryDate){
		this.expiryDate = expiryDate;
	}

	public String getExpiryDate(){
		return expiryDate;
	}

	public void setMasterRic(String masterRic){
		this.masterRic = masterRic;
	}

	public String getMasterRic(){
		return masterRic;
	}

	public void setHigh(String high){
		this.high = high;
	}

	public String getHigh(){
		return high;
	}

	public void setYearHighDate(String yearHighDate){
		this.yearHighDate = yearHighDate;
	}

	public String getYearHighDate(){
		return yearHighDate;
	}

	public void setYearLowDate(String yearLowDate){
		this.yearLowDate = yearLowDate;
	}

	public String getYearLowDate(){
		return yearLowDate;
	}

	public void setLow(String low){
		this.low = low;
	}

	public String getLow(){
		return low;
	}

	public void setLowPrice(String lowPrice){
		this.lowPrice = lowPrice;
	}

	public String getLowPrice(){
		return lowPrice;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setHighPrice(String highPrice){
		this.highPrice = highPrice;
	}

	public String getHighPrice(){
		return highPrice;
	}

	public void setUpCircuitLimit(String upCircuitLimit){
		this.upCircuitLimit = upCircuitLimit;
	}

	public String getUpCircuitLimit(){
		return upCircuitLimit;
	}

	public void setClose(String close){
		this.close = close;
	}

	public String getClose(){
		return close;
	}

	public void setAskSize(String askSize){
		this.askSize = askSize;
	}

	public String getAskSize(){
		return askSize;
	}

	public void setNetChange(String netChange){
		this.netChange = netChange;
	}

	public String getNetChange(){
		return netChange;
	}

	public void setPercentChange(String percentChange){
		this.percentChange = percentChange;
	}

	public String getPercentChange(){
		return percentChange;
	}

	public void setPriceArrow(String priceArrow){
		this.priceArrow = priceArrow;
	}

	public String getPriceArrow(){
		return priceArrow;
	}

	public void setMarketLot(String marketLot){
		this.marketLot = marketLot;
	}

	public String getMarketLot(){
		return marketLot;
	}

	public void setRollOverCost(String rollOverCost){
		this.rollOverCost = rollOverCost;
	}

	public String getRollOverCost(){
		return rollOverCost;
	}

	public void setBidSize(String bidSize){
		this.bidSize = bidSize;
	}

	public String getBidSize(){
		return bidSize;
	}

	public void setLotSize(String lotSize){
		this.lotSize = lotSize;
	}

	public String getLotSize(){
		return lotSize;
	}

	public void setNoOfContractTraded(String noOfContractTraded){
		this.noOfContractTraded = noOfContractTraded;
	}

	public String getNoOfContractTraded(){
		return noOfContractTraded;
	}

	public void setDeviation(String deviation){
		this.deviation = deviation;
	}

	public String getDeviation(){
		return deviation;
	}

	public void setActualDeviation(String actualDeviation){
		this.actualDeviation = actualDeviation;
	}

	public String getActualDeviation(){
		return actualDeviation;
	}

	public void setTick(String tick){
		this.tick = tick;
	}

	public String getTick(){
		return tick;
	}

	public void setVolume(String volume){
		this.volume = volume;
	}

	public String getVolume(){
		return volume;
	}

	public void setOpenInterestChange(String openInterestChange){
		this.openInterestChange = openInterestChange;
	}

	public String getOpenInterestChange(){
		return openInterestChange;
	}

	public void setAverageVolume(String averageVolume){
		this.averageVolume = averageVolume;
	}

	public String getAverageVolume(){
		return averageVolume;
	}

	public void setRollOverPercentage(String rollOverPercentage){
		this.rollOverPercentage = rollOverPercentage;
	}

	public String getRollOverPercentage(){
		return rollOverPercentage;
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

	public void setAveragePrice(String averagePrice){
		this.averagePrice = averagePrice;
	}

	public String getAveragePrice(){
		return averagePrice;
	}

	public void setOpenIntPercentageChange(String openIntPercentageChange){
		this.openIntPercentageChange = openIntPercentageChange;
	}

	public String getOpenIntPercentageChange(){
		return openIntPercentageChange;
	}

	public void setTickerId(String tickerId){
		this.tickerId = tickerId;
	}

	public String getTickerId(){
		return tickerId;
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