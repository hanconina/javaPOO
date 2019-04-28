package flujos;
import java.util.Scanner;
public class E05Switch01 {
    public static void main(String[] args){
        // Dado el número de mes indicar su cantidad de días
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de mes: ");
        int mes = entrada.nextInt();
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 días");
                break;
            case 2:
                System.out.println("El mes tiene 28 o 29 días");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 días");
                break;
            default:
                System.out.println("El número de mes no es válido...");
                break;
        }
    }    
}
