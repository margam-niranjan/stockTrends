package com.stocks.service;

import com.stocks.ApiResponse.HeaderHttp;
import com.stocks.ApiResponse.trendingStocks.TrendingStocksData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TrendingStocksService {

    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;

    private final String url = "https://indian-stock-exchange-api2.p.rapidapi.com/trending";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HeaderHttp header;

    public TrendingStocksData getTrendingStocks() {
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<TrendingStocksData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, TrendingStocksData.class);
        return response.getBody();
    }
}
