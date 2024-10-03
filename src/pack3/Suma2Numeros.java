package pack3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Suma2Numeros {
    public static void main(String[] args) {
        int num1, num2;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Introduzca el primer numero: ");
            num1 = Integer.valueOf(br.readLine());
            System.out.println("Introduzca el segundo numero: ");
            num2 = Integer.valueOf(br.readLine());
            System.out.println("La suma es: " + (num1 + num2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
