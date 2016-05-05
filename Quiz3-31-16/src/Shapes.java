/**
 * Created by William Lin on 3/31/2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class Shapes extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        // Create a pane to hold the circle
        Pane pane = new Pane();

        Circle circle1 = new Circle();
        circle1.centerXProperty().bind(pane.widthProperty().divide(2));
        circle1.centerYProperty().bind(pane.heightProperty().divide(2));
        circle1.setRadius(5);
        circle1.setStroke(Color.BLACK);
        circle1.setFill(Color.RED);

        Circle circle2 = new Circle();
        circle2.centerXProperty().bind(pane.widthProperty().divide(2));
        circle2.centerYProperty().bind(pane.heightProperty().divide(2));
        circle2.setRadius(10);
        circle2.setStroke(Color.BLACK);
        circle2.setFill(Color.CYAN);

        Circle circle3 = new Circle();
        circle3.centerXProperty().bind(pane.widthProperty().divide(2));
        circle3.centerYProperty().bind(pane.heightProperty().divide(2));
        circle3.setRadius(15);
        circle3.setStroke(Color.BLACK);
        circle3.setFill(Color.BLUE);

        Circle circle4 = new Circle();
        circle4.centerXProperty().bind(pane.widthProperty().divide(2));
        circle4.centerYProperty().bind(pane.heightProperty().divide(2));
        circle4.setRadius(20);
        circle4.setStroke(Color.BLACK);
        circle4.setFill(Color.YELLOW);

        Circle circle5 = new Circle();
        circle5.centerXProperty().bind(pane.widthProperty().divide(2));
        circle5.centerYProperty().bind(pane.heightProperty().divide(2));
        circle5.setRadius(25);
        circle5.setStroke(Color.BLACK);
        circle5.setFill(Color.AQUA);

        Circle circle6 = new Circle();
        circle6.centerXProperty().bind(pane.widthProperty().divide(2));
        circle6.centerYProperty().bind(pane.heightProperty().divide(2));
        circle6.setRadius(30);
        circle6.setStroke(Color.BLACK);
        circle6.setFill(Color.PURPLE);

        Circle circle7 = new Circle();
        circle7.centerXProperty().bind(pane.widthProperty().divide(2));
        circle7.centerYProperty().bind(pane.heightProperty().divide(2));
        circle7.setRadius(45);
        circle7.setStroke(Color.BLACK);
        circle7.setFill(Color.WHITE);

        pane.getChildren().add(circle7);
        pane.getChildren().add(circle6);
        pane.getChildren().add(circle5);
        pane.getChildren().add(circle4);
        pane.getChildren().add(circle3);
        pane.getChildren().add(circle2);
        pane.getChildren().add(circle1);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowCircleCentered"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
