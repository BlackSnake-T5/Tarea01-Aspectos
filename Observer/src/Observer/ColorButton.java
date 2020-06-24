package Observer;

import colores.GamaColores;
import javafx.scene.shape.Rectangle;

public class ColorButton {
	private final GamaColores gamaColor;
	private final Rectangle root;
	
	public ColorButton(GamaColores gc) {
		gamaColor=gc;
		root=new Rectangle(120, 40, gamaColor.getRelleno());
		root.setStroke(gamaColor.getBorde());
        root.setStrokeWidth(5);
	}
	
	public Rectangle getRoot() {
		return root;
	}
	
	public GamaColores getGamaColor() {
		return gamaColor;
	}
	
	/*
	private void actualizarFondoTop(Color c,Color c2){
        top.setStyle("-fx-background-color:" + getStringColor(c) + ";");
        titulo.setTextFill(c2);
        for(SeccionBoton sb:secciones){
            sb.boton.setStyle("-fx-border-color: "+getStringColor(c2)+"; -fx-border-width: 2px;");
        }
    }
    
    private String getStringColor(Color c){
        return "#" + c.toString().substring(2, 8);
    }
	*/
	
}
