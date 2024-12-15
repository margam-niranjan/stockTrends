package com.stocks.corporateActionsResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoardMeeting {
    private String msg;
    private String title;
    private List<String> header;
    private List<List<String>> data;
}