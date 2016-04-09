
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.scene.*;

public class Testcal extends Application{
	@Override
	public void start(Stage primaryStage){

		Cal pane=new Cal();
		pane.buttonAction();
		Scene scene = new Scene(pane, 300, 450);
    	primaryStage.setTitle("Cal"); // Set the stage title
    	primaryStage.setScene(scene);
    	primaryStage.show();		
	}
	
        public static void main(String[] args){
            Application.launch(args);
        } 			
}
