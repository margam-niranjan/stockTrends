package com.stocks.controller;

import com.stocks.ApiResponse.GenericApiResponse;
import com.stocks.service.BseMostActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/bse-active")
public class BseMostActiveController {
    @Autowired
    BseMostActiveService bseMostActiveService;
    @GetMapping
    public ResponseEntity<GenericApiResponse<Object>> getBseActive()throws Exception{
        try{
            Object response = bseMostActiveService.getBseActive();
            return ResponseEntity.ok(GenericApiResponse.success(response));
        }
        catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(GenericApiResponse.error("Invalid stats type: " + ex.getMessage()));

        } catch (Exception ex) {
            return ResponseEntity.status(500).body(GenericApiResponse.error("An error occurred: " + ex.getMessage()));
        }
    }
}
