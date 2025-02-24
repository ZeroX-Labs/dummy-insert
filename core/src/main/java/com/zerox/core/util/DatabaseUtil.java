package com.zerox.core.util;

import java.sql.*;
import java.util.Scanner;


public class DatabaseUtil {

    private static Connection connectDataSource(String url, String host, long port, String database, String username, String password, String driver) {
        if(driver.equals("mysql")) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                return DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, username, password);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(driver.equals("postgresql")) {
            try {
                Class.forName("com.postgresql.Driver");
                return DriverManager.getConnection("jdbc:postgresql://" + host + ":" + port + "/" + database, username, password);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(driver.equals("sqlite")) {
            try {
                Class.forName("com.sqlLite.Driver");
                return DriverManager.getConnection("jdbc:sqlite:" + database);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the database URL: ");
        String url = scanner.nextLine();
        System.out.println("Enter the database host: ");
        String host = scanner.nextLine();
        System.out.println("Enter the database port: ");
        long port = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter the database username: ");
        String username = scanner.nextLine();
        System.out.println("Enter the database password: ");
        String password = scanner.nextLine();
        System.out.println("Enter the database driver: ");
        String driver = scanner.nextLine();
        System.out.println("Enter the database name: ");
        String database = scanner.nextLine();
        Connection connection = connectDataSource(url, host, port, database, username, password, driver);
        System.out.println(connection);
    }
}