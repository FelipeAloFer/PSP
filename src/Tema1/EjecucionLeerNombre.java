package Tema1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class EjecucionLeerNombre {
    public static void main(String[] args) throws IOException {
        Process p = new ProcessBuilder("java", "/home/usuario/Escritorio/PSP/src/Tema1/LeerNombre.java", "ArgumentoImaginario").start();

        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de salida: " + exitVal);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
