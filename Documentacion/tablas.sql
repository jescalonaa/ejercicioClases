create table alumnos
(
    id       int auto_increment
        primary key,
    nombre   text          not null,
    apellido text          not null,
    edad     int default 1 null
);

create table cursos
(
    id     int auto_increment
        primary key,
    nombre text not null,
    codigo text not null
);