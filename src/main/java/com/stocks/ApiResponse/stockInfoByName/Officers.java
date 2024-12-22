package com.stocks.ApiResponse.stockInfoByName;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Officers{

	@JsonProperty("officer")
	private List<OfficerItem> officer;

	public void setOfficer(List<OfficerItem> officer){
		this.officer = officer;
	}

	public List<OfficerItem> getOfficer(){
		return officer;
	}
}