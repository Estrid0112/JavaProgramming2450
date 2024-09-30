package lectorial09;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginViewController implements Initializable{
	@FXML
	private Label message;
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private Button login;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// adding event handlers to the view
		login.setOnAction(event -> {
			String usernameEntered = username.getText();
			String passwordEntered = password.getText();
			boolean found = UserDao.findUser(usernameEntered, passwordEntered);
			if(found) {
				message.setText("Login successfully!");
			}else {
				message.setText("Invalid credentials!");
			}
		});
		
		
		
		
		
	}
	
	
	
	
	
}