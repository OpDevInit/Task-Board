package com.opdevinit.todo_list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.opdevinit.todo_list.persistense.migration.MigrationStrategy;

import liquibase.exception.LiquibaseException;

import static com.opdevinit.todo_list.persistense.config.ConnectionConfig.getConnection;

import java.sql.SQLException;

@SpringBootApplication
public class TodoListApplication {

	public static void main(String[] args) throws LiquibaseException, SQLException {

		try (var connection = getConnection()) {
			new MigrationStrategy(connection).executeMigration();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
