package com.stocks.controller;

import com.stocks.ApiResponse.analystRecommendation.AnalystRecommendationData;
import com.stocks.service.AnalystRecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/analyst-recommendations")
public class AnalystRecommendationController {
    @Autowired
    private AnalystRecommendationService analystRecommendationService;

    @GetMapping("/{stock}")
    public AnalystRecommendationData getStockData(@PathVariable String stock) throws Exception {
        analystRecommendationService.setStock(stock);
        return analystRecommendationService.getAnalystRecommendations();
    }
}
