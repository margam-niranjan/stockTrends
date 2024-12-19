package com.stocks.ApiResponse.Commodity;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CommodityData {
    private String id;
    @JsonProperty("messageTime")
    private String messageTime;

    private String product;

    @JsonProperty("expiry")
    private String expiry;

    @JsonProperty("strike_price")
    private int strikePrice;

    @JsonProperty("option_type")
    private String optionType;

    @JsonProperty("buy_quantity")
    private int buyQuantity;

    @JsonProperty("buy_price")
    private float buyPrice;

    @JsonProperty("sell_quantity")
    private int sellQuantity;

    @JsonProperty("sell_price")
    private float sellPrice;

    @JsonProperty("last_traded_price")
    private float lastTradedPrice;

    @JsonProperty("last_traded_quantity")
    private int lastTradedQuantity;

    @JsonProperty("last_traded_time")
    private String lastTradedTime;

    @JsonProperty("average_traded_price")
    private float averageTradedPrice;

    @JsonProperty("total_quantity_traded")
    private int totalQuantityTraded;

    @JsonProperty("open_interest")
    private int openInterest;

    @JsonProperty("open_price")
    private float openPrice;

    @JsonProperty("high_price")
    private float highPrice;

    @JsonProperty("low_price")
    private float lowPrice;

    @JsonProperty("close_price")
    private float closePrice;

    @JsonProperty("total_traded_value")
    private String totalTradedValue;

    @JsonProperty("price_quotation_unit")
    private String priceQuotationUnit;

    @JsonProperty("quotation_lot")
    private int quotationLot;

    @JsonProperty("product_month")
    private String productMonth;

    private int change;

    @JsonProperty("per_change")
    private float perChange;

    @JsonProperty("oiResult")
    private String oiResult;

    public boolean isOiData() {
        return oiData;
    }

    public void setOiData(boolean oiData) {
        this.oiData = oiData;
    }

    public String getOiResult() {
        return oiResult;
    }

    public void setOiResult(String oiResult) {
        this.oiResult = oiResult;
    }

    @JsonProperty("oiData")
    private boolean oiData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public int getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(int strikePrice) {
        this.strikePrice = strikePrice;
    }

    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public int getBuyQuantity() {
        return buyQuantity;
    }

    public void setBuyQuantity(int buyQuantity) {
        this.buyQuantity = buyQuantity;
    }

    public float getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(float buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellQuantity() {
        return sellQuantity;
    }

    public void setSellQuantity(int sellQuantity) {
        this.sellQuantity = sellQuantity;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public float getLastTradedPrice() {
        return lastTradedPrice;
    }

    public void setLastTradedPrice(float lastTradedPrice) {
        this.lastTradedPrice = lastTradedPrice;
    }

    public int getLastTradedQuantity() {
        return lastTradedQuantity;
    }

    public void setLastTradedQuantity(int lastTradedQuantity) {
        this.lastTradedQuantity = lastTradedQuantity;
    }

    public String getLastTradedTime() {
        return lastTradedTime;
    }

    public void setLastTradedTime(String lastTradedTime) {
        this.lastTradedTime = lastTradedTime;
    }

    public float getAverageTradedPrice() {
        return averageTradedPrice;
    }

    public void setAverageTradedPrice(float averageTradedPrice) {
        this.averageTradedPrice = averageTradedPrice;
    }

    public int getTotalQuantityTraded() {
        return totalQuantityTraded;
    }

    public void setTotalQuantityTraded(int totalQuantityTraded) {
        this.totalQuantityTraded = totalQuantityTraded;
    }

    public int getOpenInterest() {
        return openInterest;
    }

    public void setOpenInterest(int openInterest) {
        this.openInterest = openInterest;
    }

    public float getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(float openPrice) {
        this.openPrice = openPrice;
    }

    public float getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(float highPrice) {
        this.highPrice = highPrice;
    }

    public float getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(float lowPrice) {
        this.lowPrice = lowPrice;
    }

    public float getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(float closePrice) {
        this.closePrice = closePrice;
    }

    public String getTotalTradedValue() {
        return totalTradedValue;
    }

    public void setTotalTradedValue(String totalTradedValue) {
        this.totalTradedValue = totalTradedValue;
    }

    public String getPriceQuotationUnit() {
        return priceQuotationUnit;
    }

    public void setPriceQuotationUnit(String priceQuotationUnit) {
        this.priceQuotationUnit = priceQuotationUnit;
    }

    public int getQuotationLot() {
        return quotationLot;
    }

    public void setQuotationLot(int quotationLot) {
        this.quotationLot = quotationLot;
    }

    public String getProductMonth() {
        return productMonth;
    }

    public void setProductMonth(String productMonth) {
        this.productMonth = productMonth;
    }

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public float getPerChange() {
        return perChange;
    }

    public void setPerChange(float perChange) {
        this.perChange = perChange;
    }
}
