package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
 
	public JDBC()
	{
		
	}
	
	public Connection getCon()
	{
	String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/EIS_DATABASE?useUnicode=true&useSSL=true";
    String username = "root";
    String password = "161174";
    Connection conn = null;
    try {
        Class.forName(driver); 
        conn = (Connection)DriverManager.getConnection(url,username,password);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return conn;
	}
	
}
