package com.stocks.ApiResponse.HistoricalStats.quaterResults;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DatasetsItem{

	@JsonProperty("metric")
	private String metric;

	@JsonProperty("meta")
	private Meta meta;

	@JsonProperty("values")
	private List<List<String>> values;

	@JsonProperty("label")
	private String label;

	public void setMetric(String metric){
		this.metric = metric;
	}

	public String getMetric(){
		return metric;
	}

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setValues(List<List<String>> values){
		this.values = values;
	}

	public List<List<String>> getValues(){
		return values;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}
}