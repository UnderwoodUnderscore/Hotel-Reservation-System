package com.collab.hotel_reservation_system.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.collab.hotel_reservation_system.models.Room;
import com.collab.hotel_reservation_system.repositories.RoomRepository;

@Service
public class RoomService {
    private final RoomRepository roomRepository;
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    // HANDLING GET REQUESTS
    public List<Room> getAllRooms() {
        return roomRepository.findByDeletedFalse();
    }

    public Room getRoomById(int id) throws IllegalArgumentException {
        Optional<Room> room = roomRepository.findById(id);

        if (room.isPresent() && !room.get().isDeleted()) {
            return room.get();
        } else {
            throw new IllegalArgumentException("No room by that ID");
        }
    }




    // HANDLING POST REQUESTS
    public Room createRoom(Room newRoom) {
        return roomRepository.save(newRoom);
    }




    // HANDLING PUT REQUESTS
    public Room updateRoom(int id, Room newRoom) throws NoSuchElementException {
        int returnedId = roomRepository.updateRoom(id, newRoom.getRoomType(), newRoom.getCapacity(), newRoom.getRoomNumber(), newRoom.getPrice());

        if (returnedId != 0) {
            return getRoomById(returnedId);
        } else {
            throw new NoSuchElementException("No room by that ID exists!");
        }
    }





    // HANDLING DELETE REQUEST
    public void deleteRoom(int id) {
        roomRepository.updateDeletedToTrueAtId(id);
    }
}
