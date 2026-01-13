package com.collab.hotel_reservation_system.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.collab.hotel_reservation_system.models.Room;

import jakarta.transaction.Transactional;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
    /// SELECT QUERIES
    @Query
    public List<Room> findByDeletedFalse();




    /// MODIFYING RECORDS
    @Query("update Room r set r.roomType=:room_type, r.capacity=:capacity, r.roomNumber=:room_number, r.price=:price where id =:room_id")
    @Modifying
    @Transactional
    public int updateRoom(@Param("room_id") int id, @Param("room_type") String roomType, @Param("capacity") int capacity, @Param("room_number") int roomNumber, @Param("price") int price);

    @Query("update Room r set r.deleted = TRUE where id=:room_id")
    @Modifying
    @Transactional
    public int updateDeletedToTrueAtId(@Param("room_id") int id);
}
