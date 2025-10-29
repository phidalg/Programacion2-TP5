package edu.utn.ejercicio5;

/**
 *
 * @author Pedro Hidalgo
 */
public class Computadora {
    
    private String marca;
    private String nummeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String nummeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.nummeroSerie = nummeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getNummeroSerie() {
        return nummeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", nummeroSerie=" + nummeroSerie + ", placaMadre=" + placaMadre + ", propietario=" + propietario + '}';
    }

}
