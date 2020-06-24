/*package observer;

import java.util.ArrayList;

import colores.GamaColores;

public class ObserverManager {
	ArrayList<Observer> observers;
	
	public ObserverManager() {
		observers = new ArrayList<>();
	}
	
	public void subscribe(Observer observer) {
		observers.add(observer);
	}
	
	public void unsubscribe(Observer observer) {
		observers.remove(observer);
	}
	
	public void notify(GamaColores color) {
		for(Observer observer : observers) {
			observer.updateColor(color);
		}
	}

}*/
