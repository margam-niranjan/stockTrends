package com.stocks.ApiResponse.IPO.closedIpo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class ClosedIpoData {
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("name")
    private String name;
    @JsonProperty("status")
    private String status;

    @JsonProperty("is_sme")
    private Boolean isSme;  // Use Boolean to allow null

    @JsonProperty("additional_text")
    private String additionalText;

    @JsonProperty("min_price")
    private Integer minPrice;  // Use Integer to allow null

    @JsonProperty("max_price")
    private Integer maxPrice;  // Use Integer to allow null

    @JsonProperty("issue_price")
    private Integer issuePrice;  // Use Integer to allow null

    @JsonProperty("listing_gains")
    private Integer listingGains;  // Use Integer to allow null

    @JsonProperty("listing_price")
    private Integer listingPrice;  // Use Integer to allow null

    @JsonProperty("bidding_start_date")
    private String biddingStartDate;

    @JsonProperty("bidding_end_date")
    private String biddingEndDate;

    @JsonProperty("listing_date")
    private LocalDate listingDate;

    @JsonProperty("lot_size")
    private Integer lotSize;  // Use Integer to allow null

    @JsonProperty("document_url")
    private String documentUrl;

    public String getAdditionalText() {
        return additionalText;
    }

    public void setAdditionalText(String additionalText) {
        this.additionalText = additionalText;
    }

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

    public Boolean getSme() {
        return isSme;
    }

    public void setSme(Boolean sme) {
        isSme = sme;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getIssuePrice() {
        return issuePrice;
    }

    public void setIssuePrice(Integer issuePrice) {
        this.issuePrice = issuePrice;
    }

    public Integer getListingGains() {
        return listingGains;
    }

    public void setListingGains(Integer listingGains) {
        this.listingGains = listingGains;
    }

    public Integer getListingPrice() {
        return listingPrice;
    }

    public void setListingPrice(Integer listingPrice) {
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

    public LocalDate getListingDate() {
        return listingDate;
    }

    public void setListingDate(LocalDate listingDate) {
        this.listingDate = listingDate;
    }

    public Integer getLotSize() {
        return lotSize;
    }

    public void setLotSize(Integer lotSize) {
        this.lotSize = lotSize;
    }

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }
}
