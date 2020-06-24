package core;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import observer.Subject;
import componentes.*;


public class Main extends Application{
	   @Override
	    public void start(Stage stage) {
		   	MainWindow mw = new MainWindow();
	        Scene scene = new Scene (mw.getRoot(), 500, 500);
	        stage.setScene(scene);
	        stage.show();
	    }

	    public static void main(String[] args) {
	        launch();
	    }

}
