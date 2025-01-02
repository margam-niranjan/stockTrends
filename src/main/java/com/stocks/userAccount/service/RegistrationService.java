package com.stocks.userAccount.service;

import com.stocks.userAccount.accountData.UserData;
import com.stocks.userAccount.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    private UserRepository userRepository;

    public UserData registerUser(UserData userData) {
        return userRepository.save(userData);
    }
}
