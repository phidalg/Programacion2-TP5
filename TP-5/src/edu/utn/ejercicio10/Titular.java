package edu.utn.ejercicio10;

/**
 *
 * @author Pedro Hidalgo
 */
public class Titular {
    
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    @Override
    public String toString() {
        return "Titular{\nnombre= " + nombre + ",\ndni= " + dni + ",\ncuentaBancaria= " + cuentaBancaria + '}';
    }
    
}