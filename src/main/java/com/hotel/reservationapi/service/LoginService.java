package com.hotel.reservationapi.service;

import com.hotel.reservationapi.model.User;
import com.hotel.reservationapi.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final UserRepository repository;

    public LoginService(UserRepository repository){
        this.repository = repository;
    }

    public User login(String username, String password){
        return repository.findByUsernameAndPassword(username, password);
    }
}

