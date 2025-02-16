package com.stocks.controller;

import com.stocks.ApiResponse.CorporateActions.CorporateActionsData;
import com.stocks.ApiResponse.GenericApiResponse;
import com.stocks.service.CorporateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/corporate-actions")
public class CorporateActionController {
    @Autowired
    private CorporateService corporateService;
    @GetMapping("/{stock}")
    public ResponseEntity<GenericApiResponse<Object>> getCorporateActions(@PathVariable String stock) throws Exception{
        try{
            corporateService.setIndustry(stock);
            Object response = corporateService.getCorporateActions();
            return ResponseEntity.ok(GenericApiResponse.success(response));

        }catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(GenericApiResponse.error("Invalid stats type: " + ex.getMessage()));

        } catch (Exception ex) {
            return ResponseEntity.status(500).body(GenericApiResponse.error("An error occurred: " + ex.getMessage()));
        }
    }
}