package com.stocks.ApiResponse.stockInfoByName;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyProfile {
    @JsonProperty("companyDescription")
    private String companyDescription;
    @JsonProperty("mgIndustry")
    private String mgIndustry;
    @JsonProperty("isInId")
    private String isInId;
    @JsonProperty("officers")
    private Officers officers;
}
