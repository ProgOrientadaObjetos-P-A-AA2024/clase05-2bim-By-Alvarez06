/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author utpl
 */
public class TarjetaCredito {
    private String nombre;
    private String numero;
    /*
    public TarjetaCredito(String n, String m){
        nombre = n;
        numero = m;
    }
    */
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNumero(String n){
        numero = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerNumero(){
        return numero;
    }
}
