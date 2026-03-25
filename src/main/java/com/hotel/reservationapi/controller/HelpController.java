package com.hotel.reservationapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/help")
@CrossOrigin("*")
public class HelpController {

    @GetMapping
    public String getHelp(){

        return """
        Ocean View Resort System Help:

        1. Add Reservation - Enter guest details and save
        2. View Reservations - Click refresh to see all bookings
        3. Delete - Remove a reservation
        4. Bill - Calculate total cost based on stay
        5. Reports - View total reservations

        Use the system carefully to manage bookings efficiently.
        """;
    }
}