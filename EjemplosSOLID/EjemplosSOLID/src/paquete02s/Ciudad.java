package paquete02s;

public class Ciudad {
    private String nombre;
    
    public Ciudad(String n){
        nombre = n;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
}
