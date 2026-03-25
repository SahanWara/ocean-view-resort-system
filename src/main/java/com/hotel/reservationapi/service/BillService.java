package com.hotel.reservationapi.service;

import com.hotel.reservationapi.model.Room;
import com.hotel.reservationapi.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class BillService {

    private final RoomRepository roomRepository;

    public BillService(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    public double calculateBill(String roomType, String checkIn, String checkOut){

        Room room = roomRepository.findByRoomType(roomType);

        if(room == null){
            return 0;
        }

        LocalDate in = LocalDate.parse(checkIn);
        LocalDate out = LocalDate.parse(checkOut);

        long nights = ChronoUnit.DAYS.between(in, out);

        return nights * room.getPrice();
    }
}