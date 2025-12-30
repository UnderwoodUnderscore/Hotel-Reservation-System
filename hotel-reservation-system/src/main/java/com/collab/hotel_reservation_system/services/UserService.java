package com.collab.hotel_reservation_system.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.collab.hotel_reservation_system.models.User;
import com.collab.hotel_reservation_system.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    // HANDLING GET REQUESTS
    public List<User> getAllUsers() {
        return userRepository.findByDeletedFalse();
    }

    public User findUserById(int id) throws IllegalArgumentException {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new IllegalArgumentException("No user with that ID");
        }
    }



    // HANDLING POST REQUESTS
    public User createUser(User user) {
        return userRepository.save(user);
    }



    // HANDLING PUT REQUESTS
    public User updateUser(int id, User user) throws NoSuchElementException {
        int returnedId = userRepository.updateUser(id, user.getUserType(), user.getUsername(), user.getPassword());

        if (returnedId != 0) {
            return findUserById(returnedId);
        } else {
            throw new NoSuchElementException("No user by that ID exists");
        }
    }



    // HANDLING DELETE REQUEST
    public void deleteUser(int id) {
        userRepository.updateDeletedToTrueAtId(id);
    }


}
