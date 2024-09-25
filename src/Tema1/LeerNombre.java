package Tema1;

import java.io.IOException;

public class LeerNombre {

    public static void main(String[] args) throws IOException {
        System.out.println(args.toString());
        if (args.length > 0) {
            System.out.println(args);
            System.exit(1);
        } else {
            System.err.println("Se necesita un programa a ejecutar");
            System.exit(-1);
        }
    }
}
