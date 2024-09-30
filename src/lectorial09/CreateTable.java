package lectorial09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		try {
			// Establish connection
			Connection connection = DriverManager.getConnection("jdbc:sqlite:wed.db");
			
			// Create statements
			Statement stmt = connection.createStatement();		
			// Execute statement
			stmt.executeUpdate("create table if not exists students "
					+ "(id int not null, name varchar(20) not null, "
					+ "primary key(id))");
//			stmt.executeUpdate("insert into students values (1, 'Amy')");
			stmt.executeUpdate("update students set name = 'Estrid' where id = '1'");
	//		stmt.executeUpdate("insert into students values (2, 'Bob')");
	//		stmt.executeUpdate("insert into students values (3, 'John')");
	//		stmt.executeUpdate("insert into students values (4, 'Jack')");
			// Process results
			ResultSet rs = stmt.executeQuery("select * from students");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "|" + rs.getString(2));
			}
			// close connection
			stmt.close();
			connection.close();
		}catch(SQLException e) {
			System.err.println("Error in database connection!");
		}
	}

}
