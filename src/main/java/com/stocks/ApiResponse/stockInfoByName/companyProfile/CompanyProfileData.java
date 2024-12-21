package com.stocks.ApiResponse.stockInfoByName.companyProfile;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CompanyProfileData {
    @JsonProperty("companyDescription")
    private String companyDescription;
    @JsonProperty("mgIndustry")
    private String mgIndustry;
    @JsonProperty("isInId")
    private String isInId;
    @JsonProperty("officers")
    private Officers officers;
    @JsonProperty("exchangeCodeBse")
    private String exchangeCodeBse;
    @JsonProperty("exchangeCodeNse")
    private String exchangeCodeNse;
    @JsonProperty("peerCompanyList")
    private List<PeerCompanyList> peerCompanyList;
}
