/* USERS */
insert into USERS(user_type, username, password)
values ('admin', 'admin5000', 'somepassword123');

insert into USERS(user_type, username, password)
values ('guest', 'guest5000', 'otherpassword432');



/*ROOMS*/
insert into ROOMS(room_type, capacity, room_number)
values ('quad', 4, 303);

insert into ROOMS(room_type, capacity, room_number)
values ('triple', 3, 101);

insert into ROOMS(room_type, capacity, room_number)
values ('double', 2, 106);

insert into ROOMS(room_type, capacity, room_number)
values ('single', 1, 215);



/* RESERVATIONS */
insert into RESERVATIONS (guest_id, room_id, start_date, end_date, num_guests)
values (1, 2, '2026-02-13', '2026-02-20', 3);

insert into RESERVATIONS (guest_id, room_id, start_date, end_date, num_guests)
values (1, 3, '2026-01-13', '2026-01-20', 2);