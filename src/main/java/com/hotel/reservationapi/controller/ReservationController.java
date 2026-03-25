package com.hotel.reservationapi.controller;

import com.hotel.reservationapi.model.Reservation;
import com.hotel.reservationapi.service.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
@CrossOrigin("*")
public class ReservationController {

    private final ReservationService service;

    public ReservationController(ReservationService service){
        this.service = service;
    }

    @PostMapping
    public Reservation addReservation(@RequestBody Reservation reservation){
        return service.addReservation(reservation);
    }

    @GetMapping
    public List<Reservation> getAll(){
        return service.getAllReservations();
    }

    @GetMapping("/{id}")
    public Reservation getById(@PathVariable int id){
        return service.getReservation(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        service.deleteReservation(id);
    }
}