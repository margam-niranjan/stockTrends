package com.stocks.ApiResponse.HistoricalStats.null;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HistoricalStatsData{

	@JsonProperty("detail")
	private List<DetailItem> detail;

	public void setDetail(List<DetailItem> detail){
		this.detail = detail;
	}

	public List<DetailItem> getDetail(){
		return detail;
	}
}