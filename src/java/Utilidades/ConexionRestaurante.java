
package Utilidades;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;



public  class ConexionRestaurante {

private static Connection conexion;

//este metodo devuelve un objeto de tipo conexion

//private  final static Logger log = Logger.getLogger(Conexion.class);
//creamos un objeto de tipo logger
private final static Logger log = Logger.getLogger(ConexionRestaurante.class);

public static Connection conexionRestaurante() throws ClassNotFoundException, SQLException{
    
    BasicConfigurator.configure();
    String classname="com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost/restaurante";
    String user = "root";
    String password = "root";
    
   Class.forName(classname);
   conexion=DriverManager.getConnection(url,user,password);
   log.trace("------> dando un voltio por aqui <----------");
    
    if(conexion !=null){
        
        System.out.println("Conexion establecida");
        log.debug("La conexion porompompom esta establecida");
        
        
    } else{
        
        System.out.println("Conexion abortada");
        log.warn("Errores locos en la conexion");
    }
    return conexion;
}



public static  void cerrarConexion() throws ClassNotFoundException, SQLException{

    if(conexion !=null){
    conexion.close();
    System.out.println("Conexion Cerrada");
   }else{
      System.out.println("Se ha producido un error");  
    }
     
}
}
