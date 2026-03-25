package com.hotel.reservationapi.controller;

import com.hotel.reservationapi.model.Reservation;
import com.hotel.reservationapi.service.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin("*")
public class ReportController {

    private final ReservationService service;

    public ReportController(ReservationService service){
        this.service = service;
    }

    @GetMapping("/count")
    public long getTotal(){
        return service.getAllReservations().size();
    }

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return service.getAllReservations();
    }
}