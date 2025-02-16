package com.stocks.ApiResponse.historicalData.clientRequestSucess;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class HistoricalSuccessData {

	@JsonProperty("datasets")
	private List<DatasetsItem> datasets;

	public List<DatasetsItem> getDatasets() {
		return datasets;
	}

	public void setDatasets(List<DatasetsItem> datasets) {
		this.datasets = datasets;
	}
}
