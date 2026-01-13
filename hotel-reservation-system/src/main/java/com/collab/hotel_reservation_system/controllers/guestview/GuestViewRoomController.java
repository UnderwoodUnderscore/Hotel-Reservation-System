package com.collab.hotel_reservation_system.controllers.guestview;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collab.hotel_reservation_system.controllers.abstractclasses.AbstractRoomController;
import com.collab.hotel_reservation_system.services.RoomService;


import org.springframework.web.bind.annotation.CrossOrigin;




@RestController
@RequestMapping("/guest-view/rooms")
@CrossOrigin("*")
public class GuestViewRoomController extends AbstractRoomController {
    public GuestViewRoomController(RoomService roomService) {
        super(roomService);
    }


    //get request is in parent class. other requests are not available to the guest
}
