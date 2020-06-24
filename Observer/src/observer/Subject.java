package observer;

import java.util.ArrayList;
import java.util.Collection;

import colores.GamaColores;

public interface Subject {
	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	Collection<Observer> getObservers();

}
