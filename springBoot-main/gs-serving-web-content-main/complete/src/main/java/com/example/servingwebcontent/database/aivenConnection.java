package com.example.servingwebcontent.database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;



public class aivenConnection {
    /*
     * mysql://avnadmin:AVNS_2ZlIVz4ACEb86Eu0Exr@mysql-14737a33-nglthu-4e05.k.aivencloud.com:17237/defaultdb?ssl-mode=REQUIRED
     */
    public void aivenConn() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://avnadmin:AVNS_JQhZX9R1M50Gf1sWxfe@mysql-288a0e3d-datpltn205-8c11.c.aivencloud.com:15317/defaultdb?ssl-mode=REQUIRED",
                    "avnadmin", "AVNS_JQhZX9R1M50Gf1sWxfe");

                  //  AVNS_2ZlIVz4ACEb86Eu0Exr
            Statement sta = conn.createStatement();
            ResultSet reset = sta.executeQuery("select * from accounts");
            System.out.println("Display data from database: ");
            while (reset.next()) {
                
                String username = reset.getString("username");
                String password = reset.getString("password");
                System.out.println(username + " " + password);

            }

            reset.close();
            sta.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error in database connecion");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}