package com.collab.hotel_reservation_system.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="RESERVATIONS")
public class Reservation {
    //primary key
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name="guest_id", referencedColumnName="id") //foreign key linking to USER
    private int guestId;

    @JoinColumn(name="room_id", referencedColumnName="id") //foreign key linking to ROOM
    private int roomId;

    @Column(name="start_date")
    private LocalDate startDate;

    @Column(name="end_date")
    private LocalDate endDate;

    @Column(name="num_guests")
    private int numGuests;

    @Column(name="deleted")
    private int deleted;




    public Reservation(int guestId, int roomId, LocalDate startDate, LocalDate endDate, int numGuests) {
        this.guestId = guestId;
        this.roomId = roomId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numGuests = numGuests;
    }




    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getGuestId() {
        return guestId;
    }
    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public int getRoomId() {
        return roomId;
    }
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getNumGuests() {
        return numGuests;
    }
    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }

    public int getDeleted() {
        return deleted;
    }
    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }





    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + guestId;
        result = prime * result + roomId;
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
        result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
        result = prime * result + numGuests;
        result = prime * result + deleted;
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
        Reservation other = (Reservation) obj;
        if (id != other.id)
            return false;
        if (guestId != other.guestId)
            return false;
        if (roomId != other.roomId)
            return false;
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        } else if (!startDate.equals(other.startDate))
            return false;
        if (endDate == null) {
            if (other.endDate != null)
                return false;
        } else if (!endDate.equals(other.endDate))
            return false;
        if (numGuests != other.numGuests)
            return false;
        if (deleted != other.deleted)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Reservation [id=" + id + ", guestId=" + guestId + ", roomId=" + roomId + ", startDate=" + startDate
                + ", endDate=" + endDate + ", numGuests=" + numGuests + ", deleted=" + deleted + "]";
    }

    
}
