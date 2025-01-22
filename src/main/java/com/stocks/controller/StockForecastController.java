package com.stocks.controller;

import com.stocks.ApiResponse.GenericApiResponse;
import com.stocks.ApiResponse.stockForecasts.StockForecastsData;
import com.stocks.service.StockForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock-forecast")
public class StockForecastController {
    @Autowired
    StockForecastService stockForecastService;
    @GetMapping
    public ResponseEntity<GenericApiResponse<Object>> getForecast(
            @RequestParam(required = true)String stock,
            @RequestParam(required = false, defaultValue = "CPS")String measureCode,
            @RequestParam(required = false, defaultValue = "Annual")String periodType,
            @RequestParam(required = false, defaultValue = "Actuals")String dataType,
            @RequestParam(required = false, defaultValue = "Current")String age
    ){
        try{
            stockForecastService.setStockName(stock);
            stockForecastService.setMeasureCode(measureCode);
            stockForecastService.setPeriodType(periodType);
            stockForecastService.setDataType(dataType);
            stockForecastService.setAge(age);
            Object response = stockForecastService.getForecastOfStock();
            return ResponseEntity.ok(GenericApiResponse.success(response));
        }
        catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(GenericApiResponse.error("Invalid stats type: " + ex.getMessage()));

        } catch (Exception ex) {
            return ResponseEntity.status(500).body(GenericApiResponse.error("An error occurred: " + ex.getMessage()));
        }

    }
}
