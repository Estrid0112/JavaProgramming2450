package lectorial07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PositionDemo extends Application{
	
	public void start(Stage primaryStage) {
		// create a node
		Circle circle = new Circle(50);
		circle.setLayoutX(100);
		circle.setLayoutY(50);
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		
		// create the scene
		Scene scene = new Scene(pane, 200, 200);
		
		
		
		// add scene to primary stage
		primaryStage.setScene(scene);
		
		// show the stage
		primaryStage.setTitle("Welcome!");
		primaryStage.show();
	
		
	}
		
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}

