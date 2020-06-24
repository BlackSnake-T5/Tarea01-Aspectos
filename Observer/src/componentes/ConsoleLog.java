package componentes;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import observer.*;
import colores.GamaColores;

//Componente que es un 'observador' esperando a un evento
//En este caso observa al evento de cambio de color para escribir 
//El color en la consola
public class ConsoleLog  implements Observer{
	
	/*private Subject observable;
	
	public ConsoleLog(Subject observable) {
		this.observable = observable;
	}*/
	
	public void update(Subject observable, GamaColores newColor) {
		System.out.println(newColor.getRelleno().toString());
	}

}
