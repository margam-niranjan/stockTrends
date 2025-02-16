package com.stocks.controller;

import com.stocks.ApiResponse.GenericApiResponse;
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
    public ResponseEntity<GenericApiResponse<Object>> getStockData(@PathVariable String stock) throws Exception {
        try{
            stockService.setStock(stock);
            Object respose = stockService.getStockInfo();
            return ResponseEntity.ok(GenericApiResponse.success(respose));
        }
        catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(GenericApiResponse.error("Invalid stats type: " + ex.getMessage()));

        } catch (Exception ex) {
            return ResponseEntity.status(500).body(GenericApiResponse.error("An error occurred: " + ex.getMessage()));
        }
    }
}
