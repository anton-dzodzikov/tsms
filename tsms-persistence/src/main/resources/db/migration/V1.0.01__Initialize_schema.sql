create sequence id_seq;

create table project (
    id integer primary key not null default nextval('id_seq'),
    name varchar not null,
    description varchar
);

create table project_version (
    id integer primary key not null default nextval('id_seq'),
    name varchar not null,
    project_id integer not null references project(id)
);
