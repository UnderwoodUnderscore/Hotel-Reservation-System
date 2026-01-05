package com.collab.hotel_reservation_system.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.collab.hotel_reservation_system.models.Reservation;

import jakarta.transaction.Transactional;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    // SELECT QUERIES //
    @Query
    public List<Reservation> findByDeletedFalse();


    // UPDATING RECORDS //
    @Query("update Reservation r set r.guestId=:guest_id, r.roomId=:room_id, r.startDate=:start_date, r.endDate=:end_date, r.numGuests=:num_guests where id=:reservation_id")
    @Transactional
    @Modifying
    public int updateReservationById(@Param("reservation_id") int id, @Param("guest_id") int guestId, @Param("room_id") int roomId, 
        @Param("start_date") LocalDate startDate, @Param("end_date") LocalDate endDate, @Param("num_guests") int numGuests);

    
    @Query("update Reservation r set r.deleted = TRUE where id=:reservationId")
    @Transactional
    @Modifying
    public void updateDeletedToTrueAtId(@Param("reservationId") int id);
}
