import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a border pane
        BorderPane pane = new BorderPane();

        //Create Top GridPane
        GridPane top = new GridPane();
        Label firstLbl = new Label("First Name:");
        Label lastLbl = new Label("Last Name:");
        TextField firstField = new TextField();
        TextField lastField = new TextField();
        top.setAlignment(Pos.CENTER);
        top.add(firstLbl, 0, 0);
        top.add(firstField, 1, 0);
        top.add(lastLbl, 2, 0);
        top.add(lastField, 3, 0);

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

        //Creates Left GridPane
        GridPane left = new GridPane();
        Label leftLbl = new Label("Fun:");
        Image img3 = new Image("img3.jpg");
        ImageView imgLeft = new ImageView(img3);
        imgLeft.setFitHeight(500);
        imgLeft.setFitWidth(200);
        left.add(leftLbl, 0, 0);
        left.add(imgLeft, 0, 1);

        //Creates Right GridPane
        GridPane right = new GridPane();
        Label majorLbl = new Label("Major:");
        TextField majorField = new TextField();
        right.add(majorLbl, 0, 0);
        right.add(majorField, 0, 1);

        // Place GridPanes in the BorderPane
        pane.setTop(top);
        pane.setCenter(center);
        pane.setBottom(bottom);
        pane.setLeft(left);
        pane.setRight(right);

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