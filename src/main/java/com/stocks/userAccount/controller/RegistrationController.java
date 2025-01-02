package com.stocks.userAccount.controller;

import com.stocks.userAccount.accountData.UserData;
import com.stocks.userAccount.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/register")
    public ResponseEntity<UserData> register(@RequestBody UserData userData) {
        UserData savedUser = registrationService.registerUser(userData);
        return ResponseEntity.ok(savedUser);
    }
}
