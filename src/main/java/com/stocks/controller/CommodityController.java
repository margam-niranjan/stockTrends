package com.stocks.controller;

import com.stocks.ApiResponse.Commodity.CommodityData;
import com.stocks.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commodity-futures")
public class CommodityController {
    @Autowired
    private CommodityService commodityService;
    @GetMapping("/")
    public List<CommodityData> getCommodity() throws Exception{
     return commodityService.getCommodity();
    }
}
