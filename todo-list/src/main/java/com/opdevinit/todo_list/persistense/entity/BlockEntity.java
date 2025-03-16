package com.opdevinit.todo_list.persistense.entity;

import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class BlockEntity {

    private Long id;
    private OffsetDateTime blockedAt;
    private String blockedReason;
    private OffsetDateTime unblockedAt;
    private String unblockedReason;

}
