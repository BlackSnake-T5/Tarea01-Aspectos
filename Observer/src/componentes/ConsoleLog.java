package componentes;

import colores.GamaColores;
import observer.Observer;

//Componente que es un 'observador' esperando a un evento
//En este caso observa al evento de cambio de color para escribir 
//El color en la consola
public class ConsoleLog implements Observer{

	@Override
	public void updateColor(GamaColores color) {
		System.out.println(color.getRelleno().toString());
		
	}

}
