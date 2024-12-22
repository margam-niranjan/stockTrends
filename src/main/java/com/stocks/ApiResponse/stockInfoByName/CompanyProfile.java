package com.stocks.ApiResponse.stockInfoByName;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyProfile{

	@JsonProperty("mgIndustry")
	private String mgIndustry;

	@JsonProperty("companyDescription")
	private String companyDescription;

	@JsonProperty("exchangeCodeBse")
	private String exchangeCodeBse;

	@JsonProperty("peerCompanyList")
	private List<PeerCompanyListItem> peerCompanyList;

	@JsonProperty("isInId")
	private String isInId;

	@JsonProperty("officers")
	private Officers officers;

	@JsonProperty("exchangeCodeNse")
	private String exchangeCodeNse;

	public void setMgIndustry(String mgIndustry){
		this.mgIndustry = mgIndustry;
	}

	public String getMgIndustry(){
		return mgIndustry;
	}

	public void setCompanyDescription(String companyDescription){
		this.companyDescription = companyDescription;
	}

	public String getCompanyDescription(){
		return companyDescription;
	}

	public void setExchangeCodeBse(String exchangeCodeBse){
		this.exchangeCodeBse = exchangeCodeBse;
	}

	public String getExchangeCodeBse(){
		return exchangeCodeBse;
	}

	public void setPeerCompanyList(List<PeerCompanyListItem> peerCompanyList){
		this.peerCompanyList = peerCompanyList;
	}

	public List<PeerCompanyListItem> getPeerCompanyList(){
		return peerCompanyList;
	}

	public void setIsInId(String isInId){
		this.isInId = isInId;
	}

	public String getIsInId(){
		return isInId;
	}

	public void setOfficers(Officers officers){
		this.officers = officers;
	}

	public Officers getOfficers(){
		return officers;
	}

	public void setExchangeCodeNse(String exchangeCodeNse){
		this.exchangeCodeNse = exchangeCodeNse;
	}

	public String getExchangeCodeNse(){
		return exchangeCodeNse;
	}
}