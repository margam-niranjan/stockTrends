package com.stocks.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class CorporateService {
    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;

    public String fetchCorporate(String stockName) throws Exception{
        HttpRequest httpRequest = HttpRequest.newBuilder()
//        https://indian-stock-exchange-api2.p.rapidapi.com/corporate_actions?stock_name=infosys
                .uri(URI.create("https://"+apiHost+"/corporate_actions?stock_name="+stockName))
                .header("x-rapidapi-key", apiKey)
                .header("x-rapidapi-host", apiHost)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
