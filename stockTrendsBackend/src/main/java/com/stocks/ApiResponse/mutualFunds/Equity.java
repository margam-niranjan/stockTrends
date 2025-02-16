package com.stocks.ApiResponse.mutualFunds;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Equity{

	@JsonProperty("Focused Fund")
	private List<FocusedFundItem> focusedFund;

	@JsonProperty("Equity - Other")
	private List<EquityOtherItem> equityOther;

	@JsonProperty("Contra")
	private List<ContraItem> contra;

	@JsonProperty("Flexi Cap")
	private List<FlexiCapItem> flexiCap;

	@JsonProperty("Equity - Consumption")
	private List<EquityConsumptionItem> equityConsumption;

	@JsonProperty("Sector - FMCG")
	private List<SectorFMCGItem> sectorFMCG;

	@JsonProperty("Sector - Financial Services")
	private List<SectorFinancialServicesItem> sectorFinancialServices;

	@JsonProperty("Equity - Infrastructure")
	private List<EquityInfrastructureItem> equityInfrastructure;

	@JsonProperty("Mid-Cap")
	private List<MidCapItem> midCap;

	@JsonProperty("Multi-Cap")
	private List<MultiCapItem> multiCap;

	@JsonProperty("Large-Cap")
	private List<LargeCapItem> largeCap;

	@JsonProperty("Small-Cap")
	private List<SmallCapItem> smallCap;

	@JsonProperty("Dividend Yield")
	private List<DividendYieldItem> dividendYield;

	@JsonProperty("ELSS (Tax Savings)")
	private List<ELSSTaxSavingsItem> eLSSTaxSavings;

	@JsonProperty("Large & Mid-Cap")
	private List<LargeMidCapItem> largeMidCap;

	@JsonProperty("Sector - Healthcare")
	private List<SectorHealthcareItem> sectorHealthcare;

	@JsonProperty("Value")
	private List<ValueItem> value;

	@JsonProperty("Equity - ESG")
	private List<EquityESGItem> equityESG;

	@JsonProperty("Sector - Technology")
	private List<SectorTechnologyItem> sectorTechnology;

	public void setFocusedFund(List<FocusedFundItem> focusedFund){
		this.focusedFund = focusedFund;
	}

	public List<FocusedFundItem> getFocusedFund(){
		return focusedFund;
	}

	public void setEquityOther(List<EquityOtherItem> equityOther){
		this.equityOther = equityOther;
	}

	public List<EquityOtherItem> getEquityOther(){
		return equityOther;
	}

	public void setContra(List<ContraItem> contra){
		this.contra = contra;
	}

	public List<ContraItem> getContra(){
		return contra;
	}

	public void setFlexiCap(List<FlexiCapItem> flexiCap){
		this.flexiCap = flexiCap;
	}

	public List<FlexiCapItem> getFlexiCap(){
		return flexiCap;
	}

	public void setEquityConsumption(List<EquityConsumptionItem> equityConsumption){
		this.equityConsumption = equityConsumption;
	}

	public List<EquityConsumptionItem> getEquityConsumption(){
		return equityConsumption;
	}

	public void setSectorFMCG(List<SectorFMCGItem> sectorFMCG){
		this.sectorFMCG = sectorFMCG;
	}

	public List<SectorFMCGItem> getSectorFMCG(){
		return sectorFMCG;
	}

	public void setSectorFinancialServices(List<SectorFinancialServicesItem> sectorFinancialServices){
		this.sectorFinancialServices = sectorFinancialServices;
	}

	public List<SectorFinancialServicesItem> getSectorFinancialServices(){
		return sectorFinancialServices;
	}

	public void setEquityInfrastructure(List<EquityInfrastructureItem> equityInfrastructure){
		this.equityInfrastructure = equityInfrastructure;
	}

	public List<EquityInfrastructureItem> getEquityInfrastructure(){
		return equityInfrastructure;
	}

	public void setMidCap(List<MidCapItem> midCap){
		this.midCap = midCap;
	}

	public List<MidCapItem> getMidCap(){
		return midCap;
	}

	public void setMultiCap(List<MultiCapItem> multiCap){
		this.multiCap = multiCap;
	}

	public List<MultiCapItem> getMultiCap(){
		return multiCap;
	}

	public void setLargeCap(List<LargeCapItem> largeCap){
		this.largeCap = largeCap;
	}

	public List<LargeCapItem> getLargeCap(){
		return largeCap;
	}

	public void setSmallCap(List<SmallCapItem> smallCap){
		this.smallCap = smallCap;
	}

	public List<SmallCapItem> getSmallCap(){
		return smallCap;
	}

	public void setDividendYield(List<DividendYieldItem> dividendYield){
		this.dividendYield = dividendYield;
	}

	public List<DividendYieldItem> getDividendYield(){
		return dividendYield;
	}

	public void setELSSTaxSavings(List<ELSSTaxSavingsItem> eLSSTaxSavings){
		this.eLSSTaxSavings = eLSSTaxSavings;
	}

	public List<ELSSTaxSavingsItem> getELSSTaxSavings(){
		return eLSSTaxSavings;
	}

	public void setLargeMidCap(List<LargeMidCapItem> largeMidCap){
		this.largeMidCap = largeMidCap;
	}

	public List<LargeMidCapItem> getLargeMidCap(){
		return largeMidCap;
	}

	public void setSectorHealthcare(List<SectorHealthcareItem> sectorHealthcare){
		this.sectorHealthcare = sectorHealthcare;
	}

	public List<SectorHealthcareItem> getSectorHealthcare(){
		return sectorHealthcare;
	}

	public void setValue(List<ValueItem> value){
		this.value = value;
	}

	public List<ValueItem> getValue(){
		return value;
	}

	public void setEquityESG(List<EquityESGItem> equityESG){
		this.equityESG = equityESG;
	}

	public List<EquityESGItem> getEquityESG(){
		return equityESG;
	}

	public void setSectorTechnology(List<SectorTechnologyItem> sectorTechnology){
		this.sectorTechnology = sectorTechnology;
	}

	public List<SectorTechnologyItem> getSectorTechnology(){
		return sectorTechnology;
	}
}