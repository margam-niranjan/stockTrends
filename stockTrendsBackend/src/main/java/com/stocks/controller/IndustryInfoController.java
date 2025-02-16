package com.stocks.controller;

import com.stocks.ApiResponse.GenericApiResponse;
import com.stocks.ApiResponse.Industry.IndustryData;
import com.stocks.service.IndustrySearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/industry-info")
public class IndustryInfoController {

    @Autowired
    private IndustrySearchService industrySearchService;

    @GetMapping("/{industry}")
    public ResponseEntity<GenericApiResponse<Object>> getIndustryInfo(@PathVariable String industry) {
        try {
            industrySearchService.setIndustry(industry);
            List<IndustryData> industries = industrySearchService.getIndustries();
            return ResponseEntity.ok(GenericApiResponse.success(industries));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(GenericApiResponse.error("Error fetching industry info: " + e.getMessage()));
        }
    }
}