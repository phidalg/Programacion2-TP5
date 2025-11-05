package edu.utn;

import edu.utn.ejercicio1.Pasaporte;
import edu.utn.ejercicio1.Titular;
import edu.utn.ejercicio10.CuentaBancaria;
import edu.utn.ejercicio11.Artista;
import edu.utn.ejercicio11.Cancion;
import edu.utn.ejercicio11.Reproductor;
import edu.utn.ejercicio12.Calculadora;
import edu.utn.ejercicio12.Contribuyente;
import edu.utn.ejercicio12.Impuesto;
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
import edu.utn.ejercicio8.Documento;
import edu.utn.ejercicio8.FirmaDigital;
import edu.utn.ejercicio9.CitaMedica;
import edu.utn.ejercicio9.Paciente;
import edu.utn.ejercicio9.Profesional;

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
        edu.utn.ejercicio8.Usuario usuario2 = new edu.utn.ejercicio8.Usuario("Fulano", "fulano@utn.edu.ar");
        Documento documento1 = new Documento("Contrato", "Clausulas...", usuario2);
        System.out.println(documento1);
        
        System.out.println("\nEjercicio 9:\n");
        Paciente paciente1 = new Paciente("Fulano", "PAMI");
        Profesional profesional1 = new Profesional("Doc", "Cirujano");
        CitaMedica cita1 = new CitaMedica("2/11/2025", "10:00");
        cita1.setPaciente(paciente1);
        cita1.setProfesional(profesional1);
        System.out.println(cita1);
        
        System.out.println("\nEjercicio 10:\n");
        System.out.println("Se crean instancias de Titular, CuentaBancaria y ClaveSeguridad");
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("123456789", 1000.00, "qwerty");
        edu.utn.ejercicio10.Titular titular2 = new edu.utn.ejercicio10.Titular("Fulano", "12345678");
        titular2.setCuentaBancaria(cuentaBancaria1);
        System.out.println(titular2);
        
        System.out.println("\nIntento de cambiar la clave de seguridad con contraseña incorrecta:");
        cuentaBancaria1.getClaveSeguridad().cambiarClave("aaaaa", "1234");
        System.out.println("\nIntento de cambiar la clave de seguridad con contraseña correcta:");
        cuentaBancaria1.getClaveSeguridad().cambiarClave("qwerty", "1234");
        
        System.out.println("\nIntento de retirar dinero con contraseña incorrecta:");
        cuentaBancaria1.retirarDinero(500, "aaaa");
        System.out.println("\nIntento de retirar dinero con contraseña correcta:");
        cuentaBancaria1.retirarDinero(500, "1234");
        
        System.out.println("\nNuevo estado de la cuenta:");
        System.out.println(cuentaBancaria1);
        
        System.out.println("\nEjercicio 11:\n");
        Artista artista1 = new Artista("Atahualpa Yupanqui", "Folklore");
        Cancion cancion1 = new Cancion("El arriero va");
        cancion1.setArtista(artista1);
        System.out.println(cancion1);
        Reproductor.reproducir(cancion1);
        
        System.out.println("\nEjercicio 12:\n");
        Contribuyente contribuyente1 = new Contribuyente("Fulano", "20-12345678-3");
        Impuesto impuesto1 = new Impuesto(21.00);
        impuesto1.setContribuyente(contribuyente1);
        System.out.println(impuesto1);
        Calculadora.calccular(impuesto1);
        
        System.out.println("\nEjercicio 13:\n");
        
        
        System.out.println("\nEjercicio 14:\n");
        
    }
    
}
