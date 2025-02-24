package com.zerox.core;

import com.zerox.core.util.Connect;
import com.zerox.core.util.DatabaseUtil;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        DummyInsert dummyInsert = new DummyInsert();
        Connect connect = new Connect();
        System.out.println("Enter the database host: ");
        connect.host = scanner.nextLine();
        System.out.println("Enter the database port: ");
        connect.port = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter the database username: ");
        connect.username = scanner.nextLine();
        System.out.println("Enter the database password: ");
        connect.password = scanner.nextLine();
        System.out.println("Enter the database driver: ");
        connect.driver = scanner.nextLine();
        System.out.println("Enter the database name: ");
        connect.database = scanner.nextLine();
        System.out.println("Enter the table name: ");
        String table = scanner.nextLine();
        dummyInsert.scanTable(connect, table);

    }
}