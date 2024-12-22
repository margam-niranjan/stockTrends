package com.stocks.ApiResponse.IPO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListedItem{

	@JsonProperty("issue_price")
	private int issuePrice;

	@JsonProperty("symbol")
	private String symbol;

	@JsonProperty("listing_gains")
	private Object listingGains;

	@JsonProperty("bidding_start_date")
	private String biddingStartDate;

	@JsonProperty("max_price")
	private Object maxPrice;

	@JsonProperty("min_price")
	private Object minPrice;

	@JsonProperty("name")
	private String name;

	@JsonProperty("is_sme")
	private boolean isSme;

	@JsonProperty("listing_price")
	private Object listingPrice;

	@JsonProperty("bidding_end_date")
	private Object biddingEndDate;

	@JsonProperty("lot_size")
	private Object lotSize;

	@JsonProperty("additional_text")
	private String additionalText;

	@JsonProperty("listing_date")
	private String listingDate;

	@JsonProperty("document_url")
	private String documentUrl;

	@JsonProperty("status")
	private String status;

	public void setIssuePrice(int issuePrice){
		this.issuePrice = issuePrice;
	}

	public int getIssuePrice(){
		return issuePrice;
	}

	public void setSymbol(String symbol){
		this.symbol = symbol;
	}

	public String getSymbol(){
		return symbol;
	}

	public void setListingGains(Object listingGains){
		this.listingGains = listingGains;
	}

	public Object getListingGains(){
		return listingGains;
	}

	public void setBiddingStartDate(String biddingStartDate){
		this.biddingStartDate = biddingStartDate;
	}

	public String getBiddingStartDate(){
		return biddingStartDate;
	}

	public void setMaxPrice(Object maxPrice){
		this.maxPrice = maxPrice;
	}

	public Object getMaxPrice(){
		return maxPrice;
	}

	public void setMinPrice(Object minPrice){
		this.minPrice = minPrice;
	}

	public Object getMinPrice(){
		return minPrice;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIsSme(boolean isSme){
		this.isSme = isSme;
	}

	public boolean isIsSme(){
		return isSme;
	}

	public void setListingPrice(Object listingPrice){
		this.listingPrice = listingPrice;
	}

	public Object getListingPrice(){
		return listingPrice;
	}

	public void setBiddingEndDate(Object biddingEndDate){
		this.biddingEndDate = biddingEndDate;
	}

	public Object getBiddingEndDate(){
		return biddingEndDate;
	}

	public void setLotSize(Object lotSize){
		this.lotSize = lotSize;
	}

	public Object getLotSize(){
		return lotSize;
	}

	public void setAdditionalText(String additionalText){
		this.additionalText = additionalText;
	}

	public String getAdditionalText(){
		return additionalText;
	}

	public void setListingDate(String listingDate){
		this.listingDate = listingDate;
	}

	public String getListingDate(){
		return listingDate;
	}

	public void setDocumentUrl(String documentUrl){
		this.documentUrl = documentUrl;
	}

	public String getDocumentUrl(){
		return documentUrl;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}
}