//ESTE CODIGO CREA UN PROCESO DEL EJEMPLOLECTURA, MOSTRANDO LA SALIDA
// EN LA CONSOLA Y LUEGO EJECUTA EL PROCESO DE NUEVO, PASANDO LA ENTRADA CON FICHEROS
// Y MOSTRANDO LA SALIDA Y LOS ERRORES EN FICHEROS TAMBIEN
package pack5;

import java.io.File;

public class Ejercicio1_8 {
    public static void main(String[] args) throws Exception {
        File fichero = new File("/home/usuario/Escritorio/PSP/out/production/PSP");

        ProcessBuilder pb = new ProcessBuilder("/home/usuario/.jdks/openjdk-23-1/bin/java", "pack4.EjemploLectura");

        pb.directory(fichero);

        pb.inheritIO();

        Process p = pb.start();

        File ficheroEntrada = new File("/home/usuario/Escritorio/PSP/out/production/PSP/pack5/entrada.txt");
        pb.redirectInput(ficheroEntrada);

        File ficheroErrores = new File("/home/usuario/Escritorio/PSP/out/production/PSP/pack5/errores.txtt");
        pb.redirectError(ficheroErrores);

        File ficheroSalida = new File("/home/usuario/Escritorio/PSP/out/production/PSP/pack5/salida.txt");
        pb.redirectOutput(ficheroSalida);

        Process p2 = pb.start();
    }
}

