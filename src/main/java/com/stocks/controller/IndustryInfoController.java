package com.stocks.controller;

import com.stocks.service.IndustrySearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/industry-info")
public class IndustryInfoController {
    @Autowired
    private IndustrySearchService industrySearchService;

    @GetMapping("/{industry}")
    public String getIndustryInfo(@PathVariable String industry) throws Exception{
        return industrySearchService.fetchIndustryInfo(industry);
    }
}