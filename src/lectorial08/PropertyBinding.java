package lectorial08;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PropertyBinding extends Application{
	public void start(Stage primaryStage) {
		Circle circle = new Circle(30, Color.GRAY);
		Pane pane = new Pane();
		pane.getChildren().addAll(circle);
		circle.setCenterX(100);
		circle.setCenterY(100);
		
		

		Scene scene = new Scene(pane, 200, 200);
		
		// property binding
//		circle.centerXProperty().bind(pane.widthProperty().divide(2));
//		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		pane.widthProperty().addListener(e -> {
			circle.setCenterX(pane.widthProperty().divide(2).doubleValue());
		});
		pane.heightProperty().addListener(e -> {
			circle.setCenterY(pane.getHeight()/2);
		});
		
		
		primaryStage.setTitle("Circle Demo");
		primaryStage.setScene(scene);
		primaryStage.show();


	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
