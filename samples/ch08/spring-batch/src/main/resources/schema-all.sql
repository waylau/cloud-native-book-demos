DROP TABLE t_user IF EXISTS;

CREATE TABLE t_user  (
    user_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20)
);
