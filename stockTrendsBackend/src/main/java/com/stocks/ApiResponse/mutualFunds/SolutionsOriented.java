package com.stocks.ApiResponse.mutualFunds;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SolutionsOriented{

	@JsonProperty("Children")
	private List<ChildrenItem> children;

	@JsonProperty("Retirement")
	private List<RetirementItem> retirement;

	public void setChildren(List<ChildrenItem> children){
		this.children = children;
	}

	public List<ChildrenItem> getChildren(){
		return children;
	}

	public void setRetirement(List<RetirementItem> retirement){
		this.retirement = retirement;
	}

	public List<RetirementItem> getRetirement(){
		return retirement;
	}
}