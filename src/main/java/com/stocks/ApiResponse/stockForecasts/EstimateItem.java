package com.stocks.ApiResponse.stockForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EstimateItem{

	@JsonProperty("High")
	private int high;

	@JsonProperty("Mean")
	private int mean;

	@JsonProperty("NumberOfEstimates")
	private int numberOfEstimates;

	@JsonProperty("RevisionStatisticsList")
	private RevisionStatisticsList revisionStatisticsList;

	@JsonProperty("PredictedSurprise")
	private PredictedSurprise predictedSurprise;

	@JsonProperty("Median")
	private int median;

	@JsonProperty("PreliminaryMean")
	private Object preliminaryMean;

	@JsonProperty("CurrencyCode")
	private String currencyCode;

	@JsonProperty("Low")
	private int low;

	@JsonProperty("SmartEstimate")
	private int smartEstimate;

	@JsonProperty("RevisionCluster")
	private RevisionCluster revisionCluster;

	@JsonProperty("StandardDeviation")
	private int standardDeviation;

	@JsonProperty("UnverifiedMean")
	private Object unverifiedMean;

	public void setHigh(int high){
		this.high = high;
	}

	public int getHigh(){
		return high;
	}

	public void setMean(int mean){
		this.mean = mean;
	}

	public int getMean(){
		return mean;
	}

	public void setNumberOfEstimates(int numberOfEstimates){
		this.numberOfEstimates = numberOfEstimates;
	}

	public int getNumberOfEstimates(){
		return numberOfEstimates;
	}

	public void setRevisionStatisticsList(RevisionStatisticsList revisionStatisticsList){
		this.revisionStatisticsList = revisionStatisticsList;
	}

	public RevisionStatisticsList getRevisionStatisticsList(){
		return revisionStatisticsList;
	}

	public void setPredictedSurprise(PredictedSurprise predictedSurprise){
		this.predictedSurprise = predictedSurprise;
	}

	public PredictedSurprise getPredictedSurprise(){
		return predictedSurprise;
	}

	public void setMedian(int median){
		this.median = median;
	}

	public int getMedian(){
		return median;
	}

	public void setPreliminaryMean(Object preliminaryMean){
		this.preliminaryMean = preliminaryMean;
	}

	public Object getPreliminaryMean(){
		return preliminaryMean;
	}

	public void setCurrencyCode(String currencyCode){
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}

	public void setLow(int low){
		this.low = low;
	}

	public int getLow(){
		return low;
	}

	public void setSmartEstimate(int smartEstimate){
		this.smartEstimate = smartEstimate;
	}

	public int getSmartEstimate(){
		return smartEstimate;
	}

	public void setRevisionCluster(RevisionCluster revisionCluster){
		this.revisionCluster = revisionCluster;
	}

	public RevisionCluster getRevisionCluster(){
		return revisionCluster;
	}

	public void setStandardDeviation(int standardDeviation){
		this.standardDeviation = standardDeviation;
	}

	public int getStandardDeviation(){
		return standardDeviation;
	}

	public void setUnverifiedMean(Object unverifiedMean){
		this.unverifiedMean = unverifiedMean;
	}

	public Object getUnverifiedMean(){
		return unverifiedMean;
	}
}