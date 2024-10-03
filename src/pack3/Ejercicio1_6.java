package pack3;

import java.io.*;

public class Ejercicio1_6 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("/home/usuario/Escritorio/PSP/out/production/PSP");

        ProcessBuilder pb = new ProcessBuilder("/home/usuario/.jdks/openjdk-23-1/bin/java", "pack3.Suma2Numeros", "FelipeElDuro");

        pb.directory(fichero);

        Process p = pb.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream())); //LEE LA SALIDA DEL PROCESO HIJO
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)); //LEE LA ENTRADA DEL PROCESO PADRE
        OutputStream os = p.getOutputStream(); //PERMITE ENVIAR LOS DATOS DE LA ENTRADA DEL PROCESO PADRE AL PROCESO HIJO


        System.out.println(br.readLine()); //LEE LA LINEA DE SALIDA DESDE Suma2Numeros.java
        String num1 = br2.readLine(); //LEE LA LINEA DE ENTRADA
        os.write((num1 + "\n").getBytes()); //MANDA LA LINEA Suma2Numeros.java
        os.flush(); //LIMPIA LA LINEA DE ENTRADA

        System.out.println(br.readLine()); //LEE LA LINEA DE SALIDA DESDE Suma2Numeros.java
        String num2 = br2.readLine(); //LEE LA LINEA DE ENTRADA
        os.write((num2 + "\n").getBytes()); //MANDA LA LINEA Suma2Numeros.java
        os.flush();//LIMPIA LA LINEA DE ENTRADA

        try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1){
                System.out.print((char) c);
            }
            is.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}





//package pack3;
//
//import java.io.*;
//
//public class Ejercicio1_6 {
//    public static void main(String[] args) {
//        File fichero = new File("/home/usuario/Escritorio/PSP/out/production/PSP");
//
//        try {
//            ProcessBuilder pb = new ProcessBuilder("/home/usuario/.jdks/openjdk-23-1/bin/java", "pack3.Suma2Numeros");
//            pb.directory(fichero);
//
//            Process p = pb.start();
//
//            // Preparar los flujos de entrada y salida
//            OutputStream os = p.getOutputStream();
//            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
//            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
//
//            // Leer la salida del proceso (pregunta por el primer número)
//            String line = br.readLine();
//            System.out.println(line); // Mostrar la línea que pide el primer número
//
//            // Leer el primer número desde la entrada del usuario
//            String num1 = userInput.readLine();
//            os.write((num1 + "\n").getBytes());
//            os.flush(); // Asegurarse de que se envía la entrada
//
//            // Leer la salida del proceso (pregunta por el segundo número)
//            line = br.readLine();
//            System.out.println(line); // Mostrar la línea que pide el segundo número
//
//            // Leer el segundo número desde la entrada del usuario
//            String num2 = userInput.readLine();
//            os.write((num2 + "\n").getBytes());
//            os.flush(); // Asegurarse de que se envía la entrada
//
//            // Leer la salida final del programa
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            // Esperar a que el proceso termine
//            p.waitFor();
//
//        } catch (IOException | InterruptedException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//}
