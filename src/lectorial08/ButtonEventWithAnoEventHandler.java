package lectorial08;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonEventWithAnoEventHandler extends Application{
	public void start(Stage primaryStage) {
		Button button = new Button("Click me");
		button.setMaxSize(100, 50);
		button.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("Anonymous class!");
			}
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
