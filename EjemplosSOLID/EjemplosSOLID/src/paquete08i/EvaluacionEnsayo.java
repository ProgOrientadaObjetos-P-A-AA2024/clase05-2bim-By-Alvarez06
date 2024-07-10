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
public class EvaluacionEnsayo implements EvaluacionTipoDos {

    private int numeroProblemas;
    private double totalProblemas;
    protected double promedioEnsayo;

    
    public void establecerNumeroProblemas(int n) {
        numeroProblemas = n;
    }

    public void establecerTotalProblemas(double n) {
        totalProblemas = n;
    }

    public int obtenerNumeroProblemas() {
        return numeroProblemas;
    }

    public double obtenerTotalProblemas() {
        return totalProblemas;
    }
    
    
    @Override
    public void establecerPromedioEnsayo() {

        promedioEnsayo = obtenerTotalProblemas() / obtenerNumeroProblemas();

    }
    /*
    Los metodos establecer y obtener PromedioEnsayo se utilizan en esta clase
    debido a que la misma implementa la interfaz especificada al inicio, por lo
    tanto, se ve en la obligación de implementar todas las funciones de la
    interfaz
    */
    @Override
    public double obtenerPromedioEnsayo() {
        return promedioEnsayo;

    }
    
}
