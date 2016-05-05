import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class FX extends Application{

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        Button btn = new Button();
        btn.setText("CLICK ME");
        btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                popUp(new Stage());
            }
        });
        StackPane pane = new StackPane();
        pane.getChildren().add(btn);
        primaryStage.setScene(new Scene(pane, 500, 500));
        primaryStage.setTitle("Primary");
        primaryStage.show();
    }

    public void popUp(Stage secondStage){
        secondStage.setTitle("Popup");
        StackPane pane = new StackPane();
        secondStage.setScene(new Scene(pane, 300, 200));
        secondStage.show();
    }
}