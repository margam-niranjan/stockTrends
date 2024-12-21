package com.stocks.service;

import com.stocks.ApiResponse.Commodity.CommodityData;
import com.stocks.ApiResponse.HeaderHttp;
import com.stocks.ApiResponse.IPO.IpoData;
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
public class IpoService {
    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;
    private final String url="https://indian-stock-exchange-api2.p.rapidapi.com/ipo";
    @Autowired
    RestTemplate restTemplate;
    HeaderHttp header = new HeaderHttp();
    public List<IpoData> getIpo() {
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<List<IpoData>> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<IpoData>>() {
        });
        return response.getBody();
    }
}
