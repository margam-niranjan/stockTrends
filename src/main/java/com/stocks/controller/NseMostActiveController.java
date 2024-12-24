package com.stocks.controller;

import com.stocks.ApiResponse.nseMostActive.NseMostActiveData;
import com.stocks.service.NseMostActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nse-active")
public class NseMostActiveController {
    @Autowired
    NseMostActiveService nseMostActiveService;
    @GetMapping("/")
    public List<NseMostActiveData> getNseActive()throws Exception{
   return nseMostActiveService.getNseActive();
    }
}
