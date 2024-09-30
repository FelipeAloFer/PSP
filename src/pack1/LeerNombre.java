package pack1;

import java.io.IOException;

public class LeerNombre {

    public static void main(String[] args) throws IOException {
        if (args.length <= 0) {
            System.err.println("Se necesita un argumento");
            System.exit(1);
        } else {
            System.out.println(args[0]);
            System.exit(0);
        }
    }
}

