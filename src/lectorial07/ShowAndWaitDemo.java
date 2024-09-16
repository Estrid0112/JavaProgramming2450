package lectorial07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowAndWaitDemo extends Application{
	public void start(Stage primaryStage) {
		// create a parent with nodes
		Label primaryLabel = new Label("This is the first stage");
		Pane pane = new Pane(primaryLabel);
		
		Scene scene = new Scene(pane, 250, 200);	
		// add the scene to stage
		primaryStage.setScene(scene);		
		// show stage
		primaryStage.show();
		
		// Create the second stage
		Scene secondScene = new Scene(new Label("This is the second stage"), 100, 50);
		Stage mySecondStage = new Stage();
		mySecondStage.setScene(secondScene);
		mySecondStage.show();
		primaryLabel.setText("Welcome back!");
		
	}
	
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
