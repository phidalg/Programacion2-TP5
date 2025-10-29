package edu.utn.ejercicio4;

/**
 *
 * @author Pedro Hidalgo
 */
public class Cliente {
    
    private TarjetaDeCredito tarjetaDeCredito;
    private String nombre;
    private String dni;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this) {
            tarjetaDeCredito.setCliente(this);
        }
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Cliente{" + "tarjetaDeCredito=" + tarjetaDeCredito + ", nombre=" + nombre + ", dni=" + dni + '}';
    }
    
}
