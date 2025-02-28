package com.zerox.core.util.type;

import com.zerox.core.util.DataSource;
import com.zerox.core.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class Postgresql implements DatabaseUtil {

    public Connection connectDataSource(DataSource dataSource) {

        try {
            return DriverManager.getConnection(STR."jdbc:postgresql://\{dataSource.host}:\{dataSource.port}/\{dataSource.database}", dataSource.username, dataSource.password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
