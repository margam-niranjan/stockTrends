package com.stocks.service;

import com.stocks.ApiResponse.HeaderHttp;
import com.stocks.ApiResponse.IPO.IpoData;
import com.stocks.ApiResponse.mutualFunds.MutualFundsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MutualFundService {
    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;
    private final String url="https://indian-stock-exchange-api2.p.rapidapi.com/mutual_funds";
    @Autowired
    RestTemplate restTemplate;
    HeaderHttp header = new HeaderHttp();
    public MutualFundsData getMutualFunds() {
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<MutualFundsData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, MutualFundsData.class);
        return response.getBody();
    }
}
