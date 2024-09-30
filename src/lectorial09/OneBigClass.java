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

public class OneBigClass extends Application{	
	public void start(Stage primaryStage) throws IOException{	
		// load the view
		FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginView.fxml"));
		GridPane parent = loader.load();
		// get those nodes from the view to be used
		Label message = (Label) parent.getChildren().get(0);
		TextField tf = (TextField) parent.getChildren().get(3);
		PasswordField pf = (PasswordField) parent.getChildren().get(4);
		Button login = (Button) parent.getChildren().get(5);
		
		// showing the view
		Scene scene = new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.show();		
		
		// adding event handlers to the view
		login.setOnAction(event -> {
			// connecting to database
			String command = "select * from validusers where username = ? and password = ?";
			try(Connection connection = DriverManager.getConnection("jdbc:sqlite:demo.db");
					PreparedStatement pst = connection.prepareStatement(command);){
				pst.setString(1, tf.getText());
				pst.setString(2, pf.getText());
				ResultSet rs = pst.executeQuery();
				if(rs.next()) {
					message.setText("Login successfully!");
				}else {
					message.setText("Invalid credentials!");
				}
			}catch(Exception e) {
				message.setText(e.getMessage());
			}
		});

	}
		
	public static void main(String[] args) {
		Application.launch(args);
	}
	

}
