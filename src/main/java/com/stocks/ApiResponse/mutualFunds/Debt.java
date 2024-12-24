package com.stocks.ApiResponse.mutualFunds;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Debt{

	@JsonProperty("Floating Rate")
	private List<FloatingRateItem> floatingRate;

	@JsonProperty("Fixed Maturity Intermediate-Term Bond")
	private List<FixedMaturityIntermediateTermBondItem> fixedMaturityIntermediateTermBond;

	@JsonProperty("Dynamic Bond")
	private List<DynamicBondItem> dynamicBond;

	@JsonProperty("Ultra Short Duration")
	private List<UltraShortDurationItem> ultraShortDuration;

	@JsonProperty("Corporate Bond")
	private List<CorporateBondItem> corporateBond;

	@JsonProperty("Short Duration")
	private List<ShortDurationItem> shortDuration;

	@JsonProperty("10 yr Government Bond")
	private List<JsonMember10YrGovernmentBondItem> jsonMember10YrGovernmentBond;

	@JsonProperty("Government Bond")
	private List<GovernmentBondItem> governmentBond;

	@JsonProperty("Money Market")
	private List<MoneyMarketItem> moneyMarket;

	@JsonProperty("Long Duration")
	private List<LongDurationItem> longDuration;

	@JsonProperty("Other Bond")
	private List<OtherBondItem> otherBond;

	@JsonProperty("Low Duration")
	private List<LowDurationItem> lowDuration;

	@JsonProperty("Credit Risk")
	private List<CreditRiskItem> creditRisk;

	@JsonProperty("Banking & PSU")
	private List<BankingPSUItem> bankingPSU;

	@JsonProperty("Medium to Long Duration")
	private List<MediumToLongDurationItem> mediumToLongDuration;

	@JsonProperty("Fixed Maturity Short-Term Bond")
	private List<FixedMaturityShortTermBondItem> fixedMaturityShortTermBond;

	@JsonProperty("Medium Duration")
	private List<MediumDurationItem> mediumDuration;

	@JsonProperty("Fixed Maturity Ultrashort Bond")
	private List<FixedMaturityUltrashortBondItem> fixedMaturityUltrashortBond;

	public void setFloatingRate(List<FloatingRateItem> floatingRate){
		this.floatingRate = floatingRate;
	}

	public List<FloatingRateItem> getFloatingRate(){
		return floatingRate;
	}

	public void setFixedMaturityIntermediateTermBond(List<FixedMaturityIntermediateTermBondItem> fixedMaturityIntermediateTermBond){
		this.fixedMaturityIntermediateTermBond = fixedMaturityIntermediateTermBond;
	}

	public List<FixedMaturityIntermediateTermBondItem> getFixedMaturityIntermediateTermBond(){
		return fixedMaturityIntermediateTermBond;
	}

	public void setDynamicBond(List<DynamicBondItem> dynamicBond){
		this.dynamicBond = dynamicBond;
	}

	public List<DynamicBondItem> getDynamicBond(){
		return dynamicBond;
	}

	public void setUltraShortDuration(List<UltraShortDurationItem> ultraShortDuration){
		this.ultraShortDuration = ultraShortDuration;
	}

	public List<UltraShortDurationItem> getUltraShortDuration(){
		return ultraShortDuration;
	}

	public void setCorporateBond(List<CorporateBondItem> corporateBond){
		this.corporateBond = corporateBond;
	}

	public List<CorporateBondItem> getCorporateBond(){
		return corporateBond;
	}

	public void setShortDuration(List<ShortDurationItem> shortDuration){
		this.shortDuration = shortDuration;
	}

	public List<ShortDurationItem> getShortDuration(){
		return shortDuration;
	}

	public void setJsonMember10YrGovernmentBond(List<JsonMember10YrGovernmentBondItem> jsonMember10YrGovernmentBond){
		this.jsonMember10YrGovernmentBond = jsonMember10YrGovernmentBond;
	}

	public List<JsonMember10YrGovernmentBondItem> getJsonMember10YrGovernmentBond(){
		return jsonMember10YrGovernmentBond;
	}

	public void setGovernmentBond(List<GovernmentBondItem> governmentBond){
		this.governmentBond = governmentBond;
	}

	public List<GovernmentBondItem> getGovernmentBond(){
		return governmentBond;
	}

	public void setMoneyMarket(List<MoneyMarketItem> moneyMarket){
		this.moneyMarket = moneyMarket;
	}

	public List<MoneyMarketItem> getMoneyMarket(){
		return moneyMarket;
	}

	public void setLongDuration(List<LongDurationItem> longDuration){
		this.longDuration = longDuration;
	}

	public List<LongDurationItem> getLongDuration(){
		return longDuration;
	}

	public void setOtherBond(List<OtherBondItem> otherBond){
		this.otherBond = otherBond;
	}

	public List<OtherBondItem> getOtherBond(){
		return otherBond;
	}

	public void setLowDuration(List<LowDurationItem> lowDuration){
		this.lowDuration = lowDuration;
	}

	public List<LowDurationItem> getLowDuration(){
		return lowDuration;
	}

	public void setCreditRisk(List<CreditRiskItem> creditRisk){
		this.creditRisk = creditRisk;
	}

	public List<CreditRiskItem> getCreditRisk(){
		return creditRisk;
	}

	public void setBankingPSU(List<BankingPSUItem> bankingPSU){
		this.bankingPSU = bankingPSU;
	}

	public List<BankingPSUItem> getBankingPSU(){
		return bankingPSU;
	}

	public void setMediumToLongDuration(List<MediumToLongDurationItem> mediumToLongDuration){
		this.mediumToLongDuration = mediumToLongDuration;
	}

	public List<MediumToLongDurationItem> getMediumToLongDuration(){
		return mediumToLongDuration;
	}

	public void setFixedMaturityShortTermBond(List<FixedMaturityShortTermBondItem> fixedMaturityShortTermBond){
		this.fixedMaturityShortTermBond = fixedMaturityShortTermBond;
	}

	public List<FixedMaturityShortTermBondItem> getFixedMaturityShortTermBond(){
		return fixedMaturityShortTermBond;
	}

	public void setMediumDuration(List<MediumDurationItem> mediumDuration){
		this.mediumDuration = mediumDuration;
	}

	public List<MediumDurationItem> getMediumDuration(){
		return mediumDuration;
	}

	public void setFixedMaturityUltrashortBond(List<FixedMaturityUltrashortBondItem> fixedMaturityUltrashortBond){
		this.fixedMaturityUltrashortBond = fixedMaturityUltrashortBond;
	}

	public List<FixedMaturityUltrashortBondItem> getFixedMaturityUltrashortBond(){
		return fixedMaturityUltrashortBond;
	}
}