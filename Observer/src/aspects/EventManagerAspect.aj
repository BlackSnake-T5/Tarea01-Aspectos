package aspects;

import colores.GamaColores;
import componentes.*;
import javafx.scene.Node;
import observer.*;
import core.MainWindow; 


public aspect EventManagerAspect extends ObserverPattern{
	declare parents: MainWindow implements Subject;
    //declare parents: ScreenBackground implements Observer;
	//declare parents: ConsoleLog implements Observer;
     

	public pointcut getRoot(Subject obs, Node nodo): 
		target(obs) && call(void MainWindow.updateRoot(Node)) && args(nodo);
	
	
	public pointcut notifyObservers(Subject observable, GamaColores newColor): 
		target(observable) && call(void MainWindow.updateColor(GamaColores)) && args(newColor);
	
	


}
