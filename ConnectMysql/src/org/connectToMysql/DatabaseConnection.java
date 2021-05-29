package org.connectToMysql;

import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support

public class DatabaseConnection {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws SQLException {
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} 
		catch(ClassNotFoundException ex){
			System.out.println("error, unable to locad the driver class@");
			System.exit(1);
			
		}
		try {
			   Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException ex) {
		   System.out.println("Error: unable to load driver class!");
		   System.exit(1);
		}
		
		DriverManager.getConnection("jdbc:mysql://localhost/student","root","Mb@851115"); 
}
}
