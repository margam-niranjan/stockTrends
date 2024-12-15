package com.stocks.corporateActionsResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stocks.corporateActionsResponse.boardMeeting.BoardData;
import com.stocks.corporateActionsResponse.boardMeeting.BoardHeader;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoardMeeting {
    private String msg;
    private String title;
    private BoardHeader header;
    private BoardData data;
}