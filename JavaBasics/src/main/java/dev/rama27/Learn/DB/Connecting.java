package dev.rama27.Learn.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connecting {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            String un = "root";
            String psw = "password";
            Connection con = DriverManager.getConnection(url, un, psw);
            System.out.println("connection estabished  sucessfully ");
//			3 Statement().........
            Statement stmt=	con.createStatement();
            String query= ("insert into  student values ('sam',200)");
            String query1= ("insert into  student values ('jon',200)");
            String query2= ("insert into  student values ('shyam',200)");
            String query3= ("insert into  student values ('ram',200)");
//			4 Execute ()
            stmt.executeUpdate(query);
            stmt.executeUpdate(query1);
            stmt.executeUpdate(query2);
            stmt.executeUpdate(query3);

//            deleteAll(stmt);
            deleteByName(stmt,"sam");

//			5 Close()
            con.close();
            stmt.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteAll(Statement stmt) throws SQLException {
        String query= "truncate table student";
        stmt.executeUpdate(query);
    }
    public static void deleteByName(Statement stmt, String name) throws SQLException {
        String query="delete from student where rollno = "+200;
        stmt.executeUpdate(query);
    }
}
