package com.collab.hotel_reservation_system.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.collab.hotel_reservation_system.models.User;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // SELECT QUERIES //

    @Query
    public List<User> findByDeletedFalse();




    // UPDATING RECORDS //

    //updating user
    @Query("update User u set u.userType=:uUserType, u.username=:uUsername, u.password=:uPassword where id =:userId")
    @Modifying
    @Transactional
    public int updateUser(@Param("userId") int id, @Param("uUserType") String userType, @Param("uUsername") String username, @Param("uPassword") String password);

    //for deleting records while keeping them available for archival purposes
    @Query("update User u set u.deleted = TRUE where id = :userId")
    @Modifying
    @Transactional
    public int updateDeletedToTrueAtId(@Param("userId") int id);
}
