package com.stocks.ApiResponse.stockInfoByName;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StockCorporateActionData{

	@JsonProperty("splits")
	private List<SplitsItem> splits;

	@JsonProperty("bonus")
	private List<Object> bonus;

	@JsonProperty("annualGeneralMeeting")
	private List<AnnualGeneralMeetingItem> annualGeneralMeeting;

	@JsonProperty("rights")
	private List<Object> rights;

	@JsonProperty("dividend")
	private List<DividendItem> dividend;

	@JsonProperty("boardMeetings")
	private List<BoardMeetingsItem> boardMeetings;

	public void setSplits(List<SplitsItem> splits){
		this.splits = splits;
	}

	public List<SplitsItem> getSplits(){
		return splits;
	}

	public void setBonus(List<Object> bonus){
		this.bonus = bonus;
	}

	public List<Object> getBonus(){
		return bonus;
	}

	public void setAnnualGeneralMeeting(List<AnnualGeneralMeetingItem> annualGeneralMeeting){
		this.annualGeneralMeeting = annualGeneralMeeting;
	}

	public List<AnnualGeneralMeetingItem> getAnnualGeneralMeeting(){
		return annualGeneralMeeting;
	}

	public void setRights(List<Object> rights){
		this.rights = rights;
	}

	public List<Object> getRights(){
		return rights;
	}

	public void setDividend(List<DividendItem> dividend){
		this.dividend = dividend;
	}

	public List<DividendItem> getDividend(){
		return dividend;
	}

	public void setBoardMeetings(List<BoardMeetingsItem> boardMeetings){
		this.boardMeetings = boardMeetings;
	}

	public List<BoardMeetingsItem> getBoardMeetings(){
		return boardMeetings;
	}
}