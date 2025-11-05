package edu.utn.ejercicio11;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Reproductor {

    public static void reproducir(Cancion cancion) {
        String titulo = cancion.getTitulo();
        String artista = cancion.getArtista().getNombre();
        System.out.println("Reproduciendo \"" + titulo + "\" de " + artista + "...");
    }

}
