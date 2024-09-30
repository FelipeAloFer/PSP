package pack1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class EjecucionLeerNombre {
    public static void main(String[] args) throws IOException {
        // Establecer el directorio de trabajo correcto
        File fichero = new File("/home/usuario/Escritorio/PSP/out/production/PSP");

        // Invocar la clase LeerNombre correctamente con el paquete
        ProcessBuilder pb = new ProcessBuilder("/home/usuario/.jdks/openjdk-23-1/bin/java", "pack1.LeerNombre", "Javi");

        // Establecer el directorio de trabajo para ProcessBuilder
        pb.directory(fichero);

        // Iniciar el proceso
        Process p = pb.start();

        // Esperar a que termine el proceso

        try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1){
                System.out.print((char)c);
            }
            is.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        int salida;
        try {
            salida = p.waitFor();
            System.out.println("El valor de salida es: " + salida);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}