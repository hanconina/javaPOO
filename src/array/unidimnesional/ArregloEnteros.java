package array.unidimnesional;

import java.util.Scanner;

public class ArregloEnteros {
    private static int n = 5;
    private static int[] arreglo = new int[n]; 
    private static Scanner entrada = new Scanner(System.in);

    public static void escribirArreglo(){
        System.out.println("Mostrar los elementos del Arreglo");
        for (int i =0;i<arreglo.length;i++){
            System.out.println("Item[]: "+arreglo[i]);
        }
    }
    public static void leerArreglo(){
        int i = 0;
        System.out.println("Leer elementos del Arreglo");
        do{
            System.out.print("Ingrese el item[]:");
            arreglo[i]=entrada.nextInt();
            i++;
        } while (i<n);
    }
    public static int menu(){
        System.out.println("=======MENU===========");
        System.out.println("1.- Leer los elementos de un arreglo");
        System.out.println("2.- Mostrar los elementos de un arreglo");
        System.out.println("3.- Recuperar un elemento del arreglo");
        System.out.println("4.- Salir");
        int opcion;
        System.out.print("Elija una Opción: ");
        opcion = entrada.nextInt();
        return opcion;
    }
    public static void recuperarElemento(){
        System.out.print("Ingrese la ubicación del item: ");
        int index = entrada.nextInt();
        System.out.println("El item en la ubicacion es: "+arreglo[index]);
    }
    public static void main(String[] args){
        boolean terminado = false;
        do {
            switch (menu()){
                case 1:
                    leerArreglo();
                    break;
                case 2:
                    escribirArreglo();
                    break;
                case 3:
                    recuperarElemento();
                    break;
                case 4:
                    terminado = true;
                    break;
            }
        } while (!terminado);    
    }  
}
