package mypkg;

import java.sql.Connection;
import java.sql.DriverManager;

public class Data {
    public static Connection connect() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentportal", "root", "root");
        return con;
    }
}
