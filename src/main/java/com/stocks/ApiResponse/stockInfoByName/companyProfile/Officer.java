package com.stocks.ApiResponse.stockInfoByName.companyProfile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Officer {
    @JsonProperty("rank")
    private int rank;
    @JsonProperty("since")
    private String since;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("mI")
    private String mI;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("age")
    private String age;
    @JsonProperty("title")
    private TitleData titleData;
}
