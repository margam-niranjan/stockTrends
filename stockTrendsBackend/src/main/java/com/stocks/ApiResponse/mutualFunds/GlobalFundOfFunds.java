package com.stocks.ApiResponse.mutualFunds;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GlobalFundOfFunds{

	@JsonProperty("Global - Other")
	private List<GlobalOtherItem> globalOther;

	public void setGlobalOther(List<GlobalOtherItem> globalOther){
		this.globalOther = globalOther;
	}

	public List<GlobalOtherItem> getGlobalOther(){
		return globalOther;
	}
}