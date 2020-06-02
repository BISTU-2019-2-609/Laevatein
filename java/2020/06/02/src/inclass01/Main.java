package inclass01;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			
			Button btn = new Button("Say'Hello world'");
			root.setCenter(btn);
			MyEventHandler handler = new MyEventHandler();
			btn.setOnAction(handler);
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private class MyEventHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent arg0) {
			System.out.println("Hello world, Laevatein Scarlet!");
		}
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
