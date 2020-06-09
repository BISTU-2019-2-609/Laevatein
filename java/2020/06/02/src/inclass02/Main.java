package inclass02;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    String[] imageUrls = {
            "1.png",
            "2.png",
            "3.png",
            "4.png"
    };//图片路径数组
    Image[] images = new Image[4];
    ImageView imageView = new ImageView();
    int currentIndex = 0;
    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = new BorderPane();
        Button btn = new Button("下一张");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                showNext();
            }
        });
        for(int i = 0; i < images.length; i++){
            images[i] = new Image(imageUrls[i]);
        }
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(400);
        imageView.setFitHeight(400);
        root.setBottom(btn);
        root.setCenter(imageView);
        primaryStage.setTitle("Album");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
        showNext();
    }

    public void showNext(){
        currentIndex ++;
        if(currentIndex >= 3) currentIndex = 0;
        imageView.setImage(images[currentIndex]);
    }

    public static void main(String[] args) {
        launch(args);
    }
}