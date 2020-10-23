package array.casoalmacen;

import java.util.Scanner;

public class ControlAlmacen {

    private int[][] tabla;
    private int[] totalAlmacenes;
    private int[] totalTipoProductos;
    private int numAlmacenes;
    private int numTipoProductos;

    public ControlAlmacen() {
        tabla = new int[20][15];
        totalAlmacenes = new int[20];
        totalTipoProductos = new int[15];
        numAlmacenes = 0;
        numTipoProductos = 0;
    }

    public void leerDatosTipos() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero de Almacenes: ");
        numAlmacenes = entrada.nextInt();
        System.out.print("Numero de Tipos de Productos: ");
        numTipoProductos = entrada.nextInt();
    }

    public void leerTabla() {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < numAlmacenes; i++) {
            for (int j = 0; j < numTipoProductos; j++) {
                System.out.println("Almacen: " + i);
                System.out.println("Tipo Producto: " + j);
                System.out.print("Ingrese Cantidad de Productos: ");
                tabla[i][j] = entrada.nextInt();
            }
        }
    }

    public void reporteTotales() {
        for (int i = 0; i < numAlmacenes; i++) {
            int sum = 0;
            for (int j = 0; j < numTipoProductos; j++) {
                sum = sum + tabla[i][j];
            }
            totalAlmacenes[i] = sum;
        }
        for (int i = 0; i < numTipoProductos; i++) {
            int sum = 0;
            for (int j = 0; j < numAlmacenes; j++) {
                sum = sum + tabla[j][i];
            }
            totalTipoProductos[i] = sum;
        }

    }

    public void mostrar() {
        for (int i = 0; i < numAlmacenes; i++) {
            for (int j = 0; j < numTipoProductos; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void mostrarAlmacenes() {
        System.out.println("Mostrar Almacenes: ");
        for (int i = 0; i < numAlmacenes; i++) {
            System.out.print(totalAlmacenes[i] + "\t");
        }
        System.out.println();

    }

    public void mostrarTiposProductos() {
        System.out.println("Tipos de Productos: ");
        for (int i = 0; i < numTipoProductos; i++) {
            System.out.print(totalTipoProductos[i] + "\t");
        }
        System.out.println();
    }
}
