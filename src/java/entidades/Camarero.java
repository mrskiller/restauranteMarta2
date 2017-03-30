
package entidades;


public class Camarero {
    
    String idCamarero; 
    String nombre; 
    String apellido;

    public Camarero(String idCamarero, String nombre, String apellido) {
        this.idCamarero = idCamarero;
        this.nombre = nombre;
        this.apellido = apellido;
    }

  public Camarero(){
      
  }
  
  public Camarero(String idCamarero){
      this.idCamarero=idCamarero;
  }

    public String getIdCamarero() {
        return idCamarero;
    }

    public void setIdCamarero(String idCamarero) {
        this.idCamarero = idCamarero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
