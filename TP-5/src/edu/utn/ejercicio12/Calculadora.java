package edu.utn.ejercicio12;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Calculadora {

    public static void calccular(Impuesto impuesto) {
        String contribuyente = impuesto.getContribuyente().getNombre();
        String monto = String.valueOf(impuesto.getMonto());
        System.out.println(contribuyente + " debe pagar un impuesto del " + monto + "%");
    }
}
