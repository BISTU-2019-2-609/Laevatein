package test04;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane pane = new Pane();
        Text text = new Text();
        Circle circle = new Circle(100, 60, 50, Color.WHITE);
        circle.setStroke(Color.BLACK);
        pane.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                if(circle.contains(e.getX(), e.getY())){
                    text.setX(e.getX());
                    text.setY(e.getY());
                    text.setText("Mouse point is inside the circle");
                }
                else{
                    text.setX(e.getX());
                    text.setY(e.getY());
                    text.setText("Mouse point is outside the circle");
                }
            }
        });
        pane.getChildren().addAll(circle, text);
        primaryStage.setTitle("Location Judgment");
        primaryStage.setScene(new Scene(pane, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}