package com.collab.hotel_reservation_system.controllers.userview;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collab.hotel_reservation_system.models.User;
import com.collab.hotel_reservation_system.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/user-view/users")
@CrossOrigin("*")
public class UserViewUserController {

    private final UserService userService;

    public UserViewUserController(UserService userService) {
        this.userService = userService;
    }


    // GET REQUESTS

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        try {
            List<User> returnList = userService.getAllUsers();
            return new ResponseEntity<>(returnList, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't retrieve all users", e.getMessage()).build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        try {
            User user = userService.findUserById(id);
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't retrieve user at this ID", e.getMessage()).build();
        }
    }
    
    


    // POST REQUESTS

    @PostMapping() //note: later maybe make url specific to creating the user, for page nav purposes?
    public ResponseEntity<User> createUser(@RequestBody User user) {
        try {
            User newUser = userService.createUser(user);
            return new ResponseEntity<>(newUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't create new user", e.getMessage()).build();
        }
    }
    



    // PUT REQUESTS

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user) {
        try {
            User updatedUser = userService.updateUser(id, user);
            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
        } catch (NoSuchElementException ne) {
            return ResponseEntity.internalServerError().header("User doesn't exist", ne.getMessage()).build();
        }
        catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't update user", e.getMessage()).build();
        }
    }

    //later create put requests for username and password



    // DELETE REQUEST

    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable int id) {
        try {
            userService.deleteUser(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't delete user", e.getMessage()).build();
        }
    }
}
