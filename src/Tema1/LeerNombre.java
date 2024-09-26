package Tema1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class LeerNombre {
    public static void main(String[] args) throws IOException {
        if (args.length <= 0) {
            System.err.println("Se necesita un argumento");
            System.exit(1);
        } else {
            System.out.println(Arrays.toString(args));
            System.exit(0);
        }
    }
}

