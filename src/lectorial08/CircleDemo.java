package lectorial08;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleDemo extends Application{
	@Override
	public void start(Stage homeStage) {
		Circle circle = new Circle(30, Color.GRAY);
		Pane pane = new Pane(circle);
		circle.setCenterX(200);
		circle.setCenterY(200);
		// property binding
//		circle.centerXProperty().bind(pane.widthProperty().divide(2));
//		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		
		// event handling
		pane.widthProperty().addListener(change -> {
			circle.setCenterX(pane.getWidth()/2);
		});
		
		pane.heightProperty().addListener(change -> {
			circle.setCenterY(pane.getHeight()/2);
		});
		
		
		Scene scene = new Scene(pane, 400, 400);
		homeStage.setScene(scene);
		homeStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
