package com.stocks.service;

import com.stocks.ApiResponse.PriceShockers.PriceShockersData;
import com.stocks.ApiResponse.HeaderHttp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class PriceShockersService {
    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;

    private final String url = "https://indian-stock-exchange-api2.p.rapidapi.com/price_shockers";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HeaderHttp header;

    public PriceShockersData getPriceShockers() {
        HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
        ResponseEntity<PriceShockersData> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                httpEntity,
                PriceShockersData.class
        );

        return response.getBody();
    }
}
