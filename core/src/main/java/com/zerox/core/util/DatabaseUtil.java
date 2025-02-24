package com.zerox.core.util;

import java.sql.*;
import java.util.Scanner;


public class DatabaseUtil {

    public static Connection connectDataSource(Connect connect) {

        try {
            return DriverManager.getConnection(STR."jdbc:\{connect.driver}://\{connect.host}:\{connect.port}/\{connect.database}", connect.username, connect.password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    
}