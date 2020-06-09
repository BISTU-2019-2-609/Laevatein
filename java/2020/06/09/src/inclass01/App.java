package inclass01;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Callback;

public class App extends Application {
    private BorderPane root = new BorderPane();
    private ListView<String> listView = new ListView<>(FXCollections.observableArrayList(
            "AQUAMARINE", "SPRINGGREEN", "Tan"
    ));
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("色彩块");
        label.setPrefSize(200, 300);
        label.setStyle("-fx-background-color: #ffffff");
        VBox vBox = new VBox(5);
        vBox.setPrefSize(200, 300);
        vBox.getChildren().add(listView);
        root.setLeft(vBox);
        root.setRight(label);

        //将listView设置为单元工厂
        listView.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
            @Override
            public ListCell<String> call(ListView<String> stringListView) {
                //返回一个自定义的ListCell实现类对象
                return new ColorCell();
            }
        });
        /**
         * listView的事件处理添加
         */
        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            //s：改变前的值    t1：改变后的值
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                if ("AQUAMARINE".equals(t1)){
                    label.setStyle("-fx-background-color: AQUAMARINE" );
                }else if ("SPRINGGREEN".equals(t1)){
                    label.setStyle("-fx-background-color: SPRINGGREEN");
                }else if ("Tan".equals(t1)){
                    label.setStyle("-fx-background-color: Tan");

                }
            }
        });

        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }

    /**
     * 自定义一个带颜色的单元格
     */
    class ColorCell extends ListCell<String>{
        @Override
        protected void updateItem(String s, boolean b) {
            super.updateItem(s, b);
            Ellipse ellipse = new Ellipse(70, 10);
            //设置图形颜色
            if (!b){
                ellipse.setFill(Color.web(s));
                setGraphic(ellipse);
            }
        }
    }
}