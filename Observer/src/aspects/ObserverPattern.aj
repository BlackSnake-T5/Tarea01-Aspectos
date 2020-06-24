package aspects;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

import colores.GamaColores;
import componentes.*;
import javafx.scene.Node;
import observer.Observer;
import observer.Subject;

public abstract aspect ObserverPattern {
    
	public abstract pointcut notifyObservers(Subject observable, GamaColores newColor);
	public abstract pointcut getRoot(Subject obs, Node nodo);
	
	after(Subject observable,  GamaColores newColor) : notifyObservers(observable, newColor){
		for (Observer obs : observable.getObservers()) {
			obs.update(observable, newColor);
		}
	}

	after(Subject obs, Node nodo): getRoot(obs,nodo){
		
		obs.subscribe(new ConsoleLog());
		obs.subscribe(new ScreenBackground(nodo));
	}
	
	
	private final Collection<Observer> Subject.observers = new CopyOnWriteArrayList<Observer>();

	public void Subject.subscribe(Observer observer) {
		if (observer != null && !observers.contains(observer)) {
			observers.add(observer);
		}
	}

	public void Subject.unsubscribe(Observer observer) {
		if (observer != null) {
			observers.remove(observer);
		}
	}

	public Collection<Observer> Subject.getObservers() {
		return Collections.unmodifiableCollection(this.observers);
	}
	
	
}
