package org.connectToMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlConnection {
	
	static final String db_driver = "com.mysql.Driver";
	static final String db_url = "jdbc:mysql://localhost/";
	
	static final String user = "root";
	static final String pass = "Mb@851115";
	
	
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/mysql","root","Mb@851115");  
		//here mysql is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		
		System.out.println("connected...");
		}  
		}  
	
	
	


