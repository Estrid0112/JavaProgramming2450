package lectorial07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyFirstApplication extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("Hello world!");
		Circle circle = new Circle(50);
		Pane pane = new HBox();
		pane.getChildren().add(circle);
		Scene scene = new Scene(label, 200, 200);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Stage signupStage = new Stage();
		Scene secondScene = new Scene(new Label("Sign up"), 200, 200);
		signupStage.setScene(secondScene);
		signupStage.setTitle("Please sign up");
		signupStage.showAndWait();
		
		
		label.setText("Thank you for signing up!");
		
	}
	
	
		
	public static void main(String[] args) {
		Application.launch(args);
	}	
}
