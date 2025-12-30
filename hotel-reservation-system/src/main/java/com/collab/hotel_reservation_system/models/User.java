package com.collab.hotel_reservation_system.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

////////////// USER DESCRIPTION //////////////
/// contains both admins and guest users [denoted by userType]
/// users can have multiple reservations, though a reservation can only have 1 user. 1:M relationship

@Entity
@Table(name="USERS")
public class User {
    //primary key
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="user_type")
    private String userType;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="deleted")
    private boolean deleted;



    public User() {}  //default constructor bc it throws a runtime error without one
    public User(String userType, String username, String password) {
        this.userType = userType;
        this.username = username;
        this.password = password;
    }




    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
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
        result = prime * result + ((userType == null) ? 0 : userType.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
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
        User other = (User) obj;
        if (id != other.id)
            return false;
        if (userType == null) {
            if (other.userType != null)
                return false;
        } else if (!userType.equals(other.userType))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (deleted != other.deleted)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", userType=" + userType + ", username=" + username + ", password=" + password
                + ", deleted=" + deleted + "]";
    }

    
}
