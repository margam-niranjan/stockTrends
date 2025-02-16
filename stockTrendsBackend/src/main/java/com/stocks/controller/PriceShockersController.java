package com.stocks.controller;

import com.stocks.ApiResponse.GenericApiResponse;
import com.stocks.ApiResponse.PriceShockers.PriceShockersData;
import com.stocks.service.PriceShockersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/price-shockers")
public class PriceShockersController {
    @Autowired
    private PriceShockersService priceShockersService;
    @GetMapping
    public ResponseEntity<GenericApiResponse<Object>> getpriceShockers(){
        try{
            Object response = priceShockersService.getPriceShockers();
            return ResponseEntity.ok(GenericApiResponse.success(response));
        }
        catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(GenericApiResponse.error("Invalid stats type: " + ex.getMessage()));

        } catch (Exception ex) {
            return ResponseEntity.status(500).body(GenericApiResponse.error("An error occurred: " + ex.getMessage()));
        }
    }

}
