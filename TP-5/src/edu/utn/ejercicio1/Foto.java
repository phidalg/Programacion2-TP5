package edu.utn.ejercicio1;

/**
 *
 * @author Pedro Hidalgo
 */
public class Foto {
    
    private String formato;
    private String imagen;

    public Foto(String formato, String imagen) {
        this.formato = formato;
        this.imagen = imagen;
    }

    public String getFormato() {
        return formato;
    }

    public String getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return "Foto{" + "formato=" + formato + ", imagen=" + imagen + '}';
    }
    
}
