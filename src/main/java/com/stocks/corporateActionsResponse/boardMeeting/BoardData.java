package com.stocks.corporateActionsResponse.boardMeeting;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoardData {
        private String date;
        private String agenda;
}
