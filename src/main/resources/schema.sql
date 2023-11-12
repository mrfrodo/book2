create table if not exists book (
    id serial primary key ,
    isbn varchar(255) not null,
    title varchar(255) not null,
    author varchar(255) not null
) ;

create table if not exists author (
    id serial primary key ,
    name varchar(255) not null
) ;