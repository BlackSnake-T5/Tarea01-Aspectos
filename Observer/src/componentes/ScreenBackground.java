package componentes;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import observer.*;
import colores.GamaColores;

// Componente que es un 'observador' esperando a un evento
// En este caso observa al evento de cambio de color para cambiar 
// El color de la pantalla

public class ScreenBackground implements Observer{
	public Node node;	
	
	public ScreenBackground(Node node) {
		this.node = node;
	}
	
	public Node getNode(){
		return node;
	}
	
	public static String getStringColor(Color c){
        return "#" + c.toString().substring(2, 8);
    }

	@Override
	public void update(Subject observable, GamaColores color) {
		String stringColor = ScreenBackground.getStringColor(color.getRelleno());
		node.setStyle("-fx-background-color:" + stringColor + ";");
		
	}

}
