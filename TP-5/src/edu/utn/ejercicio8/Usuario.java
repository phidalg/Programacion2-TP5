package edu.utn.ejercicio8;

/**
 *
 * @author Pedro Hidalgo
 */
public class Usuario {
    
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario{\n   nombre=" + nombre + ",\n   email=" + email + "\n  }";
    }
    
}
