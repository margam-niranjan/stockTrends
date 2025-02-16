package com.stocks.controller;

import com.stocks.ApiResponse.GenericApiResponse;
import com.stocks.service.AnalystRecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/analyst-recommendations")
public class AnalystRecommendationController {
    @Autowired
    AnalystRecommendationService analystRecommendationService;

    @GetMapping("/{stock}")
    public ResponseEntity<GenericApiResponse<Object>> getStockData(@PathVariable String stock) throws Exception {
        try{
            analystRecommendationService.setStock(stock);
            Object response = analystRecommendationService.getAnalystRecommendations();
            return ResponseEntity.ok(GenericApiResponse.success(response));
        }
        catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(GenericApiResponse.error("Invalid stats type: " + ex.getMessage()));

        } catch (Exception ex) {
            return ResponseEntity.status(500).body(GenericApiResponse.error("An error occurred: " + ex.getMessage()));
        }
    }
}
