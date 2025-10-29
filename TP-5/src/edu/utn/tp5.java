package edu.utn;

import edu.utn.ejercicio1.Pasaporte;
import edu.utn.ejercicio1.Titular;
import edu.utn.ejercicio2.Bateria;
import edu.utn.ejercicio2.Celular;
import edu.utn.ejercicio2.Usuario;
import edu.utn.ejercicio3.Autor;
import edu.utn.ejercicio3.Editorial;
import edu.utn.ejercicio3.Libro;

/**
 *
 * @author Pedro Hidalgo
 */
public class TP5 {

    public static void main(String[] args) {
        
        System.out.println("\nEjercicio 1:\n");
        Titular titular1 = new Titular("Fulano", "12345678");
        Pasaporte pasaporte1 = new Pasaporte("123456789", "01/01/2025", "url", "formato pasaporte");
        titular1.setPasaporte(pasaporte1);
        System.out.println(pasaporte1);
        
        System.out.println("\nEjercicio 2:\n");
        Bateria bateria1 = new Bateria("asdfs", "5000");
        Celular celu1 = new Celular("123456", "adfaasdaa", "Adfa - 3000", bateria1);
        Usuario usuario1 = new Usuario("Fulano", "12345678");
        usuario1.setCelular(celu1);
        System.out.println(usuario1);
        
        System.out.println("\nEjercicio 3:\n");
        Editorial editorial1 = new Editorial("Ediciones Fulano", "Número sin Calle");
        Autor autor1 = new Autor("Fulano", "Argentina");
        Libro libro1 = new Libro("Libro 1", "00000001", editorial1);
        libro1.setAutor(autor1);
        System.out.println(libro1);
        
    }
    
}
