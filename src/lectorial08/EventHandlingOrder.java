package lectorial08;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EventHandlingOrder extends Application{
	public void start(Stage firstStage) {
		Button button = new Button("Click");
		button.setMaxSize(100, 50);		
		Pane pane = new Pane(button);
	
		Scene scene = new Scene(pane, 200, 200);
		firstStage.setScene(scene);
		firstStage.show();
		
		button.setOnMouseEntered(e -> { 
			System.out.println("Action Event with Convenient registration"); 
		});
		button.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> { 
			System.out.println("Action Event with non-convenient registration");
		});

	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
