package com.stocks.ApiResponse.Commodity;

import java.time.LocalDateTime;
import java.time.YearMonth;

public class CommodityData {
    private String id;
    private LocalDateTime messageTime;
    private String product;
    private LocalDateTime expiry ;
    private int strike_price;
    private String option_type;
    private int  buy_quantity;
    private float buy_price;
    private int sell_quantity;
    private float sell_price;
    private float last_traded_price;
    private int last_traded_quantity;
    private LocalDateTime last_traded_time;
    private float  average_traded_price;
    private int total_quantity_traded;
    private int open_interest;
    private float open_price;
    private float high_price;
    private float low_price;
    private float close_price;
    private String total_traded_value;
    private String price_quotation_unit;
    private int quotation_lot;
    private YearMonth product_month;
    private  int change;
    private  Long  per_change;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(LocalDateTime messageTime) {
        this.messageTime = messageTime;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public LocalDateTime getExpiry() {
        return expiry;
    }

    public void setExpiry(LocalDateTime expiry) {
        this.expiry = expiry;
    }

    public int getStrike_price() {
        return strike_price;
    }

    public void setStrike_price(int strike_price) {
        this.strike_price = strike_price;
    }

    public String getOption_type() {
        return option_type;
    }

    public void setOption_type(String option_type) {
        this.option_type = option_type;
    }

    public int getBuy_quantity() {
        return buy_quantity;
    }

    public void setBuy_quantity(int buy_quantity) {
        this.buy_quantity = buy_quantity;
    }

    public float getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(float buy_price) {
        this.buy_price = buy_price;
    }

    public int getSell_quantity() {
        return sell_quantity;
    }

    public void setSell_quantity(int sell_quantity) {
        this.sell_quantity = sell_quantity;
    }

    public float getSell_price() {
        return sell_price;
    }

    public void setSell_price(float sell_price) {
        this.sell_price = sell_price;
    }

    public float getLast_traded_price() {
        return last_traded_price;
    }

    public void setLast_traded_price(float last_traded_price) {
        this.last_traded_price = last_traded_price;
    }

    public int getLast_traded_quantity() {
        return last_traded_quantity;
    }

    public void setLast_traded_quantity(int last_traded_quantity) {
        this.last_traded_quantity = last_traded_quantity;
    }

    public LocalDateTime getLast_traded_time() {
        return last_traded_time;
    }

    public void setLast_traded_time(LocalDateTime last_traded_time) {
        this.last_traded_time = last_traded_time;
    }

    public float getAverage_traded_price() {
        return average_traded_price;
    }

    public void setAverage_traded_price(float average_traded_price) {
        this.average_traded_price = average_traded_price;
    }

    public int getTotal_quantity_traded() {
        return total_quantity_traded;
    }

    public void setTotal_quantity_traded(int total_quantity_traded) {
        this.total_quantity_traded = total_quantity_traded;
    }

    public int getOpen_interest() {
        return open_interest;
    }

    public void setOpen_interest(int open_interest) {
        this.open_interest = open_interest;
    }

    public float getOpen_price() {
        return open_price;
    }

    public void setOpen_price(float open_price) {
        this.open_price = open_price;
    }

    public float getHigh_price() {
        return high_price;
    }

    public void setHigh_price(float high_price) {
        this.high_price = high_price;
    }

    public float getLow_price() {
        return low_price;
    }

    public void setLow_price(float low_price) {
        this.low_price = low_price;
    }

    public float getClose_price() {
        return close_price;
    }

    public void setClose_price(float close_price) {
        this.close_price = close_price;
    }

    public String getTotal_traded_value() {
        return total_traded_value;
    }

    public void setTotal_traded_value(String total_traded_value) {
        this.total_traded_value = total_traded_value;
    }

    public String getPrice_quotation_unit() {
        return price_quotation_unit;
    }

    public void setPrice_quotation_unit(String price_quotation_unit) {
        this.price_quotation_unit = price_quotation_unit;
    }

    public int getQuotation_lot() {
        return quotation_lot;
    }

    public void setQuotation_lot(int quotation_lot) {
        this.quotation_lot = quotation_lot;
    }

    public YearMonth getProduct_month() {
        return product_month;
    }

    public void setProduct_month(YearMonth product_month) {
        this.product_month = product_month;
    }

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public Long getPer_change() {
        return per_change;
    }

    public void setPer_change(Long per_change) {
        this.per_change = per_change;
    }
}
