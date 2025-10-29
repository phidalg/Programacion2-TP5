package edu.utn;

import edu.utn.ejercicio1.Pasaporte;
import edu.utn.ejercicio1.Titular;

/**
 *
 * @author Pedro Hidalgo
 */
public class TP5 {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio 1:\n");
        Titular titular1 = new Titular("Juan", "12345678");
        Pasaporte pasaporte1 = new Pasaporte("123456789", "01/01/2025", "url", "formato pasaporte");
        titular1.setPasaporte(pasaporte1);
        System.out.println(pasaporte1.toString());
    }
    
}
