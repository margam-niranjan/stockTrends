package com.stocks.ApiResponse.stockForecasts;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EstimateSnapshots{

	@JsonProperty("EstimateSnapshot")
	private List<EstimateSnapshotItem> estimateSnapshot;

	public void setEstimateSnapshot(List<EstimateSnapshotItem> estimateSnapshot){
		this.estimateSnapshot = estimateSnapshot;
	}

	public List<EstimateSnapshotItem> getEstimateSnapshot(){
		return estimateSnapshot;
	}
}