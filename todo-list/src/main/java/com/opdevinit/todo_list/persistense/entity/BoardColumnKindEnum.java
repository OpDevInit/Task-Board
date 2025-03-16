package com.opdevinit.todo_list.persistense.entity;

import java.util.stream.Stream;

public enum BoardColumnKindEnum {

    INITIAL, FINAL, CANCEL, PENDING;

    public static BoardColumnKindEnum findByName( final String name){
        return Stream.of(BoardColumnKindEnum.values())
        .filter(b -> b.name().equals(name))
        .findFirst().orElseThrow();
        
    }

}
