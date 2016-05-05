/**
 * Created by wlin on 4/19/16.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.Random;

public class EmailChange extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane head = new GridPane();
        Label title = new Label("Notify the Registrar of an Email Address Change");
        title.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 18));
        title.setTextFill(Color.BLUE);
        head.add(title, 0, 0);

        GridPane line1 = new GridPane();
        Label stuIdLbl = new Label("Student ID #");
        stuIdLbl.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 15));
        line1.add(stuIdLbl, 0, 0);
        TextField stuId = new TextField();
        stuId.setPrefWidth(400);
        line1.add(stuId, 0, 1);

        GridPane line2 = new GridPane();
        Label nameLbl = new Label("Name");
        nameLbl.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 15));
        line2.setHgap(5);
        TextField firstField = new TextField();
        TextField lastField = new TextField();
        firstField.setPrefWidth(100);
        lastField.setPrefWidth(150);
        Label first = new Label("First");
        first.setFont(Font.font("Times New Roman", 12));
        Label last = new Label("Last");
        last.setFont(Font.font("Times New Roman", 12));
        line2.add(nameLbl, 0, 0);
        line2.add(firstField, 0, 1);
        line2.add(lastField, 1, 1);
        line2.add(first, 0, 2);
        line2.add(last, 1, 2);

        GridPane line3 = new GridPane();
        Label emailLbl = new Label("New Email");
        emailLbl.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 15));
        TextField newEmail = new TextField();
        newEmail.setPrefWidth(400);
        line3.add(emailLbl, 0, 0);
        line3.add(newEmail, 0, 1);

        GridPane line4 = new GridPane();
        String[] question = new String[10];
        question[0] = "4, 5, 6, 7 : the 2nd number is?";
        question[1] = "2, 40, 8, 1 : which of these is the largest?";
        question[2] = "What is \"three\" as a number?";
        question[3] = "The color of a white rabbit is?";
        question[4] = "The first letter in \"bird\" is?";
        question[5] = "12, 4, 8, 1 : which of these is the largest?";
        question[6] = "What is \"one hundred\" as a number?";
        question[7] = "The color of a red rose is?";
        question[8] = "What is \"five hundred\" as a number?";
        question[9] = "2 + 2 = ?";
        Label spamLbl = new Label("Spam Protection. Please answer this simple question.");
        spamLbl.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 15));
        Label spamQ = new Label(question[new Random().nextInt(10)]);
        spamQ.setFont(Font.font("Times New Roman", 14));
        TextField spamField = new TextField();
        spamField.setPrefWidth(150);
        line4.add(spamLbl, 0, 0);
        line4.add(spamQ, 0, 1);
        line4.add(spamField, 0, 2);

        GridPane pane = new GridPane();
        pane.setVgap(10);
        pane.setPadding(new Insets(10, 10 ,10, 10));
        pane.setPrefSize(400, 300);
        pane.add(head, 0, 0);
        pane.add(line1, 0, 1);
        pane.add(line2, 0, 2);
        pane.add(line3, 0, 3);
        pane.add(line4, 0, 4);

        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Email Address Change");
        primaryStage.show();

    }
}
