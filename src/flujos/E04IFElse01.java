package flujos;
public class E04IFElse01 {
    public static void main(String[] args){
        // Dado dos números indicar cual es el mayor
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int a = entrada.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b = entrada.nextInt();
        if (a>b)
            System.out.println("El mayor es: "+a);
        else
            System.out.println("El mayor es: "+b);
    }    
}
