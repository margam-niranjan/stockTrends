package com.stocks.service;

import com.stocks.ApiResponse.HeaderHttp;
import com.stocks.ApiResponse.Industry.IndustryData;
import com.stocks.dto.IndustryInfo;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class IndustrySearchService implements IndustryInfo {
    private String industry;
    public void setIndustry(String industry){
        this.industry = industry;
    }
    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;
    private final String url = "https://indian-stock-exchange-api2.p.rapidapi.com/industry_search?query=";

    @Autowired
    private RestTemplate restTemplate;

    HeaderHttp header = new HeaderHttp();

    StringBuilder stringBuilder = new StringBuilder(url);
    @Override
    public List<IndustryData> getIndustries() {
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey,apiHost));
        String url = stringBuilder.append(industry).toString();
        ResponseEntity<List<IndustryData>> response = restTemplate.exchange(url, HttpMethod.GET,httpEntity, new ParameterizedTypeReference<List<IndustryData>>() {});
        return response.getBody();
    }


}
