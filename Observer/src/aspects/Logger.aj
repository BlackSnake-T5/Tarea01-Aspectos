import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import colores.GamaColores;
import aspects.ObserverPattern;
import core.MainWindow;

public aspect Logger{
	File file = new File("log.txt");
    Date date = new Date();   
    
	pointcut change(GamaColores color): call(void MainWindow.updateColor(GamaColores)) && args(color);
	
    after(GamaColores color) : change(color) {
    	Calendar calendar = Calendar.getInstance();
        int horas=calendar.get(Calendar.HOUR_OF_DAY);
        int minutos=calendar.get(Calendar.MINUTE);
        int segundos=calendar.get(Calendar.SECOND);
    	try {
    		FileWriter w = new FileWriter(file,true);
    		String msj=("El color cambió a: "+color.getRelleno().toString()+" a las:" +horas+":"+minutos+":"+segundos+"\n");
    		w.write(msj);
    		w.close();
    		System.out.println(msj);
    	}catch(IOException e){
    		System.out.println("Error al escribir");
    	}	
    }
    
}
