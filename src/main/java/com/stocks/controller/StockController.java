package com.stocks.controller;

import com.stocks.ApiResponse.stockInfoByName.StockInfoByName;
import com.stocks.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/{stock}")
    public StockInfoByName getStockData(@PathVariable String stock) throws Exception {
        stockService.setStock(stock);
        return stockService.getStockInfo();
    }
}
