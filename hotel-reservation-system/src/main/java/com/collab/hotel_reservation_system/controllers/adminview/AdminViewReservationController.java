package com.collab.hotel_reservation_system.controllers.adminview;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collab.hotel_reservation_system.controllers.abstractclasses.AbstractReservationController;
import com.collab.hotel_reservation_system.models.Reservation;
import com.collab.hotel_reservation_system.services.ReservationService;

@RestController
@RequestMapping("/admin-view/reservations")
@CrossOrigin("*")
public class AdminViewReservationController extends AbstractReservationController {

    private final ReservationService reservationService;

    public AdminViewReservationController(ReservationService reservationService) {
        super(reservationService);
        this.reservationService = reservationService;
    }


    // GET REQUESTS
    @GetMapping("/all")
    public ResponseEntity<List<Reservation>> getAllReservations() {
        try {
            List<Reservation> res = reservationService.getAllReservations();
            return new ResponseEntity<>(res, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't retrieve all reservations", e.getMessage()).build();
        }
    }




    // post, put, and delete requests created in parent class
}
