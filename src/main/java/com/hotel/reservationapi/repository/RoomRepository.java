package com.hotel.reservationapi.repository;

import com.hotel.reservationapi.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository
        extends JpaRepository<Room, Integer> {

    Room findByRoomType(String roomType);
}