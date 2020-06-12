package inclass02;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        pane.setStyle("-fx-background-color:white; -fx-border-color:black");
        GridPane gridPane = new GridPane();
        Label source = new Label("源节点坐标");
        gridPane.add(source, 0, 1);
        Text sourceT = new Text();
        gridPane.add(sourceT, 1, 1);
        Label scene = new Label("在场景中坐标");
        gridPane.add(scene, 0, 2);
        Text sceneT = new Text();
        gridPane.add(sceneT, 1, 2);
        Label screen = new Label("在屏幕内坐标");
        gridPane.add(screen, 0, 3);
        Text screenT = new Text();
        gridPane.add(screenT, 1, 3);
        BorderPane bPane = new BorderPane();
        bPane.setCenter(pane);
        bPane.setBottom(gridPane);
        Scene sceneS = new Scene(bPane);
        primaryStage.setScene(sceneS);
        pane.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                sourceT.setText(String.format("%f, %f", mouseEvent.getX(), mouseEvent.getY()));
                sceneT.setText(String.format("%f, %f", mouseEvent.getSceneX(), mouseEvent.getSceneY()));
                screenT.setText(String.format("%f, %f", mouseEvent.getScreenX(), mouseEvent.getScreenY()));
            }
        });
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}