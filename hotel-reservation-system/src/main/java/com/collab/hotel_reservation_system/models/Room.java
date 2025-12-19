package com.collab.hotel_reservation_system.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ROOMS")
public class Room {
    //primary key
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="room_type")
    private String roomType;

    @Column(name="capacity")
    private int capacity;

    @Column(name="room_number")
    private int roomNumber;

    @Column(name="deleted")
    private boolean deleted;



    public Room(String roomType, int capacity, int roomNumber) {
        this.roomType = roomType;
        this.capacity = capacity;
        this.roomNumber = roomNumber;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isDeleted() {
        return deleted;
    }
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((roomType == null) ? 0 : roomType.hashCode());
        result = prime * result + capacity;
        result = prime * result + roomNumber;
        result = prime * result + (deleted ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Room other = (Room) obj;
        if (id != other.id)
            return false;
        if (roomType == null) {
            if (other.roomType != null)
                return false;
        } else if (!roomType.equals(other.roomType))
            return false;
        if (capacity != other.capacity)
            return false;
        if (roomNumber != other.roomNumber)
            return false;
        if (deleted != other.deleted)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Room [id=" + id + ", roomType=" + roomType + ", capacity=" + capacity + ", roomNumber=" + roomNumber
                + ", deleted=" + deleted + "]";
    }

    
}
