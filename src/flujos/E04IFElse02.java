package flujos;
import java.util.Scanner;
public class E04IFElse02 {
    public static void main(String[] args){
        // Dado el número de mes indicar su cantidad de días
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número de mes: ");
        int mes = entrada.nextInt();
        if (mes==1 || mes==3 || mes==5 || mes==7 || 
                mes==8 || mes==10 || mes==12){
            System.out.println("El mes tiene 31 días");
        }
        else if (mes==2){
            System.out.println("El mes tiene 28 o 29 días");
        }
        else if (mes==4 || mes==6 || mes==9 || mes==11){
            System.out.println("El mes tiene 30 días");
        }else
        {
            System.out.println("Número de mes invalido...");
        }
    }    
}
