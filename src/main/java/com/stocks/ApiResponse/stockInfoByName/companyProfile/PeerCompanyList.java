package com.stocks.ApiResponse.stockInfoByName.companyProfile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PeerCompanyList {
    @JsonProperty("tickerId")
    private String tickerId;
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("priceToBookValueRatio")
    private Float priceToBookValueRatio;
    @JsonProperty("priceToEarningsValueRatio")
    private Float priceToEarningsValueRatio;
    @JsonProperty("marketCap")
    private Double marketCap;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("percentChange")
    private Double percentChange;
    @JsonProperty("netChange")
    private double netChange;
    @JsonProperty("returnOnAverageEquity5YearAverage")
    private Float returnOnAverageEquity5YearAverage;
    @JsonProperty("returnOnAverageEquityTrailing12Month")
    private Float returnOnAverageEquityTrailing12Month;
    @JsonProperty("ltDebtPerEquityMostRecentFiscalYear")
    private Float ltDebtPerEquityMostRecentFiscalYear;
    @JsonProperty("netProfitMargin5YearAverage")
    private Float netProfitMargin5YearAverage;
}
