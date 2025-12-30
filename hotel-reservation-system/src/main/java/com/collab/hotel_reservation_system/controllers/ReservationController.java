package com.collab.hotel_reservation_system.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collab.hotel_reservation_system.models.Reservation;
import com.collab.hotel_reservation_system.services.ReservationService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/reservations")
public class ReservationController {
    private final ReservationService reservationService;
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    // GET REQUESTS
    @GetMapping
    public ResponseEntity<List<Reservation>> getAllReservations() {
        try {
            List<Reservation> res = reservationService.getAllReservations();
            return new ResponseEntity<>(res, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't retrieve all reservations", e.getMessage()).build();
        }
    }

    //later implement a getAllReservationsByUserId
    



    // POST REQUESTS




    // PUT REQUESTS




    // DELETE REQUEST
}
