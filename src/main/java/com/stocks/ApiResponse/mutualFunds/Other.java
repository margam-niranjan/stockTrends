package com.stocks.ApiResponse.mutualFunds;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Other{

	@JsonProperty("Liquid")
	private List<LiquidItem> liquid;

	@JsonProperty("Overnight")
	private List<OvernightItem> overnight;

	@JsonProperty("Arbitrage Fund")
	private List<ArbitrageFundItem> arbitrageFund;

	@JsonProperty("Sector - Precious Metals")
	private List<SectorPreciousMetalsItem> sectorPreciousMetals;

	public void setLiquid(List<LiquidItem> liquid){
		this.liquid = liquid;
	}

	public List<LiquidItem> getLiquid(){
		return liquid;
	}

	public void setOvernight(List<OvernightItem> overnight){
		this.overnight = overnight;
	}

	public List<OvernightItem> getOvernight(){
		return overnight;
	}

	public void setArbitrageFund(List<ArbitrageFundItem> arbitrageFund){
		this.arbitrageFund = arbitrageFund;
	}

	public List<ArbitrageFundItem> getArbitrageFund(){
		return arbitrageFund;
	}

	public void setSectorPreciousMetals(List<SectorPreciousMetalsItem> sectorPreciousMetals){
		this.sectorPreciousMetals = sectorPreciousMetals;
	}

	public List<SectorPreciousMetalsItem> getSectorPreciousMetals(){
		return sectorPreciousMetals;
	}
}