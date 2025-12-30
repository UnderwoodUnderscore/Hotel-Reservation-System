package com.collab.hotel_reservation_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collab.hotel_reservation_system.models.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
    
}
