package com.stocks.ApiResponse.TrendingStocks;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TrendingStocks {
    @JsonProperty("top_gainers")
    private List<TopGainers> gainers;
    @JsonProperty("top_losers")
    private List<TopLosers> losers;

    public List<TopGainers> getGainers() {
        return gainers;
    }

    public void setGainers(List<TopGainers> gainers) {
        this.gainers = gainers;
    }

    public List<TopLosers> getLosers() {
        return losers;
    }

    public void setLosers(List<TopLosers> losers) {
        this.losers = losers;
    }
}
