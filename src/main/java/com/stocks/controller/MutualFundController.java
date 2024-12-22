package com.stocks.controller;

import com.stocks.ApiResponse.mutualFunds.MutualFundsData;
import com.stocks.service.MutualFundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mutual-funds")
public class MutualFundController {
    @Autowired
    MutualFundService mutualFundService;
    @GetMapping("/{fund}")
    public List<MutualFundsData> getMutual(@PathVariable String fund){
        mutualFundService.setFund(fund);
        return mutualFundService.getMutualFund();
    }
}
