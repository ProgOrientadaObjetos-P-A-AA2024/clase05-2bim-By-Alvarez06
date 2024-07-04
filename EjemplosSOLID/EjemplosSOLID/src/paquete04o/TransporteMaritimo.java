/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author reroes
 */
public class TransporteMaritimo extends Transporte{
    private String cooperativaBarco;
    
    
    public void establecerCooperativaTransvia(String n){
        cooperativaBarco = n;
    }
    
    
    public void establecerTarifa(){
        tarifa = 45 + 0.8;
    }
}
