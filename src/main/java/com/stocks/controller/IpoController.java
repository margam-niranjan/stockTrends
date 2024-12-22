package com.stocks.controller;

import com.stocks.ApiResponse.IPO.IpoData;
import com.stocks.service.IpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ipo")
public class IpoController {
    @Autowired
    private IpoService ipoService;
    @GetMapping
    public IpoData getIpo()throws Exception{
        return ipoService.getIpo();
    }
}
