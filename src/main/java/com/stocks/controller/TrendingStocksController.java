package com.stocks.controller;

import com.stocks.ApiResponse.GenericApiResponse;
import com.stocks.ApiResponse.trendingStocks.TrendingStocksData;
import com.stocks.service.TrendingStocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trending-stocks")
public class TrendingStocksController {
    @Autowired
    private TrendingStocksService trendingStocksService;
    @GetMapping
    public ResponseEntity<GenericApiResponse<Object>> getTrendingStocks()throws Exception{
        try{
            Object response = trendingStocksService.getTrendingStocks();
            return ResponseEntity.ok(GenericApiResponse.success(response));
        }
        catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(GenericApiResponse.error("Invalid stats type: " + ex.getMessage()));

        } catch (Exception ex) {
            return ResponseEntity.status(500).body(GenericApiResponse.error("An error occurred: " + ex.getMessage()));
        }
    }

}
