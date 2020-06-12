package test03;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = new BorderPane();
        Pane pane = new Pane();
        HBox hBox = new HBox();
        Scene scene = new Scene(root, 300, 275);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Rectangle r = new Rectangle(115, 10, 70, 190);
        r.setStroke(Color.BLACK);
        r.setFill(Color.WHITE);
        Circle cR = new Circle(150, 45, 25, Color.WHITE);
        Circle cY = new Circle(150, 105, 25, Color.WHITE);
        Circle cG = new Circle(150, 165, 25, Color.WHITE);
        cR.setStroke(Color.BLACK);
        cY.setStroke(Color.BLACK);
        cG.setStroke(Color.BLACK);
        pane.getChildren().addAll(r, cR, cY, cG);
        Button Red = new Button("Red");
        Red.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                cR.setFill(Color.RED);
                cY.setFill(Color.WHITE);
                cG.setFill(Color.WHITE);
            }
        });
        Button Yellow = new Button("Yellow");
        Yellow.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                cR.setFill(Color.WHITE);
                cY.setFill(Color.YELLOW);
                cG.setFill(Color.WHITE);
            }
        });
        Button Green = new Button("Green");
        Green.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                cR.setFill(Color.WHITE);
                cY.setFill(Color.WHITE);
                cG.setFill(Color.GREEN);
            }
        });
        hBox.getChildren().addAll(Red, Yellow, Green);
        hBox.setPadding(new Insets(10));
        root.setCenter(pane);
        root.setBottom(hBox);
        primaryStage.setTitle("Traffic Lights");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}