package com.opdevinit.todo_list.dto;

import com.opdevinit.todo_list.persistense.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,
        String name,
        BoardColumnKindEnum kind,
        int cardsAmount) {
}
