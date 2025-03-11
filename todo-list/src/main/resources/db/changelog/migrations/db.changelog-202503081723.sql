-- liquibase formatted sql

-- changeset usuario:001
CREATE TABLE BOARDS(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
) ENGINE=InnoDB;
-- rollback DROP TABLE BOARDS;
