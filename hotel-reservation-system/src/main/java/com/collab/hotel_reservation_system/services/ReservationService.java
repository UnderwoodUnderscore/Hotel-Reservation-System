package com.collab.hotel_reservation_system.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.collab.hotel_reservation_system.models.Reservation;
import com.collab.hotel_reservation_system.repositories.ReservationRepository;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    // HANDLING GET REQUESTS
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }



    // HANDLING POST REQUESTS




    // HANDLING PUT REQUESTS




    // HANDLING DELETE REQUEST
}
