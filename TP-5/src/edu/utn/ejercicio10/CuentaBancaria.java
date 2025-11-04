package edu.utn.ejercicio10;

/**
 *
 * @author Pedro Hidalgo
 */
public class CuentaBancaria {
    
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String password) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(password);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }

    public void ingresarDinero(double monto) {
        this.saldo += monto;
    }
    
    public void retirarDinero(double monto, String password) {
        String codigoHash = Hash.generarHash(password);
        if (codigoHash.equals(this.claveSeguridad.getCodigo())) {
            if (this.saldo >= monto) {
                this.saldo -= monto;
                System.out.println("Operación exitosa.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }
    
    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{\ncbu= " + cbu + ",\nsaldo= " + saldo + ",\nclaveSeguridad= " + claveSeguridad + '}';
    }

}