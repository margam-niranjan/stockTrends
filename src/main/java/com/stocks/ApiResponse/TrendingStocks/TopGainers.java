package com.stocks.ApiResponse.TrendingStocks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TopGainers {
    @JsonProperty("ticker_id")
    private String tickerId;

    @JsonProperty("company_name")
    private String companyName;

    @JsonProperty("price")
    private String price;

    @JsonProperty("percent_change")
    private String percentChange;

    @JsonProperty("net_change")
    private String netChange;

    @JsonProperty("bid")
    private String bid;

    @JsonProperty("ask")
    private String ask;

    @JsonProperty("high")
    private String high;

    @JsonProperty("low")
    private String low;

    @JsonProperty("open")
    private String open;

    @JsonProperty("low_circuit_limit")
    private String lowCircuitLimit;

    @JsonProperty("up_circuit_limit")
    private String upCircuitLimit;

    @JsonProperty("volume")
    private String volume;

    @JsonProperty("date")
    private String date;

    @JsonProperty("time")
    private String time;

    @JsonProperty("close")
    private String close;

    @JsonProperty("bid_size")
    private String bidSize;

    @JsonProperty("ask_size")
    private String askSize;

    @JsonProperty("exchange_type")
    private String exchangeType;

    @JsonProperty("lot_size")
    private String lotSize;

    @JsonProperty("year_low")
    private String yearLow;

    @JsonProperty("year_high")
    private String yearHigh;
    @JsonProperty("ric")
    private String ric;

    public String getTickerId() {
        return tickerId;
    }

    public void setTickerId(String tickerId) {
        this.tickerId = tickerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(String percentChange) {
        this.percentChange = percentChange;
    }

    public String getNetChange() {
        return netChange;
    }

    public void setNetChange(String netChange) {
        this.netChange = netChange;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getLowCircuitLimit() {
        return lowCircuitLimit;
    }

    public void setLowCircuitLimit(String lowCircuitLimit) {
        this.lowCircuitLimit = lowCircuitLimit;
    }

    public String getUpCircuitLimit() {
        return upCircuitLimit;
    }

    public void setUpCircuitLimit(String upCircuitLimit) {
        this.upCircuitLimit = upCircuitLimit;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getBidSize() {
        return bidSize;
    }

    public void setBidSize(String bidSize) {
        this.bidSize = bidSize;
    }

    public String getAskSize() {
        return askSize;
    }

    public void setAskSize(String askSize) {
        this.askSize = askSize;
    }

    public String getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
    }

    public String getLotSize() {
        return lotSize;
    }

    public void setLotSize(String lotSize) {
        this.lotSize = lotSize;
    }

    public String getYearLow() {
        return yearLow;
    }

    public void setYearLow(String yearLow) {
        this.yearLow = yearLow;
    }

    public String getYearHigh() {
        return yearHigh;
    }

    public void setYearHigh(String yearHigh) {
        this.yearHigh = yearHigh;
    }

    public String getRic() {
        return ric;
    }

    public void setRic(String ric) {
        this.ric = ric;
    }
}
