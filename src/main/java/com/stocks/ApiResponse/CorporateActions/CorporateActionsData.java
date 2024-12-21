package com.stocks.ApiResponse.CorporateActions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stocks.ApiResponse.CorporateActions.boardMeetings.BoardMeetingsData;
import com.stocks.ApiResponse.CorporateActions.bonus.BonusData;
import com.stocks.ApiResponse.CorporateActions.dividents.DividentsData;
import com.stocks.ApiResponse.CorporateActions.rights.RightsData;
import com.stocks.ApiResponse.CorporateActions.splits.SplitsData;

public class CorporateActionsData {
    @JsonProperty("board_meetings")
    private BoardMeetingsData boardMeetingsData;
    @JsonProperty("dividents")
    private DividentsData dividentsData;
    @JsonProperty("splits")
    private SplitsData splitsData;
    @JsonProperty("bonus")
    private BonusData bonusData;
    @JsonProperty("rights")
    private RightsData rightsData;

}
