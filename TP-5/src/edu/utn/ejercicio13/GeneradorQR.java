package edu.utn.ejercicio13;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class GeneradorQR {

    public static CodigoQR generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor);
        codigo.setUsuario(usuario);
        return codigo;
    }
}
