package com.stocks.ApiResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Arrays;

public class HeaderHttp {

    public HttpHeaders getHttpHeader(String apiKey,String apiHost){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-rapidapi-key", apiKey);
        headers.set("x-rapidapi-host", apiHost);
        return headers;
    }

}
