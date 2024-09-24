package lectorial08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MouseDraggedDemo extends Application{
	public void start(Stage firstStage) {
		Button button = new Button("Drag to move me");
		button.setMaxSize(150, 50);		
		Pane pane = new Pane(button);
		button.setOnMouseDragged(event -> {
			button.setLayoutX(event.getSceneX());
			button.setLayoutY(event.getSceneY());
		});
	
		Scene scene = new Scene(pane, 200, 200);
		
		firstStage.setScene(scene);
		firstStage.show();
		
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
