package com.stocks.ApiResponse.Industry;

import java.util.Map;
public class IndustryData {
    private String id;
    private String commonName;
    private String mgIndustry;
    private String mgSector;
    private String stockType;
    private String exchangeCodeBse;
    private String exchangeCodeNsi;
    private String bseRic;
    private String nseRic;
    private Map<String, String> activeStockTrends;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCommonName() { return commonName; }
    public void setCommonName(String commonName) { this.commonName = commonName; }

    public String getMgIndustry() { return mgIndustry; }
    public void setMgIndustry(String mgIndustry) { this.mgIndustry = mgIndustry; }

    public String getMgSector() { return mgSector; }
    public void setMgSector(String mgSector) { this.mgSector = mgSector; }

    public String getStockType() { return stockType; }
    public void setStockType(String stockType) { this.stockType = stockType; }

    public String getExchangeCodeBse() { return exchangeCodeBse; }
    public void setExchangeCodeBse(String exchangeCodeBse) { this.exchangeCodeBse = exchangeCodeBse; }

    public String getExchangeCodeNsi() { return exchangeCodeNsi; }
    public void setExchangeCodeNsi(String exchangeCodeNsi) { this.exchangeCodeNsi = exchangeCodeNsi; }

    public String getBseRic() { return bseRic; }
    public void setBseRic(String bseRic) { this.bseRic = bseRic; }

    public String getNseRic() { return nseRic; }
    public void setNseRic(String nseRic) { this.nseRic = nseRic; }

    public Map<String, String> getActiveStockTrends() { return activeStockTrends; }
    public void setActiveStockTrends(Map<String, String> activeStockTrends) { this.activeStockTrends = activeStockTrends; }
}
