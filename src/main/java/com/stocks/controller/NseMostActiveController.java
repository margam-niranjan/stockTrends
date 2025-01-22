package com.stocks.controller;

import com.stocks.ApiResponse.GenericApiResponse;
import com.stocks.ApiResponse.nseMostActive.NseMostActiveData;
import com.stocks.service.NseMostActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nse-active")
public class NseMostActiveController {
    @Autowired
    NseMostActiveService nseMostActiveService;
    @GetMapping
    public ResponseEntity<GenericApiResponse<Object>> getNseActive()throws Exception{
        try{
            List<NseMostActiveData> response = nseMostActiveService.getNseActive();
            return ResponseEntity.ok(GenericApiResponse.success(response));
        }
        catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(GenericApiResponse.error("Invalid stats type: " + ex.getMessage()));

        } catch (Exception ex) {
            return ResponseEntity.status(500).body(GenericApiResponse.error("An error occurred: " + ex.getMessage()));
        }
    }
}
