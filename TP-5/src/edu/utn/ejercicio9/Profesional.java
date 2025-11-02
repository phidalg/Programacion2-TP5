package edu.utn.ejercicio9;

/**
 *
 * @author Pedro Hidalgo
 */
public class Profesional {
    
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Profesional{nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
    
}
