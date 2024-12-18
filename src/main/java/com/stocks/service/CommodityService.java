package com.stocks.service;

import com.stocks.ApiResponse.Commodity.CommodityData;
import com.stocks.ApiResponse.HeaderHttp;
import com.stocks.ApiResponse.Industry.IndustryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class CommodityService {
    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;
    private final String url="https://indian-stock-exchange-api2.p.rapidapi.com/commodities";
    @Autowired
    private RestTemplate restTemplate;
    HeaderHttp header = new HeaderHttp();
    public List<CommodityData> getCommodity(){
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey,apiHost));
        ResponseEntity<List<CommodityData>> response = restTemplate.exchange(url, HttpMethod.GET,httpEntity, new ParameterizedTypeReference<List<CommodityData>>() {});
        return response.getBody();
    }


}
