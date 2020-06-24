package Observer;

import colores.GamaColores;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MainWindow {
	private final BorderPane root;
	private Label titulo;
	public MainWindow() {
		root = new BorderPane();
		VBox vb=new VBox();
		for(GamaColores gc : GamaColores.getGamas()) {
			ColorButton cb=new ColorButton(gc);
			vb.getChildren().add(cb.getRoot());
		}
		vb.setSpacing(10);
		vb.setAlignment(Pos.CENTER);
		makeTop();
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

	public void actualizarFondoTop(GamaColores gc){
        root.setStyle("-fx-background-color:" + getStringColor(gc.getRelleno()) + ";");
        titulo.setTextFill(gc.getBorde());
    }
    
    private String getStringColor(Color c){
        return "#" + c.toString().substring(2, 8);
    }
	
	
}
