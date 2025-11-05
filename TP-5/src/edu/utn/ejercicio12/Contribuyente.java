package edu.utn.ejercicio12;

/**
 *
 * @author Pedro Hidalgo
 */
public class Contribuyente {

    private String nombre;
    private String cuit;

    public Contribuyente(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }

    @Override
    public String toString() {
        return "Contribuyente{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
    }
    
}