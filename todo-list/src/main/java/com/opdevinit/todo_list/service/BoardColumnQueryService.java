package com.opdevinit.todo_list.service;

import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import com.opdevinit.todo_list.persistense.DAO.BoardColumnDAO;
import com.opdevinit.todo_list.persistense.entity.BoardColumnEntity;

@AllArgsConstructor
public class BoardColumnQueryService {

    private final Connection connection;

    public Optional<BoardColumnEntity> findById(final Long id) throws SQLException {
        var dao = new BoardColumnDAO(connection);
        return dao.findById(id);
    }

}
