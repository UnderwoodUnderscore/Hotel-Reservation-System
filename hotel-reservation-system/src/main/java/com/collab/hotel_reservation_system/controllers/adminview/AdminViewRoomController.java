package com.collab.hotel_reservation_system.controllers.adminview;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collab.hotel_reservation_system.services.RoomService;

@RestController
@RequestMapping("/admin-view/rooms")
@CrossOrigin("*")
public class AdminViewRoomController {
    
    private final RoomService roomService;

    public AdminViewRoomController(RoomService roomService) {
        this.roomService = roomService;
    }


    // GET REQUESTS





    // POST REQUESTS





    // PUT REQUESTS




    // DELETE REQUESTS
}
