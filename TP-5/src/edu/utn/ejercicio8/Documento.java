package edu.utn.ejercicio8;

/**
 *
 * @author Pedro Hidalgo
 */
public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(usuario, titulo, contenido);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    @Override
    public String toString() {
        return "Documento{\n titulo=" + titulo + ",\n contenido=" + contenido + ",\n firmaDigital=" + firmaDigital + "\n}";
    }
    
}