package com.stocks.ApiResponse.analystRecommendation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PriceTargetSnapshots{

	@JsonProperty("PriceTargetSnapshot")
	private List<PriceTargetSnapshotItem> priceTargetSnapshot;

	public void setPriceTargetSnapshot(List<PriceTargetSnapshotItem> priceTargetSnapshot){
		this.priceTargetSnapshot = priceTargetSnapshot;
	}

	public List<PriceTargetSnapshotItem> getPriceTargetSnapshot(){
		return priceTargetSnapshot;
	}
}