package inclass01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    private TextField totalInvestment = new TextField();
    private TextField years = new TextField();
    private TextField annualInterestRate = new TextField();
    private  TextField futureValue = new TextField();
    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10));
        pane.setHgap(5);
        pane.setVgap(5);

        pane.add(new Label("投资总额"), 0, 0);
        pane.add(totalInvestment, 1, 0);
        pane.add(new Label("投资年数"), 0, 1);
        pane.add(years, 1, 1);
        pane.add(new Label("年利率"), 0, 2);
        pane.add(annualInterestRate, 1, 2);
        pane.add(new Label("未来值"), 0, 3);
        pane.add(futureValue, 1, 3);

        Button calculation = new Button("计算");
        pane.add(calculation, 1, 4);
        GridPane.setHalignment(calculation, HPos.RIGHT);
        calculation.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                calculateFutureValue();
            }
        });

        primaryStage.setTitle("投资计算器");
        primaryStage.setScene(new Scene(pane, 300, 275));
        primaryStage.show();
    }

    public void calculateFutureValue(){
        double investment = Double.parseDouble(totalInvestment.getText());
        int year = Integer.parseInt(years.getText());
        double rate = Double.parseDouble(annualInterestRate.getText());
        Investment inv = new Investment(investment, year, rate);
        futureValue.setText(String.format(String.valueOf(inv.getFutureValue())));
    }

    public static void main(String[] args) {
        launch(args);
    }
}