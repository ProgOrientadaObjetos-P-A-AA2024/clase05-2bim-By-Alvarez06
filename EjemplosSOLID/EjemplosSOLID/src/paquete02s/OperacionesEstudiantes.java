/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02s;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;
    // Una Persona, tiene un atributo ciudad de tipo Ciudad
    // Una Ciudad, tiene un atributo nombre de tipo String
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public void establecerEdadMinima(){
        edadminima = 100;
        for (Persona e: estudiantes) {
            if (e.obtenerEdad() < edadminima) {
                edadminima = e.obtenerEdad();
            }
        }
    }
    
    public void establecerEdadMaxima(){
        edadmaxima = 0;
        for (Persona e: estudiantes) {
            if (e.obtenerEdad() > edadmaxima) {
                edadmaxima = e.obtenerEdad();
            }
        }
    }
    
    public void establecerListaCiudadesEstudiantes(){
        listaCiudadesEstudiantes = "";
        for (Persona e : estudiantes){
            listaCiudadesEstudiantes = String.format("%s%s\n", 
                    listaCiudadesEstudiantes, e.obtenerCiudad().obtenerNombre());
        }
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public double obtenerPromedioEdades(){
        return promedioEdades;
    }
    
    public int obtenerEdadMinima(){
        return edadminima;
    }
    
    public int obtenerEdadMaxima(){
        return edadmaxima;
    }
    
    public String obtenerListaCiudadesEstudiantes(){
        return listaCiudadesEstudiantes;
    }
    
    public String toString(){
        String cadena = String.format("Lista estudiantes:");
        for (Persona e : estudiantes) {
            cadena = String.format("%s\n%s - %d años", 
                    cadena, e.obtenerNombre(), e.obtenerEdad());
        }
        
        cadena = String.format("%s\n"
                + "\nLista Ciudades:\n%s", cadena, listaCiudadesEstudiantes);
        
        cadena = String.format("%s"
                + "\nEdad minima: %d"
                + "\nEdad maxima: %d"
                + "\nPromedio de edades: %.2f", 
                cadena, edadminima, edadmaxima, promedioEdades);
        
        return cadena;
    }
}
