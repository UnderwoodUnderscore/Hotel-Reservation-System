package com.collab.hotel_reservation_system.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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
        return reservationRepository.findByDeletedFalse();
    }
    public Reservation findReservationById(int id) throws IllegalArgumentException {
        Optional<Reservation> res = reservationRepository.findById(id);
        if (res.isPresent() && res.get().isDeleted() == false) {
            return res.get();
        } else {
            throw new IllegalArgumentException("No user with that ID");
        }
    }



    // HANDLING POST REQUESTS
    public Reservation createReservation(Reservation newReservation) {
        return reservationRepository.save(newReservation);
    }



    // HANDLING PUT REQUESTS
    public Reservation updateReservation(int id, Reservation newReservation) throws NoSuchElementException {
        int returnedId = reservationRepository.updateReservationById(id, newReservation.getGuestId(), newReservation.getRoomId(), 
            newReservation.getStartDate(), newReservation.getEndDate(), newReservation.getNumGuests());
        
        if (returnedId != 0) {
            Reservation currReservation = findReservationById(returnedId);

            if (currReservation.isDeleted()) {
                throw new NoSuchElementException("Can't alter a deleted reservation!");
            } else {
                return currReservation;
            }
        } else {
            throw new NoSuchElementException("No reservation by that ID exists");
        }
    }



    // HANDLING DELETE REQUEST
    public void deleteReservation(int id) {
        reservationRepository.updateDeletedToTrueAtId(id);
    }
}
