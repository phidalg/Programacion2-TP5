package edu.utn.ejercicio10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Pedro Hidalgo
 */
public class ClaveSeguridad {
    
    private String codigo;
    private String ultimaModificacion;
    
    public ClaveSeguridad(String password) {
        this.codigo = Hash.generarHash(password);
        this.ultimaModificacion = getCurrentTimestamp();
    }
     
    private String getCurrentTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }
    
    public void cambiarClave(String anterior, String nueva) {
        String codigoHash = Hash.generarHash(anterior);
        if (codigoHash.equals(this.codigo)) {
            String codigoNuevo = Hash.generarHash(nueva);
            this.codigo = codigoNuevo;
            this.ultimaModificacion = getCurrentTimestamp();
            System.out.println("Contraseña actualizada con exito.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{\ncodigo= " + codigo + ",\nultimaModificacion= " + ultimaModificacion + '}';
    }
    
}