/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        Banco bancoLoja = new Banco("Banco de Loja");
        
        // TarjetaCredito t1 = new TarjetaCredito("Visa", "11011011");
        TarjetaCredito t1 = new TarjetaCredito();
        t1.establecerNombre("Visa");
        t1.establecerNumero("11011011");
        t1.establecerBanco(bancoLoja);
        
        MayorEdad representante = new MayorEdad("José", t1);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        System.out.printf("Nombre: %s - Tarjeta: %s - Banco: %s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNumero(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerBanco().obtenerNombreBanco());
        
    }
}
