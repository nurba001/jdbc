package org.example.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class Вb {
    private final static String   url="jdbc:postgresql://localhost:5432/postgres";
    private final static String user ="postgres";
    private final static String password ="postgres";

    public Connection connection1() {
        Connection connection=null;
        try{
        connection= DriverManager.getConnection(url,user,password);
            System.out.println("Connection driver successfully");
        }catch (SQLException e){
            e.getSQLState();
        }
        return connection;
    }

    public   void printUsers() {

        String SQL = "SELECT * FROM student where id='7'";
        try (Connection conn = connection1();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {

                System.out.println(rs.getInt("id") + " "
                        + rs.getString("namestudent") + " "
                        + rs.getInt("age"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public Collection<? extends String> printUsers1() {
        ArrayList<String> arrayList=new ArrayList<>();
        String SQL = "SELECT * FROM student ";
        try (Connection conn = connection1();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {


                arrayList.add(rs.getString("namestudent") + "| "
                        + rs.getString("surname") +
                        " |" + rs.getInt("age"));}
            System.out.println(arrayList);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

}
