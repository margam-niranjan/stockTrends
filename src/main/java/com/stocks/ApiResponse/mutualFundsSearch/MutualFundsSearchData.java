package com.stocks.ApiResponse.mutualFundsSearch;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MutualFundsSearchData {
    @JsonProperty("id")
    private String id;

    @JsonProperty("schemeName")
    private String schemeName;

    @JsonProperty("isin")
    private String isin;

    @JsonProperty("schemeType")
    private String schemeType;

    @JsonProperty("categoryId")
    private String categoryId;

}
