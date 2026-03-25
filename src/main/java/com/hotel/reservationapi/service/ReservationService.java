package com.hotel.reservationapi.service;

import com.hotel.reservationapi.model.Reservation;
import com.hotel.reservationapi.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository repository;

    public ReservationService(ReservationRepository repository){
        this.repository = repository;
    }

    public Reservation addReservation(Reservation r){
        return repository.save(r);
    }

    public List<Reservation> getAllReservations(){
        return repository.findAll();
    }

    public Reservation getReservation(int id){
        return repository.findById(id).orElse(null);
    }

    public void deleteReservation(int id){
        repository.deleteById(id);
    }

    public long getTotalReservations(){
        return repository.count();
    }
}