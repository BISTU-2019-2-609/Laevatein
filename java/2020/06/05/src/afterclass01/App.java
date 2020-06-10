package afterclass01;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        Label name = new Label("姓名");
        grid.add(name, 0, 1);
        TextField nameText = new TextField();
        grid.add(nameText, 1, 1);
        Label pw = new Label("密码");
        grid.add(pw, 0, 2);
        PasswordField pwF = new PasswordField();
        grid.add(pwF, 1, 2);
        Button btn = new Button("添加用户");
        HBox hBtn = new HBox(10);
        hBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hBtn.getChildren().add(btn);
        grid.add(hBtn, 1, 3);
        primaryStage.setTitle("User");
        primaryStage.setScene(new Scene(grid, 225, 140));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}