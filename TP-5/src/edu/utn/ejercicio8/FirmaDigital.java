package edu.utn.ejercicio8;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;

/**
 *
 * @author Pedro Hidalgo
 */
public class FirmaDigital {
    
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(Usuario usuario, String titulo, String contenido) {
        this.usuario = usuario;
        this.fecha = LocalDate.now().toString();
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            String datos = titulo + contenido + usuario.toString() + this.fecha;
            byte[] hashBytes = digest.digest(datos.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            this.codigoHash = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al generar el hash SHA-256", e);
        }
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital{\n  codigoHash=" + codigoHash + ",\n  fecha=" + fecha + ",\n  usuario=" + usuario + "\n }";
    }
    
}
