package com.hotel.reservationapi.controller;

import com.hotel.reservationapi.model.Reservation;
import com.hotel.reservationapi.model.Room;
import com.hotel.reservationapi.repository.RoomRepository;
import com.hotel.reservationapi.service.BillService;
import com.hotel.reservationapi.service.ReservationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bill")
@CrossOrigin("*")
public class BillController {

    private final ReservationService service;
    private final RoomRepository roomRepo;

    public BillController(ReservationService service, RoomRepository roomRepo){
        this.service = service;
        this.roomRepo = roomRepo;
    }

    @GetMapping("/{id}")
    public double calculate(@PathVariable int id){

        Reservation r = service.getReservation(id);

        Room room = roomRepo.findByRoomType(r.getRoomType());

        long days = java.time.temporal.ChronoUnit.DAYS.between(
                java.time.LocalDate.parse(r.getCheckIn()),
                java.time.LocalDate.parse(r.getCheckOut())
        );

        return days * room.getPrice();
    }
}