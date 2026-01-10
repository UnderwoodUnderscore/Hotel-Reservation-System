package com.collab.hotel_reservation_system.controllers.adminview;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collab.hotel_reservation_system.services.UserService;

@RestController
@RequestMapping("/admin-view/users")
@CrossOrigin("*")
public class AdminViewUserController {
    
    private final UserService userService;

    public AdminViewUserController(UserService userService) {
        this.userService = userService;
    }


    // GET REQUESTS





    // POST REQUESTS





    // PUT REQUESTS




    // DELETE REQUESTS
}
