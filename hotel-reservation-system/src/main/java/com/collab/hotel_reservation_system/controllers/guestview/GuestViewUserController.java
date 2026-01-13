package com.collab.hotel_reservation_system.controllers.guestview;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collab.hotel_reservation_system.controllers.abstractclasses.AbstractUserController;
import com.collab.hotel_reservation_system.services.UserService;




@RestController
@RequestMapping("/guest-view/users")
@CrossOrigin("*")
public class GuestViewUserController extends AbstractUserController {

    private final UserService userService;

    public GuestViewUserController(UserService userService) {
        super(userService);
        this.userService = userService;
    }


    // basic CRUD func is in parent


    // PUT REQUESTS

    //later create put requests for username and password
}
