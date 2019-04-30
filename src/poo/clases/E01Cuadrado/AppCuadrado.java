package poo.clases.E01Cuadrado;

/**
 * Utiliza la clase Cuadrado
 *
 * @author Hernán
 */
public class AppCuadrado {

    public static void main(String[] args) {
        // Declarar dos variables de tipo Cuadrado
        CCuadrado c1;
        CCuadrado c2;

        // Inicializar los cuadrados haciendo uso de sus constructores
        c1 = new CCuadrado();
        c2 = new CCuadrado(3.0d);
        // Mostrar el valor de los lados de cada cuadrado
        System.out.println("El lado de c1 es: " + c1.obtenerLado());
        System.out.println("El lado de c2 es: " + c2.obtenerLado());
        System.out.println();
        // Cambiar el valor del lado de c1 y mostrarlo
        c1.modificarLado(5.0d);
        System.out.println("Cambiando el lado de c1...");
        System.out.println("El lado de c1 es: " + c1.obtenerLado());
        System.out.println();
        // Mostrar el area de c1 y el perimetro de c2
        System.out.println("El area de c1 es: " + c1.area());
        System.out.println("El perímetro de c2 es: " + c2.perimetro());
        // Copiando un Cuadrado;
        CCuadrado c3;
        c3 = c1;
        System.out.println("Lado c3 = " + c3.obtenerLado());
        System.out.println("Perímetro c3 = " + c3.perimetro());
        System.out.println("Area c3= " + c3.area());
    }

}
