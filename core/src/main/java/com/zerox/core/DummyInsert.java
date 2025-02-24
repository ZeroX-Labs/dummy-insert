package com.zerox.core;

import com.zerox.core.util.DatabaseUtil;

import com.zerox.core.util.Connect;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DummyInsert {

    public void scanTable(Connect connect, String table) throws SQLException {
        Connection connection = DatabaseUtil.connectDataSource(connect);
        if (connection == null) {
            System.out.println("Failed to connect to database!");
            return;
        }
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        ResultSet resultSet = databaseMetaData.getTables(null, null, null, new String[]{"TABLE"});
        System.out.println("Printing TABLE_TYPE \"TABLE\" ");
        System.out.println("----------------------------------");
        while(resultSet.next())
        {
            //Print
            System.out.println(resultSet.getString("TABLE_NAME"));
        }
        System.out.println("----------------------------------");
        System.out.println(STR."Printing \{table}\" Column\" ");
        System.out.println("----------------------------------");
        ResultSet columns = databaseMetaData.getColumns(null,null, table, null);
        if(!columns.next())
        {
            System.out.println("Table not found!");
            return;
        }
        while(columns.next())
        {
            String columnName = columns.getString("COLUMN_NAME");
            String datatype = columns.getString("DATA_TYPE");
            String columnsize = columns.getString("COLUMN_SIZE");
            String decimaldigits = columns.getString("DECIMAL_DIGITS");
            String isNullable = columns.getString("IS_NULLABLE");
            String is_autoIncrment = columns.getString("IS_AUTOINCREMENT");
            //Printing results
            System.out.println(STR."\{columnName}---\{datatype}---\{columnsize}---\{decimaldigits}---\{isNullable}---\{is_autoIncrment}");
        }
    }



}
