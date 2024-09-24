package lectorial08;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ButtonHandler implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		
		Scene scene = new Scene(new Label("These are the top books!"), 300, 300);
		Stage secondStage = new Stage();
		secondStage.setScene(scene);
		secondStage.setTitle("Dashboard");
		secondStage.show();
		
	}
	


}

