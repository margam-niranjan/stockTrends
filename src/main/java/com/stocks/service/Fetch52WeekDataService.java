package com.stocks.service;

import com.stocks.ApiResponse.HeaderHttp;
import com.stocks.ApiResponse.fetch52WeekData.FetchYearData;
import com.stocks.ApiResponse.stockInfoByName.StockInfoByName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Fetch52WeekDataService {

    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;
    private final String url="https://indian-stock-exchange-api2.p.rapidapi.com/fetch_52_week_high_low_data";
    @Autowired
    private RestTemplate restTemplate;
    StringBuilder stringBuilder = new StringBuilder(url);
    HeaderHttp header = new HeaderHttp();
    public FetchYearData getStockInfo(){
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<FetchYearData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, FetchYearData.class);
        return response.getBody();
    }
}
