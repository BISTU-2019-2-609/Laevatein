package test05;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(5, 5, 5, 5));
        Label name = new Label("姓名");
        grid.add(name, 0, 1);
        TextField nameT = new TextField();
        grid.add(nameT, 1, 1);
        Label area = new Label("地区");
        grid.add(area, 0, 2);
        TextField areaT = new TextField();
        grid.add(areaT, 1, 2);
        Label tem = new Label("体温");
        grid.add(tem, 0, 3);
        TextField temT = new TextField();
        grid.add(temT, 1, 3);
        Label result = new Label("结果");
        grid.add(result, 0, 4);
        TextField resultT = new TextField();
        grid.add(resultT, 1, 4);
        Button empty = new Button("清空");
        Button inquire = new Button("查询");
        HBox hBox = new HBox(5);
        hBox.setAlignment(Pos.BOTTOM_RIGHT); 
        hBox.getChildren().addAll(empty, inquire);
        grid.add(hBox, 1, 5);
        Check m = new Check("null", 0, 0);
        empty.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                nameT.setText("");
                areaT.setText("");
                temT.setText("");
                resultT.setText("");
            }
        });
        inquire.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                m.setName(nameT.getText());
                m.setAreaFrom(Integer.parseInt(areaT.getText()));
                m.setTemperature(Double.parseDouble(temT.getText()));
                resultT.setText(m.resultCheck());
            }
        });
        primaryStage.setTitle("健康信息查询");
        primaryStage.setScene(new Scene(grid, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}