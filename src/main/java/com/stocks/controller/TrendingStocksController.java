package com.stocks.controller;

import com.stocks.ApiResponse.TrendingStocks.TrendingStocks;
import com.stocks.ApiResponse.TrendingStocks.TrendingStocksData;
import com.stocks.service.TrendingStocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trending-stocks")
public class TrendingStocksController {
    @Autowired
    private TrendingStocksService trendingStocksService;
    @GetMapping("/")
    public TrendingStocks getTrendingStocks()throws Exception{
        return trendingStocksService.getTrendingStocks();
    }

}
