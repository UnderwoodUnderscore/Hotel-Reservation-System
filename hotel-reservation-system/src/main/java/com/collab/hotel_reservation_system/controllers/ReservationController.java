package com.collab.hotel_reservation_system.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collab.hotel_reservation_system.models.Reservation;
import com.collab.hotel_reservation_system.services.ReservationService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




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
    @PostMapping()
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation newReservation) {
        try {
            Reservation res = reservationService.createReservation(newReservation);
            return new ResponseEntity<>(res, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't create new reservation", e.getMessage()).build();
        }
    }
    



    // PUT REQUESTS
    @PutMapping("/{id}")
    public ResponseEntity<Reservation> updateReservation(@PathVariable int id, @RequestBody Reservation newReservation) {
        try {
            Reservation res = reservationService.updateReservation(id, newReservation);
            return new ResponseEntity<>(res, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't update reservation", e.getMessage()).build();
        }
    }



    // DELETE REQUEST
    @DeleteMapping("/{id}")
    public ResponseEntity<Reservation> deleteReservation(@PathVariable int id) {
        try {
            reservationService.deleteReservation(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't delete reservation", e.getMessage()).build();
        }
    }
}
