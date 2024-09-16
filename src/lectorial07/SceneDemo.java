package lectorial07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SceneDemo extends Application{
	public void start(Stage primaryStage) {		
		
		// create a parent
		GridPane pane = new GridPane();
		pane.add(new Label("Please log in"), 0, 0);
		pane.add(new Label("Username:"), 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("Password:"), 0, 2);
		pane.add(new PasswordField(), 1, 2);
		
		// create a scene
		Scene scene = new Scene(pane, 250, 200);
				
		// add the scene to stage
		primaryStage.setScene(scene);		
		// show stage
		primaryStage.show();
		
	}	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}