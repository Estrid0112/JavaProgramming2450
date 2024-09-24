package lectorial08;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class StageSwitchDemo extends Application{
	public void start(Stage firstStage) {
		Button button = new Button("Go to my second stage");
		button.setMaxSize(200, 50);		
		Pane pane = new Pane(button);
	
		Scene scene = new Scene(pane, 400, 400);
		firstStage.setScene(scene);
		firstStage.show();
		
		
		Scene secondScene = new Scene(new Pane(), 400, 400);
		Stage secondStage = new Stage();
		secondStage.setScene(secondScene);
		secondStage.setTitle("This is the second stage");
		button.setOnAction(e -> {
			secondStage.show();
			});
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
