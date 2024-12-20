package com.stocks.ApiResponse.IPO.upcomingIpo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpcomingIpoData {
    private String symbol;
    private String name;
    private String status;
    @JsonProperty("is_sme")
    private boolean isSme;
    @JsonProperty("additional_text")
    private String additionalText;
    @JsonProperty("min_price")
    private int minPrice;
    @JsonProperty("max_price")
    private int maxPrice;
    @JsonProperty("issue_price")
    private int issuePrice;
    @JsonProperty("listing_gains")
    private int listingGains;
    @JsonProperty("listing_price")
    private int listingPrice;
    @JsonProperty("bidding_start_date")
    private String biddingStartDate;
    @JsonProperty("bidding_end_date")
    private String biddingEndDate;
    @JsonProperty("listing_date")
    private String listingDate;
    @JsonProperty("lot_size")
    private int lotSize;
    @JsonProperty("document_url")
    private String documentUrl;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isSme() {
        return isSme;
    }

    public void setSme(boolean sme) {
        isSme = sme;
    }

    public String getAdditionalText() {
        return additionalText;
    }

    public void setAdditionalText(String additionalText) {
        this.additionalText = additionalText;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getIssuePrice() {
        return issuePrice;
    }

    public void setIssuePrice(int issuePrice) {
        this.issuePrice = issuePrice;
    }

    public int getListingGains() {
        return listingGains;
    }

    public void setListingGains(int listingGains) {
        this.listingGains = listingGains;
    }

    public int getListingPrice() {
        return listingPrice;
    }

    public void setListingPrice(int listingPrice) {
        this.listingPrice = listingPrice;
    }

    public String getBiddingStartDate() {
        return biddingStartDate;
    }

    public void setBiddingStartDate(String biddingStartDate) {
        this.biddingStartDate = biddingStartDate;
    }

    public String getBiddingEndDate() {
        return biddingEndDate;
    }

    public void setBiddingEndDate(String biddingEndDate) {
        this.biddingEndDate = biddingEndDate;
    }

    public String getListingDate() {
        return listingDate;
    }

    public void setListingDate(String listingDate) {
        this.listingDate = listingDate;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }
}
