/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author utpl
 */
public class Banco {
    private String nombre;
    
    public Banco(String n){
        nombre = n;
    }
    
    public void establecerNombreBanco(String n){
        nombre = n;
    }
    
    public String obtenerNombreBanco(){
        return nombre;
    }
}
