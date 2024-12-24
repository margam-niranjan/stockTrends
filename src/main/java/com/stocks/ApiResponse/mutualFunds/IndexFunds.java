package com.stocks.ApiResponse.mutualFunds;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IndexFunds{

	@JsonProperty("Index Funds")
	private List<IndexFundsItem> indexFunds;

	public void setIndexFunds(List<IndexFundsItem> indexFunds){
		this.indexFunds = indexFunds;
	}

	public List<IndexFundsItem> getIndexFunds(){
		return indexFunds;
	}
}