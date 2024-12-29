package com.stocks.ApiResponse.historicalData.clientRequestSucess;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public class DatasetsItem {

	@JsonProperty("metric")
	private String metric;

	@JsonProperty("meta")
	private Meta meta;

	@JsonProperty("values")
	private List<List<Object>> values;

	@JsonProperty("label")
	private String label;

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public List<List<Object>> getValues() {
		return values;
	}

	public void setValues(List<List<Object>> values) {
		this.values = values;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
