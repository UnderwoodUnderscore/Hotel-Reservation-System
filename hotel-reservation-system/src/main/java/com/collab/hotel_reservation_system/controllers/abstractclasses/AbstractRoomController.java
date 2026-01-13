package com.collab.hotel_reservation_system.controllers.abstractclasses;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.collab.hotel_reservation_system.models.Room;
import com.collab.hotel_reservation_system.services.RoomService;

//// for the shared HTTP requests between guest and admin

public abstract class AbstractRoomController {
    private final RoomService roomService;
    public AbstractRoomController(RoomService roomService) {
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


    //post, put, and delete requests are unique between guest and admin
}
