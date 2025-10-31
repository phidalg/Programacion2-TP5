package edu.utn;

import edu.utn.ejercicio1.Pasaporte;
import edu.utn.ejercicio1.Titular;
import edu.utn.ejercicio2.Bateria;
import edu.utn.ejercicio2.Celular;
import edu.utn.ejercicio2.Usuario;
import edu.utn.ejercicio3.Autor;
import edu.utn.ejercicio3.Editorial;
import edu.utn.ejercicio3.Libro;
import edu.utn.ejercicio4.Banco;
import edu.utn.ejercicio4.Cliente;
import edu.utn.ejercicio4.TarjetaDeCredito;
import edu.utn.ejercicio5.Computadora;
import edu.utn.ejercicio5.Propietario;
import edu.utn.ejercicio6.Mesa;
import edu.utn.ejercicio6.Reserva;
import edu.utn.ejercicio7.Conductor;
import edu.utn.ejercicio7.Motor;
import edu.utn.ejercicio7.Vehiculo;

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
        
        System.out.println("\nEjercicio 4:\n");
        Banco banco1 = new Banco("Banco Rico", "30-12345678-3");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito(banco1, "31/12/2030", "1234567890");
        Cliente cliente1 = new Cliente("Fulano", "12345678");
        cliente1.setTarjetaDeCredito(tarjeta1);
        System.out.println(cliente1);
        
        System.out.println("\nEjercicio 5:\n");
        Propietario propietario1 = new Propietario("Fulano", "12345678");
        Computadora computadora1 = new Computadora("adfaasdaa", "963852", "400", "abc");
        propietario1.setComputadora(computadora1);
        System.out.println(computadora1);
        
        System.out.println("\nEjercicio 6:\n");
        Mesa mesa1 = new Mesa(20, 4);
        edu.utn.ejercicio6.Cliente cliente2 = new edu.utn.ejercicio6.Cliente("Fulano", "1234567890");
        Reserva reserva1 = new Reserva("10/11/25", "20:00", mesa1);
        reserva1.setCliente(cliente2);
        System.out.println(reserva1);
        
        System.out.println("\nEjercicio 7:\n");
        Motor motor1 = new Motor("V8", "123-456-789");
        Vehiculo vehiculo1 = new Vehiculo("ABC-123", "Renault 12", motor1);
        Conductor conductor1 = new Conductor("Fulano", "123456");
        vehiculo1.setConductor(conductor1);
        System.out.println(conductor1);
        
        System.out.println("\nEjercicio 8:\n");
        
        
        System.out.println("\nEjercicio 9:\n");
        
        
        System.out.println("\nEjercicio 10:\n");
        
        
        System.out.println("\nEjercicio 11:\n");
        
        
        System.out.println("\nEjercicio 12:\n");
        
        
        System.out.println("\nEjercicio 13:\n");
        
        
        System.out.println("\nEjercicio 14:\n");
        
    }
    
}
