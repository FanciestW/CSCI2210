/**
 * William Lin
 * CSCI 2210-01
 * Quiz 9
 * April 21, 2016
 */

import java.io.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import java.util.*;

public class StudentRecords extends Application {

    private int pos = -1; //This int is used to keep track of Student Records position.

    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws IOException {
        ArrayList<Student> students = new ArrayList<>(); //Used to store all Students' Records
        Alert alert = new Alert(Alert.AlertType.WARNING); //This will be used as warning throughout the application
        alert.setTitle("Error!");

        FlowPane pane = new FlowPane();
        TextField nameField = new TextField();
        TextField streetField = new TextField();
        TextField cityField = new TextField();
        TextField stateField = new TextField();
        TextField zipField = new TextField();
        TextField[] fields = {nameField, streetField, cityField,
                stateField, zipField};

        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(5);
        pane.setHgap(8);

        nameField.setMinWidth(310);
        streetField.setMinWidth(310);
        cityField.setMaxWidth(140);
        stateField.setMaxWidth(40);
        zipField.setMaxWidth(70);
        pane.getChildren().addAll(new Label("Name "), nameField,
                new Label("Street"), streetField, new Label("City   "),
                cityField, new Label("State"), stateField, new Label("Zip"),
                zipField);
        Button add = new Button("Add");
        add.setOnAction((ActionEvent e) -> {
            boolean filled = false;
            for(int i = 0; i < 5; i++){
                if(fields[i].getText().trim().isEmpty()){
                    alert.setHeaderText("Missing Information!");
                    alert.setContentText("Please fill out all fields.");
                    alert.showAndWait();
                    filled = false;
                    break;
                } else filled = true;
            }
            if(filled) {
                Student student = new Student(fields[0].getText(), fields[1].getText(),
                        fields[2].getText(), fields[3].getText(), fields[4].getText());
                students.add(student);
                for (int i = 0; i < 5; i++) {
                    fields[i].setText("");
                }
            }
        });
        Button first = new Button("First");
        first.setOnAction((ActionEvent e) -> {
            if(!students.isEmpty()) {
                pos = 0;
                fields[0].setText(students.get(pos).getName());
                fields[1].setText(students.get(pos).getStreet());
                fields[2].setText(students.get(pos).getCity());
                fields[3].setText(students.get(pos).getState());
                fields[4].setText(students.get(pos).getZip());
            } else {
                alert.setHeaderText("No Student Records");
                alert.setContentText("Please Add A Student First.");
                alert.showAndWait();
            }
        });
        Button next = new Button("Next");
        next.setOnAction((ActionEvent e) -> {
            if(!students.isEmpty()) {
                pos++;
                if (pos == students.size()) pos = 0;
                fields[0].setText(students.get(pos).getName());
                fields[1].setText(students.get(pos).getStreet());
                fields[2].setText(students.get(pos).getCity());
                fields[3].setText(students.get(pos).getState());
                fields[4].setText(students.get(pos).getZip());
            } else {
                alert.setHeaderText("No Student Records");
                alert.setContentText("Please Add A Student First.");
                alert.showAndWait();
            }
        });
        Button previous = new Button("Previous");
        previous.setOnAction((ActionEvent e) -> {
            if(!students.isEmpty()) {
                if (pos == -1 || pos == 0) pos = students.size() - 1;
                else pos--;
                fields[0].setText(students.get(pos).getName());
                fields[1].setText(students.get(pos).getStreet());
                fields[2].setText(students.get(pos).getCity());
                fields[3].setText(students.get(pos).getState());
                fields[4].setText(students.get(pos).getZip());
            } else {
                alert.setHeaderText("No Student Records");
                alert.setContentText("Please Add A Student First.");
                alert.showAndWait();
            }
        });
        Button last = new Button("Last");
        last.setOnAction((ActionEvent e) -> {
            if(!students.isEmpty()) {
                pos = students.size() - 1;
                fields[0].setText(students.get(pos).getName());
                fields[1].setText(students.get(pos).getStreet());
                fields[2].setText(students.get(pos).getCity());
                fields[3].setText(students.get(pos).getState());
                fields[4].setText(students.get(pos).getZip());
            } else {
                alert.setHeaderText("No Student Records");
                alert.setContentText("Please Add A Student First.");
                alert.showAndWait();
            }
        });
        Button update = new Button("Update");
        update.setOnAction((ActionEvent e) -> {
            alert.setHeaderText("Nothing to Update");
            alert.setContentText("Please Wait for Future Updates");
            alert.showAndWait();
        });

        pane.getChildren().addAll(add, first, next, previous, last, update);

        Scene scene = new Scene(pane, 410, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Students Records");
        primaryStage.show();
    }
}