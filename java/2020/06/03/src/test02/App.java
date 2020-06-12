package test02;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane pane = new Pane();
        Text text = new Text();
        Scene scene = new Scene(pane, 300, 275);
        text.setX(50);
        text.setY(100);
        text.setText("Java is fun !");
        pane.getChildren().add(text);
        pane.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if(text.getText().equals("Java is fun !")){
                    text.setText("Java is powerful !");
                }
                else if(text.getText().equals("Java is powerful !")){
                    text.setText("Java is fun !");
                }
            }
        });
        primaryStage.setTitle("TextDisplay");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}