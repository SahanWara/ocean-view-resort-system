package com.hotel.reservationapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/system")
@CrossOrigin("*")
public class SystemController {

    @GetMapping("/exit")
    public String exitSystem(){

        System.out.println("System Exit Requested");

        return "System shutting down...";
    }
}