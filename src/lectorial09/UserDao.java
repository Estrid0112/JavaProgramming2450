package lectorial09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
	public static boolean findUser(String name, String pw) {
		String command = "select * from validusers where username = ? and password = ?";
		try(Connection connection = DriverManager.getConnection("jdbc:sqlite:demo.db");
				PreparedStatement pst = connection.prepareStatement(command);){
			pst.setString(1, name);
			pst.setString(2, pw);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}

}
