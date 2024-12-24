package com.stocks.ApiResponse.historicalData.clientRequestSucess;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HistoricalSuccessData{

	@JsonProperty("datasets")
	private List<DatasetsItem> datasets;

	public void setDatasets(List<DatasetsItem> datasets){
		this.datasets = datasets;
	}

	public List<DatasetsItem> getDatasets(){
		return datasets;
	}
}