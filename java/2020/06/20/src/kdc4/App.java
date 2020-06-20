package kdc4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    private TextField lenghtField = new TextField();
    private TextField widthField = new TextField();
    private TextField areaField = new TextField();
    private TextField perimeterField = new TextField();   
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10));
        pane.setHgap(5);
        pane.setVgap(5);

        pane.add(new Label("矩形的长"), 0, 0);
        pane.add(lenghtField, 1, 0);
        pane.add(new Label("矩形的宽"), 0, 1);
        pane.add(widthField, 1, 1);
        pane.add(new Label("矩形的面积"), 0, 2);
        pane.add(areaField, 1, 2);
        pane.add(new Label("矩形的周长"), 0, 3);
        pane.add(perimeterField, 1, 3);

        Button calculation = new Button("计算");
        pane.add(calculation, 1, 4);
        GridPane.setHalignment(calculation, HPos.RIGHT);
        calculation.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                calculate();
            }
        });

        primaryStage.setTitle("投资计算器");
        primaryStage.setScene(new Scene(pane, 300, 275));
        primaryStage.show();
    }

    public void calculate(){
        double lenght = Double.parseDouble(lenghtField.getText());
        int width = Integer.parseInt(widthField.getText());
        areaField.setText(String.format("%f", lenght * width));
        perimeterField.setText(String.format("%f", 2 *(lenght + width)));
    }

    public static void main(String[] args) {
        launch(args);
    }
}