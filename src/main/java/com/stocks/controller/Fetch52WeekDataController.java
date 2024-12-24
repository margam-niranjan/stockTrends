package com.stocks.controller;

import com.stocks.ApiResponse.fetch52WeekData.FetchYearData;
import com.stocks.service.Fetch52WeekDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fetch52week-data")
public class Fetch52WeekDataController {
    @Autowired
    private Fetch52WeekDataService fetchYearDataService;

    @GetMapping
    public FetchYearData getStockData() throws Exception {
        return fetchYearDataService.getStockInfo();
    }
}
