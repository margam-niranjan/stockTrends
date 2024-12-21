package com.stocks.service;

import com.stocks.ApiResponse.Commodity.CommodityData;
import com.stocks.ApiResponse.CorporateActions.CorporateActionsData;
import com.stocks.ApiResponse.HeaderHttp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@Service
public class CorporateService {
    private String industry;
    public void setIndustry(String industry){
        this.industry = industry;
    }
    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;
    private final String url="https://indian-stock-exchange-api2.p.rapidapi.com/corporate_actions?stock_name=";
    @Autowired
    private RestTemplate restTemplate;
    StringBuilder stringBuilder = new StringBuilder(url);
    HeaderHttp header = new HeaderHttp();
    public CorporateActionsData getCorporateActions(){
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey,apiHost));
        String url = stringBuilder.append(industry).toString();
        ResponseEntity<CorporateActionsData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, CorporateActionsData.class);
        return response.getBody();
    }
}
