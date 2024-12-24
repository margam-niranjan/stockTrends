package com.stocks.ApiResponse.HistoricalStats.nullData;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NullHistoricalStatsData {

	@JsonProperty("detail")
	private List<DetailItem> detail;

	public void setDetail(List<DetailItem> detail){
		this.detail = detail;
	}

	public List<DetailItem> getDetail(){
		return detail;
	}
}