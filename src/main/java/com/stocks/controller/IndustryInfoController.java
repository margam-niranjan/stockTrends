package com.stocks.controller;

import com.stocks.ApiResponse.Industry.IndustryData;
import com.stocks.service.IndustrySearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/industry-info")
public class IndustryInfoController {

    @Autowired
    private IndustrySearchService industrySearchService;

    @GetMapping("/{industry}")
    public List<IndustryData> getIndustryInfo(@PathVariable String industry) throws Exception{
        industrySearchService.setIndustry(industry);
        return industrySearchService.getIndustries();
    }
}
