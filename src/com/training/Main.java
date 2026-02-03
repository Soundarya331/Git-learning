package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class 	Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello, World!");
        String url="jdbc:postgresql://localhost:5432/test";
        String username="postgres";
        String password="mypassword123";
        Connection conn = DriverManager.getConnection(url, username, password);
        
        String insert = "insert into employee values (4,'Vishal' )";
        conn.createStatement().execute(insert);
        String select = "SELECT * FROM employee";
       
        ResultSet rs = conn.createStatement().executeQuery(select);
        
        System.out.println("Employee Data:");
        while (rs.next()) {
            String name = rs.getString("emp_name");  
            String id = rs.getString("emp_id");           
            System.out.println("Name: " + name + ", ID: " + id);
        }
        
          
        
    }

}