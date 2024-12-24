package com.stocks.controller;

import com.stocks.ApiResponse.mutualFunds.MutualFundsData;
import com.stocks.service.MutualFundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mutual-funds")
public class MutualFundsController {
    @Autowired
    MutualFundService mutualFundService;
    @GetMapping
    public MutualFundsData getMutual(){
        return mutualFundService.getMutualFunds();
    }
}
