package com.stocks.service;

import com.stocks.ApiResponse.HeaderHttp;
import com.stocks.ApiResponse.Industry.IndustryData;
import com.stocks.ApiResponse.mutualFunds.MutualFundsData;
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
public class MutualFundService {
    private String fund;
    public void setFund(String fund){
        this.fund = fund;
    }
    @Value("${stock.api.host}")
    private String apiHost;
    @Value("${stock.api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;
    private final String url = "https://indian-stock-exchange-api2.p.rapidapi.com/mutual_fund_search?query=";
    StringBuilder stringBuilder = new StringBuilder(url);
    HeaderHttp header = new HeaderHttp();
    public List<MutualFundsData> getMutualFund(){
        String url = stringBuilder.append(fund).toString();
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey,apiHost));
        ResponseEntity<List<MutualFundsData>> response = restTemplate.exchange(url, HttpMethod.GET,httpEntity,new ParameterizedTypeReference<List<MutualFundsData>>() {});
        return response.getBody();
    }


}
