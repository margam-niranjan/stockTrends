package com.stocks.controller;

import com.stocks.ApiResponse.PriceShockers.PriceShockersData;
import com.stocks.service.PriceShockersService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public PriceShockersData getpriceShockers(){
        return priceShockersService.getPriceShockers();
    }
}
