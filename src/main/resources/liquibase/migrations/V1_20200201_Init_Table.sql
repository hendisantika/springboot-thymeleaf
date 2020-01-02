--liquibase formatted sql
--changeset Hendi Santika:001.1
CREATE TABLE tbl_user
(
    id         int                                  NOT NULL
        PRIMARY KEY,
    first_name varchar(32)                          NOT NULL,
    last_name  varchar(48)                          NOT NULL,
    address    varchar(255)                         NULL,
    age        int                                  NOT NULL,
    username   varchar(32)                          NOT NULL,
    password   varchar(64)                          NOT NULL,
    created_at datetime DEFAULT current_timestamp() NOT NULL
);