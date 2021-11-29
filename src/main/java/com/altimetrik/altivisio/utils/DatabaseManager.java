package com.altimetrik.altivisio.utils;

import java.sql.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class DatabaseManager {

    public Map getValueFromDatabaseForDifferentColumns(String jdbcURL, String jdbcQuery, int columnNumbers){
        LinkedHashMap<String,String> Values = new LinkedHashMap<String, String>();
        String ColumnHeader, ColumnValue = null;
        try {
            if (jdbcQuery != null && !jdbcQuery.isEmpty()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(jdbcURL);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(jdbcQuery);
                ResultSetMetaData rsmd = rs.getMetaData();
                while (rs.next()) {
                    for(int i=1; i<=columnNumbers; i++){
                        ColumnHeader = rsmd.getColumnName(i);
                        ColumnValue = rs.getString(i);
                        Values.put(ColumnHeader, ColumnValue);
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Result set does not have any results.");
        }
        return Values;
    }

}
