package com.hotel.reservationapi.repository;

import com.hotel.reservationapi.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository
        extends JpaRepository<Reservation, Integer> {
}