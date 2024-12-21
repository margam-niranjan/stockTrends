package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stocks.ApiResponse.stockInfoByName.companyProfile.CompanyProfileData;

public class StockInfoData {
    @JsonProperty("tickerId")
    private String tickerId;
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("industry")
    private String industry;
    @JsonProperty("companyProfile")
    private CompanyProfileData companyProfileData;
}