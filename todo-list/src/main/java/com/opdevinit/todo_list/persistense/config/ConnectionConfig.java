package com.opdevinit.todo_list.persistense.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public final class ConnectionConfig {

    public static Connection getConnection() throws SQLException{
        var url = "jdbc:mysql://localhost/board";
        var userAndPassword = "root";
        var connection = DriverManager.getConnection(url, userAndPassword, userAndPassword);
        connection.setAutoCommit(false);
        return connection;
    }

}
