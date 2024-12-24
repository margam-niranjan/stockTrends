package com.stocks.controller;

import com.stocks.ApiResponse.GenericApiResponse;
import com.stocks.service.HistoricalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/historical-data")
public class HistoricalDataController {
    @Autowired
    HistoricalDataService historicalDataService;
    @GetMapping("/{stock}")
    public ResponseEntity<GenericApiResponse<Object>> getHistoricData(@PathVariable String stock,@RequestParam String period,@RequestParam String filter) throws Exception{
        historicalDataService.setPeriod(period);
        historicalDataService.setFilter(filter);
        historicalDataService.setStockname(stock);
        Object response  = historicalDataService.processData();
        return ResponseEntity.ok(GenericApiResponse.success(response));



    }
}
