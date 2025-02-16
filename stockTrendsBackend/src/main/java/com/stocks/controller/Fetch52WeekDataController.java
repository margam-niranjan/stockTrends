package com.stocks.controller;

import com.stocks.ApiResponse.GenericApiResponse;
import com.stocks.ApiResponse.fetch52WeekData.FetchYearData;
import com.stocks.service.Fetch52WeekDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<GenericApiResponse<Object>> getStockData() throws Exception {
        try{
            Object response = fetchYearDataService.getStockInfo();
            return ResponseEntity.ok(GenericApiResponse.success(response));
        }catch (IllegalArgumentException ex) {
        return ResponseEntity.badRequest().body(GenericApiResponse.error("Invalid stats type: " + ex.getMessage()));

        } catch (Exception ex) {
            return ResponseEntity.status(500).body(GenericApiResponse.error("An error occurred: " + ex.getMessage()));
        }
    }
}
