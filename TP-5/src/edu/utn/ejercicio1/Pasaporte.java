package edu.utn.ejercicio1;

import java.util.function.ToDoubleFunction;

/**
 *
 * @author Pedro Hidalgo
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }
    
    public void setTitular(Titular titular) {
        // OJO CON ESTO
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }
    
    
}
