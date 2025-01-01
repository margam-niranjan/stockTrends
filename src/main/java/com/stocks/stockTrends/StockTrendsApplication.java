package com.stocks.stockTrends;

import com.stocks.ApiResponse.HeaderHttp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication
@ComponentScan(basePackages = "com.stocks")
public class StockTrendsApplication {
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	@Bean
	public HeaderHttp headerHttp() {
		return new HeaderHttp();
	}
	public static void main(String[] args) {
		SpringApplication.run(StockTrendsApplication.class, args);
	}
}