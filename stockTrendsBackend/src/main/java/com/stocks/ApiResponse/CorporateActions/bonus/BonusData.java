package com.stocks.ApiResponse.CorporateActions.bonus;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BonusData {
    @JsonProperty("msg")
    private String msg;
    @JsonProperty("title")
    private String title;
    @JsonProperty("header")
    private List<String> header;
    @JsonProperty("data")
    private List<List<String>> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getHeader() {
        return header;
    }

    public void setHeader(List<String> header) {
        this.header = header;
    }

    public List<List<String>> getData() {
        return data;
    }

    public void setData(List<List<String>> data) {
        this.data = data;
    }
}
