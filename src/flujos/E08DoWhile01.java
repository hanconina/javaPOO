package flujos;

import java.util.Scanner;

public class E08DoWhile01 {

    public static void main(String[] args) {
        // Cálcular el mayor de n números
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese n: ");
        int n = entrada.nextInt();
        int mayor = 0;
        int i = 0;
        do {
            i++;
            System.out.println("Ingrese un número: ");
            int numero = entrada.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
        } while (i<n);
        System.out.println("El mayor de n números es: " + mayor);
    }
}
