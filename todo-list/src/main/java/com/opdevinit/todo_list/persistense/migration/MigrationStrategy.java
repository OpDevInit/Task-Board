package com.opdevinit.todo_list.persistense.migration;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.SQLException;

import com.opdevinit.todo_list.persistense.config.ConnectionConfig;

import liquibase.Liquibase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MigrationStrategy {

    private final Connection connection;

    public void executeMigration() throws LiquibaseException {
        var originalOut = System.out;
        var originalErr = System.err;

        try (var fos = new FileOutputStream("liquibase.log")) {
            System.setOut(new PrintStream(fos));
            System.setErr(new PrintStream(fos));

            try (var connection = ConnectionConfig.getConnection();
                    var jdbcConnection = new JdbcConnection(connection)) {

                var liquibase = new Liquibase(
                        "/db/changelog/db.changelog-master.yml",
                        new ClassLoaderResourceAccessor(),
                        jdbcConnection);
                        
                    liquibase.update();
                

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.setErr(originalErr);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
        }
    }

}
