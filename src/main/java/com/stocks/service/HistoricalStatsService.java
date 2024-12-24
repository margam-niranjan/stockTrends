package com.stocks.service;

import com.stocks.ApiResponse.HeaderHttp;
import com.stocks.ApiResponse.HistoricalStats.balanceSheet.BalanceHistoricalStatsData;
import com.stocks.ApiResponse.HistoricalStats.cashFlow.CashHistoricalStatsData;
import com.stocks.ApiResponse.HistoricalStats.nullData.NullHistoricalStatsData;
import com.stocks.ApiResponse.HistoricalStats.quaterResults.QuaterResultsHistoricalStatsData;
import com.stocks.ApiResponse.HistoricalStats.ratios.RatiosHistoricalStatsData;
import com.stocks.ApiResponse.HistoricalStats.shareHoldingPatternQuaterly.ShareHoldingHistoricalStatsData;
import com.stocks.ApiResponse.HistoricalStats.shareHoldingPatternyearly.ShareHoldingPatternYearlyHistoricalStatsData;
import com.stocks.ApiResponse.HistoricalStats.yoyResults.YoyResultsHistoricalStatsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HistoricalStatsService {
    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;

    private String stockname;
    String stats =new String();


    public void setStockname(String stockname) {
        this.stockname = stockname;
    }

    public String getStockname() {
        return stockname;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    @Autowired
    RestTemplate restTemplate;

    private String baseUrl = "https://indian-stock-exchange-api2.p.rapidapi.com/historical_stats?stock_name=";
    HeaderHttp header = new HeaderHttp();
    String url = new String();
    public Object processStats() {
        switch (stats) {
            case "quarter_results":
                return quarterResults();

            case "yoy_results":
                return yearlyResults();

            case "balancesheet":
                return balanceSheet();

            case "cashflow":
                return cashFlow();

            case "ratios":
                return ratios();

            case "shareHoldingPatternQuaterly":
                return shareHoldingPatternQuaterly();

            case "shareHoldingPatternYearly":
                return shareHoldingPatternYearly();

            case "":
                return nullHistoricalStatsData();

            default:
                throw new IllegalArgumentException("Invalid stats type. Supported: quarter_results, yoy_results, balancesheet, cashflow, ratios, shareHoldingPatternQuaterly, shareHoldingPatternYearly");
        }
    }
    public QuaterResultsHistoricalStatsData  quarterResults(){
        url = baseUrl + stockname + "&stats=quarter_results";
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<QuaterResultsHistoricalStatsData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, QuaterResultsHistoricalStatsData.class);
        return response.getBody();
    }
    public YoyResultsHistoricalStatsData yearlyResults(){
        url = baseUrl + stockname + "&stats=yoy_results";
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<YoyResultsHistoricalStatsData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, YoyResultsHistoricalStatsData.class);
        return response.getBody();
    }
    public BalanceHistoricalStatsData balanceSheet(){

        url = baseUrl + stockname + "&stats=balancesheet";
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<BalanceHistoricalStatsData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, BalanceHistoricalStatsData.class);
        return response.getBody();
    }
    public CashHistoricalStatsData cashFlow(){
        url = baseUrl + stockname + "&stats=cashflow";
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<CashHistoricalStatsData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, CashHistoricalStatsData.class);
        return response.getBody();
    }
    public RatiosHistoricalStatsData ratios(){
        url = baseUrl + stockname + "&stats=ratios";
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<RatiosHistoricalStatsData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, RatiosHistoricalStatsData.class);
        return response.getBody();
    }
    public ShareHoldingHistoricalStatsData shareHoldingPatternQuaterly(){
        url = baseUrl + stockname + "&stats=shareholding_pattern_quaterly";
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<ShareHoldingHistoricalStatsData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, ShareHoldingHistoricalStatsData.class);
        return response.getBody();
    }
    public ShareHoldingPatternYearlyHistoricalStatsData shareHoldingPatternYearly(){
        url = baseUrl + stockname + "&stats=shareholding_pattern_yearly";
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<ShareHoldingPatternYearlyHistoricalStatsData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, ShareHoldingPatternYearlyHistoricalStatsData.class);
        return response.getBody();
    }
    public NullHistoricalStatsData nullHistoricalStatsData(){
        url = baseUrl + stockname + "&stats=";
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<NullHistoricalStatsData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, NullHistoricalStatsData.class);
        return response.getBody();
    }

}

