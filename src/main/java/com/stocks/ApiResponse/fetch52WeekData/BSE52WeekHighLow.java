package com.stocks.ApiResponse.fetch52WeekData;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BSE52WeekHighLow{

	@JsonProperty("high52Week")
	private List<High52WeekItem> high52Week;

	@JsonProperty("low52Week")
	private List<Low52WeekItem> low52Week;

	public void setHigh52Week(List<High52WeekItem> high52Week){
		this.high52Week = high52Week;
	}

	public List<High52WeekItem> getHigh52Week(){
		return high52Week;
	}

	public void setLow52Week(List<Low52WeekItem> low52Week){
		this.low52Week = low52Week;
	}

	public List<Low52WeekItem> getLow52Week(){
		return low52Week;
	}
}