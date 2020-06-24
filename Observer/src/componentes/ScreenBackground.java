package componentes;

import colores.GamaColores;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import observer.Observer;

// Componente que es un 'observador' esperando a un evento
// En este caso observa al evento de cambio de color para cambiar 
// El color de la pantalla
public class ScreenBackground implements Observer{
	private Node node;
	
	public ScreenBackground(Node node) {
		this.node = node;
	}

	@Override
	public void updateColor(GamaColores color) {
		node.setStyle("-fx-background-color:" + getStringColor(color.getRelleno()) + ";");
        
	}
	
	private String getStringColor(Color c){
        return "#" + c.toString().substring(2, 8);
    }

}
