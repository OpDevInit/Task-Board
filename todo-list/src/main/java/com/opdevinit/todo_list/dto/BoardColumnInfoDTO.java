package com.opdevinit.todo_list.dto;

import com.opdevinit.todo_list.persistense.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
