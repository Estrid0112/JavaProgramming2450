package lectorial08;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonEventDemo extends Application{
	public void start(Stage primaryStage) {
		Button button = new Button("Click me");
		button.setMaxSize(100, 50);
//		// Solution 1
//		button.setOnAction(new ButtonHandler());
		
		// Solution 2 - Anonymous class
//		button.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				Scene scene = new Scene(new Label("These are the top books!"), 300, 300);
//				Stage secondStage = new Stage();
//				secondStage.setScene(scene);
//				secondStage.setTitle("Dashboard");
//				secondStage.show();
//				
//			}
//			
//		});
		
		// Solution 3 - lambda expression 
		button.setOnAction(ev -> {
			Scene scene = new Scene(new Label("These are the top books!"), 300, 300);
			Stage secondStage = new Stage();
			secondStage.setScene(scene);
			secondStage.setTitle("Dashboard");
			secondStage.show();
		});
		
				
		Scene scene = new Scene(button, 200, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Button Event Demo");
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
