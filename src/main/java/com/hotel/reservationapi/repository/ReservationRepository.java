package com.hotel.reservationapi.repository;

import com.hotel.reservationapi.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

// This method saves reservation to database
public interface ReservationRepository
        extends JpaRepository<Reservation, Integer> {
}
