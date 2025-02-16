package com.stocks.ApiResponse.stockInfoByName;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StockFinancialMap{

	@JsonProperty("CAS")
	private List<CASItem> cAS;

	@JsonProperty("BAL")
	private List<BALItem> bAL;

	@JsonProperty("INC")
	private List<INCItem> iNC;

	public void setCAS(List<CASItem> cAS){
		this.cAS = cAS;
	}

	public List<CASItem> getCAS(){
		return cAS;
	}

	public void setBAL(List<BALItem> bAL){
		this.bAL = bAL;
	}

	public List<BALItem> getBAL(){
		return bAL;
	}

	public void setINC(List<INCItem> iNC){
		this.iNC = iNC;
	}

	public List<INCItem> getINC(){
		return iNC;
	}
}