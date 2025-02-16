package com.stocks.ApiResponse.CorporateActions.rights;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RightsData {
    @JsonProperty("title")
    private String title;
    @JsonProperty("msg")
    private String msg;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
