package com.stocks.service;

import com.stocks.ApiResponse.HeaderHttp;
import com.stocks.ApiResponse.analystRecommendation.AnalystRecommendationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class AnalystRecommendationService {
    private String stock;
    public void setStock(String stock){
        this.stock = stock;
    }
    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;
    @Autowired
    private RestTemplate restTemplate;
    private String basrurl = "https://indian-stock-exchange-api2.p.rapidapi.com/stock_target_price?stock_id=";
    String url = new String();
    HeaderHttp header = new HeaderHttp();


    public AnalystRecommendationData getAnalystRecommendations() {
        String url = basrurl + stock;
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<AnalystRecommendationData> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                httpEntity,
                AnalystRecommendationData.class
        );
        return response.getBody();
    }
}
