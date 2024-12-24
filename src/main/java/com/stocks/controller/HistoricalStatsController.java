package com.stocks.controller;

import com.stocks.ApiResponse.GenericApiResponse;
import com.stocks.service.HistoricalStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historic-stats")
public class HistoricalStatsController {

    @Autowired
    HistoricalStatsService historicalStatsService;

    @RequestMapping("/{stock}")
    public ResponseEntity<GenericApiResponse<Object>> getHistoricData(
            @PathVariable String stock,
            @RequestParam String stats) {

        try {
            // Set stock name and stats type
            historicalStatsService.setStockname(stock);
            historicalStatsService.setStats(stats);

            // Process the stats and get the result
            Object response = historicalStatsService.processStats();
            return ResponseEntity.ok(GenericApiResponse.success(response));

        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(GenericApiResponse.error("Invalid stats type: " + ex.getMessage()));

        } catch (Exception ex) {
            return ResponseEntity.status(500).body(GenericApiResponse.error("An error occurred: " + ex.getMessage()));
        }
    }
}
