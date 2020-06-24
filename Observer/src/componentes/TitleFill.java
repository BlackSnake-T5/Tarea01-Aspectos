package componentes;

import colores.GamaColores;
import javafx.scene.control.Label;
import observer.Observer;

public class TitleFill implements Observer {
	private Label titulo;
	public TitleFill(Label titulo) {
		this.titulo = titulo;
	}

	@Override
	public void updateColor(GamaColores color) {
		titulo.setTextFill(color.getBorde());
		
	}
}
