package lectorial07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class NodeDemo extends Application{
	public void start(Stage primaryStage) {		
		// create a node
		Circle circle = new Circle();
		circle.setFill(Color.BLUE);
		circle.setStroke(Color.BLACK);
		circle.setStrokeWidth(3.0);

        // Update the nodes' size and position
        circle.setRadius(100);
        circle.setLayoutX(50);
        circle.setLayoutY(100);
        		
		// create a parent
		Pane pane = new Pane();
		// property binding
		circle.layoutXProperty().bind(pane.widthProperty().divide(2));
		pane.getChildren().add(circle);
		
		// create a scene
		Scene scene = new Scene(pane, 200, 200);
				
		// add the scene to stage
		primaryStage.setScene(scene);		
		// show stage
		primaryStage.show();		
	}
	
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}

