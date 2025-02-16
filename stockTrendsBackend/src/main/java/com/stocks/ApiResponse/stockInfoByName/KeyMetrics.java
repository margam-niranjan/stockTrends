package com.stocks.ApiResponse.stockInfoByName;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KeyMetrics{

	@JsonProperty("mgmtEffectiveness")
	private List<MgmtEffectivenessItem> mgmtEffectiveness;

	@JsonProperty("margins")
	private List<MarginsItem> margins;

	@JsonProperty("financialstrength")
	private List<FinancialstrengthItem> financialstrength;

	@JsonProperty("valuation")
	private List<ValuationItem> valuation;

	@JsonProperty("incomeStatement")
	private List<IncomeStatementItem> incomeStatement;

	@JsonProperty("growth")
	private List<GrowthItem> growth;

	@JsonProperty("persharedata")
	private List<PersharedataItem> persharedata;

	@JsonProperty("priceandVolume")
	private List<PriceandVolumeItem> priceandVolume;

	public void setMgmtEffectiveness(List<MgmtEffectivenessItem> mgmtEffectiveness){
		this.mgmtEffectiveness = mgmtEffectiveness;
	}

	public List<MgmtEffectivenessItem> getMgmtEffectiveness(){
		return mgmtEffectiveness;
	}

	public void setMargins(List<MarginsItem> margins){
		this.margins = margins;
	}

	public List<MarginsItem> getMargins(){
		return margins;
	}

	public void setFinancialstrength(List<FinancialstrengthItem> financialstrength){
		this.financialstrength = financialstrength;
	}

	public List<FinancialstrengthItem> getFinancialstrength(){
		return financialstrength;
	}

	public void setValuation(List<ValuationItem> valuation){
		this.valuation = valuation;
	}

	public List<ValuationItem> getValuation(){
		return valuation;
	}

	public void setIncomeStatement(List<IncomeStatementItem> incomeStatement){
		this.incomeStatement = incomeStatement;
	}

	public List<IncomeStatementItem> getIncomeStatement(){
		return incomeStatement;
	}

	public void setGrowth(List<GrowthItem> growth){
		this.growth = growth;
	}

	public List<GrowthItem> getGrowth(){
		return growth;
	}

	public void setPersharedata(List<PersharedataItem> persharedata){
		this.persharedata = persharedata;
	}

	public List<PersharedataItem> getPersharedata(){
		return persharedata;
	}

	public void setPriceandVolume(List<PriceandVolumeItem> priceandVolume){
		this.priceandVolume = priceandVolume;
	}

	public List<PriceandVolumeItem> getPriceandVolume(){
		return priceandVolume;
	}
}