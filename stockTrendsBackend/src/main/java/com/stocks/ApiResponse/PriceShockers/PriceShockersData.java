package com.stocks.ApiResponse.PriceShockers;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PriceShockersData {
    @JsonProperty("BSE_PriceShocker")
    private List<PriceShocker> bsePriceShocker;

    @JsonProperty("NSE_PriceShocker")
    private List<PriceShocker> nsePriceShocker;

    // Getters and Setters
    public List<PriceShocker> getBsePriceShocker() {
        return bsePriceShocker;
    }

    public void setBsePriceShocker(List<PriceShocker> bsePriceShocker) {
        this.bsePriceShocker = bsePriceShocker;
    }

    public List<PriceShocker> getNsePriceShocker() {
        return nsePriceShocker;
    }

    public void setNsePriceShocker(List<PriceShocker> nsePriceShocker) {
        this.nsePriceShocker = nsePriceShocker;
    }
}
