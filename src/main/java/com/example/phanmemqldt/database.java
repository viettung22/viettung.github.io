package com.example.phanmemqldt;

import java.sql.*;

public class database {
    public static Connection connectDb() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connectmaster = DriverManager.getConnection("jdbc:mysql://localhost:3306/remakektpm", "root", "2206");
            return connectmaster;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
