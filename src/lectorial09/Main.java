package lectorial09;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	public void start(Stage primaryStage) throws IOException, SQLException {			
		// load the view
		FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginView.fxml"));
		loader.setController(new LoginViewController());
		GridPane parent = loader.load();
		
		// showing the view
		Scene scene = new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.show();		
				
				
	}
		
	public static void main(String[] args) {
		Application.launch(args);
	}
	

}

