package dev.rama27.Learn.DB.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Connecting {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            // 1. Load driver and properties
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            String un = "root";
            String psw = "password";

            // 2. Establish connection
            Connection con = DriverManager.getConnection(url, un, psw);
            System.out.println("Connection established successfully");

            // 3. Create statement
            Statement stmt = con.createStatement();

            create(stmt, "sam", 200);
            create(stmt, "jon", 201);
            create(stmt, "ram", 202);
            create(stmt, "raj", 203);
            read(stmt);
            readByName(stmt,"sam");
            update(stmt, "raj", 207);
            deleteByName(stmt, "ram");
            deleteAll(stmt);


            // 5. Close resources
            stmt.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e  ) {
            throw new RuntimeException(e);
        }
    }

    public static void create(Statement stmt, String name, int rollno) throws SQLException {
        String query = "INSERT INTO student VALUES ('" + name + "', " + rollno + ")";
        stmt.executeUpdate(query);
        System.out.println("Record inserted: " + name + ", " + rollno);
    }

    public static void read(Statement stmt) throws SQLException {
        String query = "SELECT * FROM student";
        ResultSet rs = stmt.executeQuery(query);
        System.out.println("======================================");
        System.out.println("Student Records:");
        while (rs.next()) {
            System.out.println("Name: " + rs.getString(1) + ", Roll No: " + rs.getInt(2));
        }
        System.out.println("======================================");
    }
    public static void readByName(Statement stmt, String name) throws SQLException {
        String query = "SELECT * FROM student where name='"+name+"'";
        ResultSet rs = stmt.executeQuery(query);
        System.out.println("Student Records:");
        while (rs.next()) {
            System.out.println("Name: " + rs.getString(1) + ", Roll No: " + rs.getInt(2));
        }
    }

    public static void update(Statement stmt, String name, int newRollno) throws SQLException {
        String query = "UPDATE student SET rollno = " + newRollno + " WHERE name = '" + name + "'";
        stmt.executeUpdate(query);
        System.out.println("Record updated for: " + name);
    }

    public static void deleteByName(Statement stmt, String name) throws SQLException {
        String query = "DELETE FROM student WHERE name = '" + name + "'";
        stmt.executeUpdate(query);
        System.out.println("Record deleted for: " + name);
    }
    public static void deleteAll(Statement stmt) throws SQLException{
        stmt.execute("TRUNCATE TABLE student");
    }
}
