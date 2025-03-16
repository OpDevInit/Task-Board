package com.opdevinit.todo_list.service;

import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import com.opdevinit.todo_list.dto.CardDetailsDTO;
import com.opdevinit.todo_list.persistense.DAO.CardDAO;

@AllArgsConstructor
public class CardQueryService {

    private final Connection connection;

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        var dao = new CardDAO(connection);
        return dao.findById(id);
    }

}
