import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javafx.scene.text.TextAlignment.CENTER;

public class ShowBorderPane extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a border pane
        BorderPane pane = new BorderPane();

        //Create Top GridPane
        GridPane top = new GridPane();
        Image selfPic = new Image("profilePic.jpg");
        ImageView img = new ImageView(selfPic);

        //Creates Center GridPane
        GridPane center = new GridPane();
        Label centerLbl = new Label("Bridge:");
        Image img1 = new Image("img1.jpg");
        ImageView imgCenter = new ImageView(img1);
        imgCenter.setFitHeight(500);
        imgCenter.setFitWidth(500);
        center.add(centerLbl, 0, 0);
        center.add(imgCenter, 0, 1);

        //Creates Bottom GridPane
        GridPane bottom = new GridPane();
        Label botLbl = new Label("Ladybug:");
        Image img2 = new Image ("img2.jpg");
        ImageView imgBot = new ImageView(img2);
        imgBot.setFitWidth(200);
        imgBot.setFitHeight(200);
        bottom.add(botLbl, 0, 0);
        bottom.add(imgBot, 1, 0);

        // Place GridPanes in the BorderPane
        pane.setTop(top);
        pane.setCenter(center);
        pane.setBottom(bottom);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("William Lin"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args){
        launch(args);
    }
}