drop table if exists RESERVATIONS;
drop table if exists ROOMS;
drop table if exists USERS;

create table USERS (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_type VARCHAR(50) NOT NULL,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    deleted BOOLEAN DEFAULT 'FALSE'
);

create table ROOMS (
    id INT AUTO_INCREMENT PRIMARY KEY,
    room_type VARCHAR(50) NOT NULL,
    capacity INT NOT NULL,
    room_number INT NOT NULL UNIQUE,
    price INT NOT NULL,
    deleted BOOLEAN DEFAULT 'FALSE'
);

create table RESERVATIONS (
    id INT AUTO_INCREMENT PRIMARY KEY,
    guest_id INT NOT NULL,
    room_id INT NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    num_guests INT NOT NULL,
    deleted BOOLEAN DEFAULT 'FALSE'
);