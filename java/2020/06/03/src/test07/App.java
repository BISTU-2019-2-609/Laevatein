package test07;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class App extends Application {
    Button q = new Button("获取题目");
    TextField t1 = new TextField();
    Label sum = new Label("+");
    TextField t2 = new TextField();
    Label equal = new Label("=");
    TextField t3 = new TextField();
    Button a = new Button("确认答案");
    Text t = new Text();
    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = new BorderPane();
        HBox h1 = new HBox();
        h1.getChildren().addAll(q, t1, sum, t2, equal, t3);
        h1.setAlignment(Pos.CENTER);
        h1.setPadding(new Insets(10));
        h1.setSpacing(10);
        HBox h2 = new HBox();
        h2.getChildren().addAll(a, t);
        h2.setAlignment(Pos.CENTER);
        h2.setPadding(new Insets(3));
        h2.setSpacing(3);
        root.setTop(h1);
        root.setBottom(h2);
        Random r = new Random();
        q.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                t1.setText(String.valueOf(r.nextInt(101)));
                t2.setText(String.valueOf(r.nextInt(101)));
            }
        });
        a.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int res = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
                if(Integer.parseInt(t3.getText()) == res){
                    t.setText("答案正确");
                }
                else
                    t.setText("答案错误");
            }
        });
        primaryStage.setTitle("Random Questions");
        primaryStage.setScene(new Scene(root, 700, 100));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}