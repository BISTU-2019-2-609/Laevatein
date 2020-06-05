package inclass01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox hBox = new HBox();    //设置水平根节点
        hBox.setPadding(new Insets(10, 10, 10, 10));//设置按钮与上右下左边缘留出10px距离
        //设置三个按钮
        Button b1 = new Button("Button1");
        Button b2 = new Button("Button2");
        Button b3 = new Button("Button3");
        //当点击按钮b1时，控制台做如下处理
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("点击了Button1");
            }
        });
        //当点击按钮b2时，控制台做如下处理
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("点击了Button2");
            }
        });
        //当点击按钮b3时，控制台做如下处理
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("点击了Button3");
            }
        });
        hBox.getChildren().addAll(b1, b2, b3);//设置三个按钮水平呈现
        b1.setPrefWidth(300);//设置按钮b1宽度为300
        b2.setPrefWidth(100);//设置按钮b2宽度为100
        HBox.setHgrow(b3, Priority.ALWAYS);//设置按钮b3填充剩余空间
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(hBox, 480, 40));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}