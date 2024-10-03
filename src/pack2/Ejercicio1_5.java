package pack2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejercicio1_5 {
    public static void main(String[] args) throws IOException {
        File directorio = new File("/archivoQueNoExiste");
        //AL PROBAR CON UN PROGRAMA QUE NO EXISTE SALTARÁ LA IOEXCEPTION
        //EL PROGRAMA PARARA LA EJECUCIÓN CUANDO LLEGUE A LA LINEA "Process p = pb.start();

        ProcessBuilder pb = new ProcessBuilder("/home/usuario/.jdks/openjdk-23-1/bin/java", "Ejemplo2");

        pb.directory(directorio);

        System.out.printf("Directorio de trabajo: %s%n",pb.directory());

        Process p = pb.start();

        try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            is.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
