package com.collab.hotel_reservation_system.controllers.userview;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collab.hotel_reservation_system.models.Room;
import com.collab.hotel_reservation_system.services.RoomService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/user-view/rooms")
@CrossOrigin("*")
public class UserViewRoomController {
    private final RoomService roomService;
    public UserViewRoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    // GET REQUESTS
    @GetMapping()
    public ResponseEntity<List<Room>> getAllRooms() {
        try {
            List<Room> roomList = roomService.getAllRooms();
            return new ResponseEntity<>(roomList, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't get list of all rooms", e.getMessage()).build();
        }
    }
    



    // POST REQUESTS
    @PostMapping()
    public ResponseEntity<Room> createRoom(@RequestBody Room newRoom) {
        try {
            Room room = roomService.createRoom(newRoom);
            return new ResponseEntity<>(room, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't create room", e.getMessage()).build();
        }
    }
    



    // PUT REQUESTS
    @PutMapping("/{id}")
    public ResponseEntity<Room> updateRoom(@PathVariable int id, @RequestBody Room newRoom) {
        try {
            Room room = roomService.updateRoom(id, newRoom);
            return new ResponseEntity<>(room, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't update room", e.getMessage()).build();
        }
    }



    // DELETE REQUEST
    @DeleteMapping("/{id}")
    public ResponseEntity<Room> deleteRoom(@PathVariable int id) {
        try {
            roomService.deleteRoom(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().header("Couldn't delete room", e.getMessage()).build();
        }
    }
}
