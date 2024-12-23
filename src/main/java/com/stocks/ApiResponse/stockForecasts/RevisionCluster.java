package com.stocks.ApiResponse.stockForecasts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RevisionCluster{

	@JsonProperty("beginDate")
	private Object beginDate;

	@JsonProperty("unit")
	private Object unit;

	@JsonProperty("meanChange")
	private Object meanChange;

	@JsonProperty("averageRevision")
	private Object averageRevision;

	@JsonProperty("numberOfRevisions")
	private Object numberOfRevisions;

	@JsonProperty("priceChangePercent")
	private Object priceChangePercent;

	public void setBeginDate(Object beginDate){
		this.beginDate = beginDate;
	}

	public Object getBeginDate(){
		return beginDate;
	}

	public void setUnit(Object unit){
		this.unit = unit;
	}

	public Object getUnit(){
		return unit;
	}

	public void setMeanChange(Object meanChange){
		this.meanChange = meanChange;
	}

	public Object getMeanChange(){
		return meanChange;
	}

	public void setAverageRevision(Object averageRevision){
		this.averageRevision = averageRevision;
	}

	public Object getAverageRevision(){
		return averageRevision;
	}

	public void setNumberOfRevisions(Object numberOfRevisions){
		this.numberOfRevisions = numberOfRevisions;
	}

	public Object getNumberOfRevisions(){
		return numberOfRevisions;
	}

	public void setPriceChangePercent(Object priceChangePercent){
		this.priceChangePercent = priceChangePercent;
	}

	public Object getPriceChangePercent(){
		return priceChangePercent;
	}
}