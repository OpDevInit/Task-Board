CREATE TABLE
    BLOCKS (
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        description VARCHAR(255) NOT NULL,
        block_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        unblock_at TIMESTAMP NULL,
        unblock_reason TIMESTAMP NULL,
        card_id BIGINT NOT NULL,
        CONSTRAINT cards__blocks_fk FOREIGN KEY (card_id) REFERENCES CARDS (id) ON DELETE CASCADE
    ) ENGINE = InnoDB;