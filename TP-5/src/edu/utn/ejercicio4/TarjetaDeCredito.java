package edu.utn.ejercicio4;

/**
 *
 * @author Pedro Hidalgo
 */
public class TarjetaDeCredito {
    
    private Banco banco;
    private Cliente cliente;
    private String fechaDeVencimiento;
    private String numero;

    public TarjetaDeCredito(Banco banco, String fechaDeVencimiento, String numero) {
        this.banco = banco;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.numero = numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito() != this) {
            cliente.setTarjetaDeCredito(this);
        }
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "banco=" + banco +  ", fechaDeVencimiento=" + fechaDeVencimiento + ", numero=" + numero + '}';
    }
    
}
