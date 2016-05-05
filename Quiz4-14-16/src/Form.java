/**
 * Created by William Lin on 4/14/2016.
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Form extends Application{

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        FlowPane one = new FlowPane();
        one.setHgap(10);
        one.setVgap(10);
        one.setPadding(new Insets(10, 10, 10, 10));
        Label nameLbl = new Label("Name");
        TextField nameField = new TextField();
        nameField.setMinWidth(350);
        one.getChildren().addAll(nameLbl, nameField);

        FlowPane two = new FlowPane();
        two.setHgap(10);
        two.setVgap(10);
        two.setPadding(new Insets(10, 10, 10, 10));
        Label streetLbl = new Label("Street");
        TextField streetField = new TextField();
        streetField.setMinWidth(350);
        two.getChildren().addAll(streetLbl, streetField);

        FlowPane three = new FlowPane();
        three.setHgap(10);
        three.setVgap(10);
        three.setPadding(new Insets(10, 10, 10, 10));

        Label cityL = new Label("City");
        Label stateL = new Label("State");
        Label zipL = new Label("Zip");
        TextField cityF = new TextField();
        TextField stateF = new TextField();
        TextField zipF = new TextField();
        cityF.setPrefWidth(125);
        stateF.setPrefWidth(50);
        zipF.setPrefWidth(100);
        three.getChildren().addAll(cityL, cityF, stateL, stateF, zipL, zipF);

        FlowPane four = new FlowPane();
        four.setHgap(10);
        four.setVgap(10);
        four.setPadding(new Insets(10, 10, 10, 10));
        Button add = new Button("Add");
        Button first = new Button("First");
        Button next = new Button("Next");
        Button prev = new Button("Previous");
        Button last = new Button("Last");
        Button update = new Button("Update");
        Button serial = new Button("Serialize");
        four.getChildren().addAll(add, first, next, prev, last, update, serial);

        GridPane pane = new GridPane();
        pane.setPrefWidth(425);
        pane.add(one, 0, 0);
        pane.add(two, 0, 1);
        pane.add(three, 0, 2);
        pane.add(four, 0, 3);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Student Records");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}

