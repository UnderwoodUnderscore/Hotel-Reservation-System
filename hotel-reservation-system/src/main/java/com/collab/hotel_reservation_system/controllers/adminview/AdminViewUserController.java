package com.collab.hotel_reservation_system.controllers.adminview;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collab.hotel_reservation_system.controllers.abstractclasses.AbstractUserController;
import com.collab.hotel_reservation_system.models.User;
import com.collab.hotel_reservation_system.services.UserService;

@RestController
@RequestMapping("/admin-view/users")
@CrossOrigin("*")
public class AdminViewUserController extends AbstractUserController {
    
    private final UserService userService;

    public AdminViewUserController(UserService userService) {
        super(userService);
        this.userService = userService;
    }


    //note about requests: admins can update and delete individual guests, 
    // so perhaps viewing + modding their own account should be done with a flag rather than the URI?


    // GET REQUESTS

    //later modify to only be able to get users with Guest flag
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        try {
            List<User> returnList = userService.getAllUsers();
            return new ResponseEntity<>(returnList, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't retrieve all users", e.getMessage()).build();
        }
    }



    // POST REQUESTS





    // PUT REQUESTS




    // DELETE REQUESTS
}
