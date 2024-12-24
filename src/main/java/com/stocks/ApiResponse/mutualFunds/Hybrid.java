package com.stocks.ApiResponse.mutualFunds;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Hybrid{

	@JsonProperty("Fund of Funds")
	private List<FundOfFundsItem> fundOfFunds;

	@JsonProperty("Multi Asset Allocation")
	private List<MultiAssetAllocationItem> multiAssetAllocation;

	@JsonProperty("Equity Savings")
	private List<EquitySavingsItem> equitySavings;

	@JsonProperty("Balanced Allocation")
	private List<BalancedAllocationItem> balancedAllocation;

	@JsonProperty("Dynamic Asset Allocation")
	private List<DynamicAssetAllocationItem> dynamicAssetAllocation;

	@JsonProperty("Aggressive Allocation")
	private List<AggressiveAllocationItem> aggressiveAllocation;

	@JsonProperty("Conservative Allocation")
	private List<ConservativeAllocationItem> conservativeAllocation;

	public void setFundOfFunds(List<FundOfFundsItem> fundOfFunds){
		this.fundOfFunds = fundOfFunds;
	}

	public List<FundOfFundsItem> getFundOfFunds(){
		return fundOfFunds;
	}

	public void setMultiAssetAllocation(List<MultiAssetAllocationItem> multiAssetAllocation){
		this.multiAssetAllocation = multiAssetAllocation;
	}

	public List<MultiAssetAllocationItem> getMultiAssetAllocation(){
		return multiAssetAllocation;
	}

	public void setEquitySavings(List<EquitySavingsItem> equitySavings){
		this.equitySavings = equitySavings;
	}

	public List<EquitySavingsItem> getEquitySavings(){
		return equitySavings;
	}

	public void setBalancedAllocation(List<BalancedAllocationItem> balancedAllocation){
		this.balancedAllocation = balancedAllocation;
	}

	public List<BalancedAllocationItem> getBalancedAllocation(){
		return balancedAllocation;
	}

	public void setDynamicAssetAllocation(List<DynamicAssetAllocationItem> dynamicAssetAllocation){
		this.dynamicAssetAllocation = dynamicAssetAllocation;
	}

	public List<DynamicAssetAllocationItem> getDynamicAssetAllocation(){
		return dynamicAssetAllocation;
	}

	public void setAggressiveAllocation(List<AggressiveAllocationItem> aggressiveAllocation){
		this.aggressiveAllocation = aggressiveAllocation;
	}

	public List<AggressiveAllocationItem> getAggressiveAllocation(){
		return aggressiveAllocation;
	}

	public void setConservativeAllocation(List<ConservativeAllocationItem> conservativeAllocation){
		this.conservativeAllocation = conservativeAllocation;
	}

	public List<ConservativeAllocationItem> getConservativeAllocation(){
		return conservativeAllocation;
	}
}