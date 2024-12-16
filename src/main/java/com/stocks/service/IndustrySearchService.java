package com.stocks.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class IndustrySearchService {
    HttpResponse<String> response;

    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;



    public String fetchIndustryInfo(String stockName) throws Exception {

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://" + apiHost + "/industry_search?query=" + stockName))
                .header("x-rapidapi-key", apiKey)
                .header("x-rapidapi-host", apiHost)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        response = HttpClient.newHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();

    }
}
