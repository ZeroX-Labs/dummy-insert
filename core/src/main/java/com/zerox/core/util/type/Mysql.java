package com.zerox.core.util.type;

import com.zerox.core.util.DataSource;
import com.zerox.core.util.DatabaseUtil;

import java.sql.*;


public class Mysql implements DatabaseUtil {

    public Connection connectDataSource(DataSource dataSource) {

        try {
            return DriverManager.getConnection(STR."jdbc:mysql://\{dataSource.host}:\{dataSource.port}/\{dataSource.database}", dataSource.username, dataSource.password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    
}