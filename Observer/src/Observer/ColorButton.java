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
	
	
	
}
