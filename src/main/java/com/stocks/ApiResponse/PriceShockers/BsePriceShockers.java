package com.stocks.ApiResponse.PriceShockers;

public class BsePriceShockers {
    private String ticketId;
    private String ric;
    private float price;
    private float percentChange;
    private float netChange;
    private int bid;
    private int ask;
    private float high;
    private float low;
    private float open;
    private float lowCircuitLimit;
    private long volume;
    private String displayName;
    private String date;
    private String time;
    private char priceArrow;
    private float close;
    private int bidSize;
    private int askSize;
    private double averagePrice;
    private int averageVolume;
    private String exchangeType;
    private int lotSize;
    private double deviation;
    private double actualDeviation;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getRic() {
        return ric;
    }

    public void setRic(String ric) {
        this.ric = ric;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(float percentChange) {
        this.percentChange = percentChange;
    }

    public float getNetChange() {
        return netChange;
    }

    public void setNetChange(float netChange) {
        this.netChange = netChange;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getAsk() {
        return ask;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getLowCircuitLimit() {
        return lowCircuitLimit;
    }

    public void setLowCircuitLimit(float lowCircuitLimit) {
        this.lowCircuitLimit = lowCircuitLimit;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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

    public char getPriceArrow() {
        return priceArrow;
    }

    public void setPriceArrow(char priceArrow) {
        this.priceArrow = priceArrow;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public int getBidSize() {
        return bidSize;
    }

    public void setBidSize(int bidSize) {
        this.bidSize = bidSize;
    }

    public int getAskSize() {
        return askSize;
    }

    public void setAskSize(int askSize) {
        this.askSize = askSize;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public int getAverageVolume() {
        return averageVolume;
    }

    public void setAverageVolume(int averageVolume) {
        this.averageVolume = averageVolume;
    }

    public String getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public double getDeviation() {
        return deviation;
    }

    public void setDeviation(double deviation) {
        this.deviation = deviation;
    }

    public double getActualDeviation() {
        return actualDeviation;
    }

    public void setActualDeviation(double actualDeviation) {
        this.actualDeviation = actualDeviation;
    }

    public int getNoOfDaysForAverage() {
        return noOfDaysForAverage;
    }

    public void setNoOfDaysForAverage(int noOfDaysForAverage) {
        this.noOfDaysForAverage = noOfDaysForAverage;
    }

    public String getYearHighDate() {
        return yearHighDate;
    }

    public void setYearHighDate(String yearHighDate) {
        this.yearHighDate = yearHighDate;
    }

    public String getYearLowDate() {
        return yearLowDate;
    }

    public void setYearLowDate(String yearLowDate) {
        this.yearLowDate = yearLowDate;
    }

    public float getTick() {
        return tick;
    }

    public void setTick(float tick) {
        this.tick = tick;
    }

    public float getTotalShareOutstanding() {
        return totalShareOutstanding;
    }

    public void setTotalShareOutstanding(float totalShareOutstanding) {
        this.totalShareOutstanding = totalShareOutstanding;
    }

    public float getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(float marketCap) {
        this.marketCap = marketCap;
    }

    public String getShortTermTrends() {
        return shortTermTrends;
    }

    public void setShortTermTrends(String shortTermTrends) {
        this.shortTermTrends = shortTermTrends;
    }

    public String getLongTermTrends() {
        return longTermTrends;
    }

    public void setLongTermTrends(String longTermTrends) {
        this.longTermTrends = longTermTrends;
    }

    public String getSma() {
        return sma;
    }

    public void setSma(String sma) {
        this.sma = sma;
    }

    public String getBearish() {
        return Bearish;
    }

    public void setBearish(String bearish) {
        Bearish = bearish;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getYhigh() {
        return yhigh;
    }

    public void setYhigh(float yhigh) {
        this.yhigh = yhigh;
    }

    public float getYlow() {
        return ylow;
    }

    public void setYlow(float ylow) {
        this.ylow = ylow;
    }

    private int noOfDaysForAverage;
    private String yearHighDate;
    private String yearLowDate;
    private float tick;
    private float totalShareOutstanding;
    private float marketCap;
    private String shortTermTrends;
    private String longTermTrends;
    private String sma;
    private String Bearish;
    private String description;
    private float yhigh;
    private float ylow;
}
