package com.stocks.ApiResponse.analystRecommendation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RecommendationSnapshots{

	@JsonProperty("RecommendationSnapshot")
	private List<RecommendationSnapshotItem> recommendationSnapshot;

	public void setRecommendationSnapshot(List<RecommendationSnapshotItem> recommendationSnapshot){
		this.recommendationSnapshot = recommendationSnapshot;
	}

	public List<RecommendationSnapshotItem> getRecommendationSnapshot(){
		return recommendationSnapshot;
	}
}