package lectorial07;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PropertyBindingDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a StringProperty to hold the current time
        StringProperty currentTime = new SimpleStringProperty();

        // Create a Label to display the current time
        Label timeLabel = new Label();
        timeLabel.textProperty().bind(currentTime);

        // Create a Timeline to update the current time every second
//        Timeline timeline = new Timeline(
//                new KeyFrame(Duration.seconds(1), event -> {
//                    // Get the current time
//                    LocalTime now = LocalTime.now();
//                    // Format the current time as HH:mm:ss
//                    String formattedTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
//                    // Update the currentTime property
//                    currentTime.set(formattedTime);
//                })
//        );
//        timeline.setCycleCount(Timeline.INDEFINITE); // Repeat indefinitely
//        timeline.play(); // Start the timeline
        
        LocalTime now = LocalTime.now();
        // Format the current time as HH:mm:ss
        String formattedTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        // Update the currentTime property
        currentTime.set(formattedTime);

        // Create a VBox to hold the Label
        VBox root = new VBox(timeLabel);
        root.setPrefSize(200, 100);
        root.setSpacing(10);

        // Create a Scene and set it on the Stage
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Observable Time");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
