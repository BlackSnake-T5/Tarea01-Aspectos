package observer;
import java.util.ArrayList;
import colores.GamaColores;
import core.ColorButton;

public abstract aspect ObserverManager{
	

	ArrayList<Observer> ColorButton.observers= new ArrayList<Observer>();
	pointcut change(ColorButton clr) : call(void notify(GamaColores color) )
                                  && target(clr);
    
   after(Point point) : moveAction(point)  {
       System.out.println("Point moved");
       // add new position
       point.observers.add(point);
        
       // Print the location of the point went through.
       System.out.println(" - "+point.observers);
   }
 
   public static void addObserver(Point p) {
       // p.observers.add(s);
   }
 
   public static void removeObserver(Point p) {
       // p.observers.remove(s);
   }
}*/
	
	public ObserverManager() {
		observers = new ArrayList<>();
	}

	public void subscribe(Observer observer) {
		observers.add(observer);
	}
	
	public void unsubscribe(Observer observer) {
		observers.remove(observer);
	}
  
	abstract pointcut stateChanges(GamaColores color);  
    after(GamaColores color): stateChanges(color) {
    	for(Observer observer : observers) {
			observer.updateColor(color);
		}
   }
}    
  