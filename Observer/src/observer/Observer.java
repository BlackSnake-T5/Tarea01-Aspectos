package observer;

import colores.GamaColores;


// Interfaz que define al 'observador'
public interface Observer {
	void update(Subject observable,  GamaColores color);
}
