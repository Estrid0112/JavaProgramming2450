package lectorial09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchingDemo {
	public static void main(String[] args) {
		try {
			
			int[] studentNumbers = {21, 31, 41};
			String[] studentNames = {"John", "Jack", "Julie"};
		
			Connection connection = DriverManager.getConnection("jdbc:sqlite:wed.db");
			PreparedStatement pst = connection.prepareStatement("insert into students values (?, ?)");
			
			for(int i=0; i < studentNames.length; i++) {						
				pst.setInt(1, studentNumbers[i]);
				pst.setString(2, studentNames[i]);
				pst.addBatch();
			}
			pst.executeBatch();
			
			
				
		}catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}
