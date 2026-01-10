/* USERS */
insert into USERS(user_type, username, password)
values ('admin', 'admin5000', 'somepassword123');

insert into USERS(user_type, username, password)
values ('guest', 'guest5000', 'otherpassword432');

insert into USERS(user_type, username, password)
values ('guest', 'otherguest', 'somepassword');



/*ROOMS*/
insert into ROOMS(room_type, capacity, room_number, price)
values ('quad', 4, 303, 200);

insert into ROOMS(room_type, capacity, room_number, price)
values ('triple', 3, 101, 150);

insert into ROOMS(room_type, capacity, room_number, price)
values ('double', 2, 106, 100);

insert into ROOMS(room_type, capacity, room_number, price)
values ('single', 1, 215, 75);



/* RESERVATIONS */
insert into RESERVATIONS (guest_id, room_id, start_date, end_date, num_guests)
values (2, 2, '2026-02-13', '2026-02-20', 3);

insert into RESERVATIONS (guest_id, room_id, start_date, end_date, num_guests)
values (3, 3, '2026-01-13', '2026-01-20', 2);