package com.stocks.controller;

import com.stocks.ApiResponse.bseActiveStocks.BseMostActiveData;
import com.stocks.service.BseMostActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bse-active")
public class BseMostActiveController {
    @Autowired
    BseMostActiveService bseMostActiveService;
    @GetMapping
    public List<BseMostActiveData> getBseActive()throws Exception{
        return bseMostActiveService.getBseActive();
    }
}
