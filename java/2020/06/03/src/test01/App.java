package test01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane bpane = new BorderPane();
        Pane pane = new Pane();
        Circle circle = new Circle(100, 100, 50);
        circle.setStroke(Color.ORANGE);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10));
        Scene scene = new Scene(bpane, 300, 300);
        Button left = new Button("向左");
        left.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                circle.setCenterX(circle.getCenterX() > 50 ? circle.getCenterX() - 10 : pane.getWidth() - 50);
            }
        });
        Button right = new Button("向右");
        right.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                circle.setCenterX(circle.getCenterX() < pane.getWidth() - 50 ? circle.getCenterX() + 10 : 50);
            }
        });
        Button up = new Button("向上");
        up.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                circle.setCenterY(circle.getCenterY() > 50 ? circle.getCenterY() - 10 : pane.getHeight() - 50);
            }
        });
        Button down = new Button("向下");
        down.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                circle.setCenterY(circle.getCenterY() < pane.getHeight() - 50 ? circle.getCenterY() + 10 : 50);
            }
        });
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);
        hBox.getChildren().addAll(left, right, up, down);
        bpane.setCenter(pane);
        bpane.setBottom(hBox);
        primaryStage.setTitle("BallMovement");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}