package edu.utn.ejercicio10;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Pedro Hidalgo
 */
public abstract class Hash {
    
    public static String generarHash(String password) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes =messageDigest.digest(password.getBytes());
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : hashedBytes) {
                stringBuilder.append(String.format("%02x", b));
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException exception) {
            throw new RuntimeException("Error al generar hash", exception);
        }
    }
    
}