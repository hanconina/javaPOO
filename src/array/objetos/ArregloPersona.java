package array.objetos;
import java.util.Scanner;

public class ArregloPersona {
    private static int n = 5;
    private static int num_persona = 0;
    private static Persona[] listaPersonas = new Persona[n]; 
    private static Scanner entrada = new Scanner(System.in);

    public static void mostrarPersonas(){
        System.out.println("Mostrar lista de personas");
        for (int i =0;i<listaPersonas.length;i++){
            if (listaPersonas[i] != null){
                System.out.println("Persona["+i+"]: ");
                listaPersonas[i].escribir();                
            }
        }
    }
    public static void adicionarPersona(){
        if (num_persona < n){
            System.out.println("Ingresar datos de Persona["+num_persona+"]");
            System.out.print("Ingresar el DNI: ");
            int dni = entrada.nextInt();
            System.out.print("Ingresar los nombres: ");
            String nombres = entrada.next();
            Persona persona = new Persona(dni,nombres);
            listaPersonas[num_persona] = persona;
            num_persona++;
        }else{
            System.out.println("La lista esta llena");
        }
    }
    public static int menu(){
        System.out.println("=======MENU===========");
        System.out.println("1.- Añadir una Persona");
        System.out.println("2.- Mostrar Personas");
        System.out.println("3.- Salir");
        int opcion;
        System.out.print("Elija una Opción: ");
        opcion = entrada.nextInt();
        return opcion;
    }
    public static void main(String[] args){
        boolean terminado = false;
        do {
            switch (menu()){
                case 1:
                    adicionarPersona();
                    break;
                case 2:
                    mostrarPersonas();
                    break;
                case 3:
                    terminado = true;
                    break;
            }
        } while (!terminado);    
    }  
}
