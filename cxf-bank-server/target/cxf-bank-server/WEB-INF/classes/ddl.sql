create database bankdb;
create user cxf with encrypted password 'cxf';
grant all privileges on database bankdb to cxf;
-- psql -U cxf -d bankdb -W

CREATE TABLE client (
    id serial PRIMARY KEY,
    first_name VARCHAR UNIQUE NOT NULL,
    last_name VARCHAR UNIQUE NOT NULL,
    date_of_birth DATE UNIQUE NOT NULL
);

CREATE TABLE account(
    id serial PRIMARY KEY,
    client_id INTEGER NOT NULL REFERENCES client(id),
    type VARCHAR NOT NULL,
    balance FLOAT DEFAULT 0,
    UNIQUE (client_id, type)
);