package com.stocks.service;

import com.stocks.ApiResponse.HeaderHttp;
import com.stocks.ApiResponse.stockForecasts.StockForecastsData;
import com.stocks.ApiResponse.stockInfoByName.StockInfoByName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class StockForecastService {
    private String stock;
    private String measureCode;
    private String periodType;
    private String dataType;
    private String age;

    String[] measureCodeArr = {"EPS","CPS","CPX","DPS","EBI","EBT","GPS","GRM","NAV","NDT","NET","PRE","ROA","ROE","SAL"};
    List<String> measureCodeLst = Arrays.asList(measureCodeArr);
    String[] periodTypeArr = {"Annual","Interim"};
    List<String> periodTypelst = Arrays.asList(periodTypeArr);
    String[] dataTypeArr = {"Actuals","Estimates"};
    List<String> dataTypeLst = Arrays.asList(dataTypeArr);
    String[] ageArr = {"Current","OneWeekAgo","ThirtyDaysAgo","SixtyDaysAgo","NinetyDaysAgo"};
    List<String> ageLst = Arrays.asList(ageArr);


    public void setStockName(String stock) {
        this.stock = stock;
    }

    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public void setAge(String age) {
        this.age = age;
    }
    @Value("${stock.api.key}")
    private String apiKey;

    @Value("${stock.api.host}")
    private String apiHost;

    @Autowired
    RestTemplate restTemplate;
    HeaderHttp header = new HeaderHttp();
    private final String baseUrl = "https://indian-stock-exchange-api2.p.rapidapi.com/stock_forecasts?";
    public StockForecastsData getForecastOfStock(){
        if(measureCodeLst.contains(measureCode) && periodTypelst.contains(periodType) && dataTypeLst.contains(dataType) && ageLst.contains(age)){
            HttpEntity<Void> httpEntity = new HttpEntity<>(header.getHttpHeader(apiKey, apiHost));
            String url = baseUrl +
                    "stock_id=" + stock +
                    "&measure_code=" + measureCode +
                    "&period_type=" + periodType +
                    "&data_type=" + dataType +
                    "&age=" + age;
            ResponseEntity<StockForecastsData> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, StockForecastsData.class);
            return response.getBody();
        }
            return null;
    }

}
