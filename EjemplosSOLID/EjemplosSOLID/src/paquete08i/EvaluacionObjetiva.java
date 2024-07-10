/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete08i;

/**
 *
 * @author reroes
 */

/*
IMPLEMENTS - Se utiliza para implementar interfaces
EXTENDS - Se utiliza para implementar clases (herencia)
*/
public class EvaluacionObjetiva implements EvaluacionTipoUno {

    protected double promedioObjetivas;
    private int numeroPreguntas;
    private double totalPreguntas;

    public void establecerNumeroPreguntas(int n) {
        numeroPreguntas = n;
    }

    public void establecerTotalPreguntas(double n) {
        totalPreguntas = n;
    }

    public int obtenerNumeroPreguntas() {
        return numeroPreguntas;
    }

    public double obtenerTotalPreguntas() {
        return totalPreguntas;
    }

    @Override
    public void establecerPromedioObjetivas() {
        promedioObjetivas = obtenerTotalPreguntas() / obtenerNumeroPreguntas();
    }
    /*
    Los metodos establecer y obtener PromedioEnsayo se utilizan en esta clase
    debido a que la misma implementa la interfaz especificada al inicio, por lo
    tanto, se ve en la obligación de implementar todas las funciones de la
    interfaz
    */
    @Override
    public double obtenerPromedioObjetivas() {
        return promedioObjetivas;
    }

    
}
