//ESTE CODIGO CREA UN PROCESO DEL EJEMPLOLECTURA Y REDIRIGE LA ENTRADA, LA SALIDA
//Y LOS ERRORES A TRES DIFERENTES FICHEROS
package pack4;

import java.io.File;

public class Ejercicio1_7 {
    public static void main(String[] args) throws Exception {
        File fichero = new File("/home/usuario/Escritorio/PSP/out/production/PSP");

        ProcessBuilder pb = new ProcessBuilder("/home/usuario/.jdks/openjdk-23-1/bin/java", "pack4.EjemploLectura");

        pb.directory(fichero);

        File ficheroEntrada = new File("/home/usuario/Escritorio/PSP/out/production/PSP/pack4/entrada.txt");
        pb.redirectInput(ficheroEntrada);

        File ficheroErrores = new File("/home/usuario/Escritorio/PSP/out/production/PSP/pack4/errores.txtt");
        pb.redirectError(ficheroErrores);

        File ficheroSalida = new File("/home/usuario/Escritorio/PSP/out/production/PSP/pack4/salida.txt");
        pb.redirectOutput(ficheroSalida);

        Process p = pb.start();
    }
}
