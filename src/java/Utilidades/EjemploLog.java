
package Utilidades;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class EjemploLog {
    
    //De esta forma configuramos Logger personalizados para cada clase. 
private final static Logger log = Logger.getLogger(EjemploLog.class);
    
    public static void main(String[] args) {
        //Necesitamos un BasicConfigurator para nuestros log.
                BasicConfigurator.configure();
		Logger log = Logger.getLogger("Logger de Ejemplo");
		log.warn("un warning");
		log.error("un error");
    }
    
}
