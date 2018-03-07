CREATE TABLE student (
id serial not null,
department varchar(50),
email varchar(50),
firstname varchar(50),
lastname varchar(50)
);

CREATE TABLE course (
courseid serial not null,
coursename varchar(50)
);

CREATE TABLE student_course (
id serial not null,
courseid varchar(50)
);

CREATE TABLE users (
id serial not null,
password varchar(200),
role varchar(200),
username varchar(200)
);