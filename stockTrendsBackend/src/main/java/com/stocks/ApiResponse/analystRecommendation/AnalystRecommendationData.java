package com.stocks.ApiResponse.analystRecommendation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnalystRecommendationData{

	@JsonProperty("recommendation")
	private Recommendation recommendation;

	@JsonProperty("priceTarget")
	private PriceTarget priceTarget;

	@JsonProperty("priceTargetSnapshots")
	private PriceTargetSnapshots priceTargetSnapshots;

	@JsonProperty("recommendationSnapshots")
	private RecommendationSnapshots recommendationSnapshots;

	public void setRecommendation(Recommendation recommendation){
		this.recommendation = recommendation;
	}

	public Recommendation getRecommendation(){
		return recommendation;
	}

	public void setPriceTarget(PriceTarget priceTarget){
		this.priceTarget = priceTarget;
	}

	public PriceTarget getPriceTarget(){
		return priceTarget;
	}

	public void setPriceTargetSnapshots(PriceTargetSnapshots priceTargetSnapshots){
		this.priceTargetSnapshots = priceTargetSnapshots;
	}

	public PriceTargetSnapshots getPriceTargetSnapshots(){
		return priceTargetSnapshots;
	}

	public void setRecommendationSnapshots(RecommendationSnapshots recommendationSnapshots){
		this.recommendationSnapshots = recommendationSnapshots;
	}

	public RecommendationSnapshots getRecommendationSnapshots(){
		return recommendationSnapshots;
	}
}