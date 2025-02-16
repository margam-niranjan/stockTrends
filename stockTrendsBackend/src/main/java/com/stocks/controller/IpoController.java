package com.stocks.controller;

import com.stocks.ApiResponse.GenericApiResponse;
import com.stocks.ApiResponse.IPO.IpoData;
import com.stocks.service.IpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.GenericDeclaration;
import java.util.List;

@RestController
@RequestMapping("/ipo")
public class IpoController {
    @Autowired
    private IpoService ipoService;
    @GetMapping
    public ResponseEntity<GenericApiResponse<Object>> getIpo()throws Exception{
        try{
            Object response = ipoService.getIpo();
            return ResponseEntity.ok(GenericApiResponse.success(response));
        }
        catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(GenericApiResponse.error("Invalid stats type: " + ex.getMessage()));

        } catch (Exception ex) {
            return ResponseEntity.status(500).body(GenericApiResponse.error("An error occurred: " + ex.getMessage()));
        }
    }
}
