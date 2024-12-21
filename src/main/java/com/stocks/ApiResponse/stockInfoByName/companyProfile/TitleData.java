package com.stocks.ApiResponse.stockInfoByName.companyProfile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TitleData {
    @JsonProperty("startYear")
    private String startYear;
    @JsonProperty("startMonth")
    private String startMonth;
    @JsonProperty("startDay")
    private String startDay;
    @JsonProperty("iD1")
    private String iD1;
    @JsonProperty("abb1")
    private String abbr1;
    @JsonProperty("iD2")
    private String iD2;
    @JsonProperty("abbr2")
    private String abbr2;
    @JsonProperty("Value")
    private String value;
}
