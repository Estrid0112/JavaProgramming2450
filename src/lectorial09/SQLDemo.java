package lectorial09;

import java.sql.*;

public class SQLDemo {
		
	public static void main(String[] args){
		try {
		// Create connection
		Connection connection = DriverManager.getConnection("jdbc:sqlite:demo.db");
		
		// create statement
		
		Statement stmt = connection.createStatement();
				
		// execute statement		
		stmt.executeUpdate("insert into users values ('s124', 'Miranda', 'Kerr')");
		ResultSet rs = stmt.executeQuery("select * from users");
		// process the result set
		while(rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		
		
		// close connection
		stmt.close();
		connection.close();

		} catch(SQLException e) {
			System.out.println("SQL Exception!");
		}

	
	}
}
