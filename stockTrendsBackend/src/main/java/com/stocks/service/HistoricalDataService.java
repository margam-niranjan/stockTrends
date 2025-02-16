package com.stocks.service;

import com.stocks.ApiResponse.HeaderHttp;
import com.stocks.ApiResponse.historicalData.clientFailureData.HistoricalFailureData;
import com.stocks.ApiResponse.historicalData.clientRequestSucess.HistoricalSuccessData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class HistoricalDataService {
    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;

    private String stockname;
    String period=new String();
    String filter= new String();

    public String getStockname() {
        return stockname;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
    @Autowired
    RestTemplate restTemplate;

    private String baseUrl ="https://indian-stock-exchange-api2.p.rapidapi.com/historical_data?stock_name=";
    HeaderHttp header = new HeaderHttp();
    String url = new String();
    boolean containsUrl=false;

    public Object processData() {
        if (period.isEmpty() || filter.isEmpty()) {
            return getFailureData();
        } else {
            return getSuccessData();
        }
    }
    public HistoricalSuccessData getSuccessData() {
        url = baseUrl + stockname +"&period="+period+"&filter="+filter;
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<String> rawResponse = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
        System.out.println("Raw Response: " + rawResponse.getBody());
        ResponseEntity<HistoricalSuccessData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, HistoricalSuccessData.class);
        return response.getBody();

    }
    public HistoricalFailureData getFailureData(){
        url = baseUrl + stockname;
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<HistoricalFailureData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, HistoricalFailureData.class);
        return response.getBody();


    }


}
