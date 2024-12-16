package com.stocks.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class StockService {
    HttpResponse<String> response;
    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;

    public String fetchStockData(String stockName) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
//        https://indian-stock-exchange-api2.p.rapidapi.com/stock?name=tata%20steel
                .uri(URI.create("https://" + apiHost + "/stock?name=" + stockName))
                .header("x-rapidapi-key", apiKey)
                .header("x-rapidapi-host", apiHost)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

}
