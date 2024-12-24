package com.stocks.controller;

import com.stocks.ApiResponse.mutualFundsSearch.MutualFundsSearchData;
import com.stocks.service.MutualFundSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mutual-funds-search")
public class MutualFundSearchController {
    @Autowired
    MutualFundSearchService mutualFundSearchService;
    @GetMapping("/{fund}")
    public List<MutualFundsSearchData> getMutual(@PathVariable String fund){
        mutualFundSearchService.setFund(fund);
        return mutualFundSearchService.getMutualFund();
    }
}
