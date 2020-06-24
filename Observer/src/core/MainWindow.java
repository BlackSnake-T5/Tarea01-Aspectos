package core;

import colores.GamaColores;
import componentes.ConsoleLog;
import componentes.ScreenBackground;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import observer.ObserverManager;

public class MainWindow {
	private final BorderPane root;
	private Label titulo;
	private VBox vb;
	
	public MainWindow() {
		// Se instancia componentes de GUI
		root = new BorderPane();
		vb=new VBox();
		
		// Detalles de GUI
		vb.setSpacing(10);
		vb.setAlignment(Pos.CENTER);
		makeTop();
		
		
		// Se instancia el manejador de los Observadores
		ObserverManager om = new ObserverManager();
		om.subscribe(new ScreenBackground(root));
		om.subscribe(new ConsoleLog());
		
		// Se agregan los colores disponibles al vbox
		for(GamaColores gc : GamaColores.getGamas()) {
			// Se crea un ColorButton
			ColorButton cb = new ColorButton(gc);
			
			// Por cada color se notifica a los 'observadores' cuando 
			// es clickeado
			cb.getRoot().setOnMouseClicked(mouseEvent -> {
				om.notify(gc);
			});
			
			// se agrega y guarda en el vbox
			vb.getChildren().add(cb.getRoot());
		}
		
		// Se agrega al root
		root.setCenter(vb);
		
	}

	private void makeTop() {
		titulo=new Label("ObserverApp");
        titulo.setMinHeight(80);
        VBox vb=new VBox(titulo);
        vb.setPadding(new Insets(10,0,10,0));
        titulo.setFont(Font.font("Arial Bold Italic",FontWeight.BOLD, 60));
        vb.setAlignment(Pos.CENTER);
        root.setTop(vb);
	}
	
	public BorderPane getRoot() {
		return root;
	}
	
	
}
