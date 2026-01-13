package com.collab.hotel_reservation_system.controllers.adminview;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collab.hotel_reservation_system.controllers.abstractclasses.AbstractRoomController;
import com.collab.hotel_reservation_system.models.Room;
import com.collab.hotel_reservation_system.services.RoomService;

@RestController
@RequestMapping("/admin-view/rooms")
@CrossOrigin("*")
public class AdminViewRoomController extends AbstractRoomController {
    
    private final RoomService roomService;

    public AdminViewRoomController(RoomService roomService) {
        super(roomService);
        this.roomService = roomService;
    }


    //get request is in parent class


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
