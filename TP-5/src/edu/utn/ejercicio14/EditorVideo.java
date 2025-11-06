package edu.utn.ejercicio14;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class EditorVideo {
    
    public static Render exportar(String formato, Proyecto proyecto) {
        return new Render(formato, proyecto);
    }

}