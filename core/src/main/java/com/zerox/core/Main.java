package com.zerox.core;

import com.zerox.core.enums.DatabaseType;
import com.zerox.core.util.DataSource;
import com.zerox.core.util.ScanTable;
import com.zerox.core.util.type.Mysql;
import com.zerox.core.util.type.Postgresql;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        ScanTable scanTable;
        DataSource connect = new DataSource();
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
        connect.databaseType = scanner.nextLine();
        System.out.println("Enter the database name: ");
        connect.database = DatabaseType.valueOf(scanner.nextLine());
        System.out.println("Enter the table name: ");
        String table = scanner.nextLine();
        switch (connect.databaseType) {
            case "MYSQL" -> scanTable = new ScanTable(new Mysql());
            case "POSTGRESQL" -> scanTable = new ScanTable(new Postgresql());
            default -> {
                System.out.println("Invalid database type!");
                return;
            }
        }

        scanTable.scanTable(connect, table);

    }
}