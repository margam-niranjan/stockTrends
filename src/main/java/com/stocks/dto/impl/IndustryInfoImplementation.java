package com.stocks.dto.impl;

import com.stocks.dto.IndustryInfo;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class IndustryInfoImplementation implements IndustryInfo {

    private String industry;
    public void setIndustry(String industry){
        this.industry = industry;
    }
    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;

    private String url = "https://indian-stock-exchange-api2.p.rapidapi.com/industry_search?query=";

    @Autowired
    private RestTemplate restTemplate;

    StringBuilder stringBuilder = new StringBuilder(url);
    @Override
    public List<Map<String, Object>> getIndustries() {
        HttpEntity<Void> httpEntity = new HttpEntity<>(getHttpHeader());
        String url = stringBuilder.append(industry).toString();
        ResponseEntity<List> response = restTemplate.exchange(url, HttpMethod.GET,httpEntity, List.class);
        return response.getBody();
    }
    HttpHeaders getHttpHeader(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-rapidapi-key", apiKey);
        headers.set("x-rapidapi-host", apiHost);
        return headers;
    }
}
