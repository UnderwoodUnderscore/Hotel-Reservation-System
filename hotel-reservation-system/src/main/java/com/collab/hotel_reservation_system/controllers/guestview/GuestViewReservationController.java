package com.collab.hotel_reservation_system.controllers.guestview;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collab.hotel_reservation_system.controllers.abstractclasses.AbstractReservationController;
import com.collab.hotel_reservation_system.services.ReservationService;
import org.springframework.web.bind.annotation.CrossOrigin;




@RestController
@RequestMapping("/guest-view/reservations")
@CrossOrigin("*")
public class GuestViewReservationController extends AbstractReservationController {
    
    private final ReservationService reservationService;
    public GuestViewReservationController(ReservationService reservationService) {
        super(reservationService);
        this.reservationService = reservationService;
    }
    

    // GET REQUESTS
    /*
    //for the user to view their reservations
    @GetMapping("?userid={userid}")
    public ResponseEntity<List<Reservation>> getReservationsByUserId(@PathVariable int userId) {
        try {
            List<Reservation> reservations = reservationService.getReservationsByUserId(userId);
            return new ResponseEntity<>(reservations, HttpStatus.OK);

        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't retrieve reservations belonging to user " + userId, e.getMessage()).build();
        }
    }
    */
}
