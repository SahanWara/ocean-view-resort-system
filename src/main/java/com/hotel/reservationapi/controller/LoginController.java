package com.hotel.reservationapi.controller;

import com.hotel.reservationapi.model.User;
import com.hotel.reservationapi.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
@CrossOrigin("*")
public class LoginController {

    private final UserRepository repo;

    public LoginController(UserRepository repo){
        this.repo = repo;
    }

    @PostMapping
    public String login(@RequestBody User user){

        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());

        User u = repo.findByUsernameAndPassword(
                user.getUsername().trim(),
                user.getPassword().trim()
        );

        if(u != null){
            return "SUCCESS";
        } else {
            return "FAIL";
        }
    }

}