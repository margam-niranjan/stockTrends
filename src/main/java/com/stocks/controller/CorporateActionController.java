package com.stocks.controller;

import com.stocks.service.CorporateService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String getCorporateActions(@PathVariable String stock) throws Exception{
        return corporateService.fetchCorporate(stock);
    }
}
