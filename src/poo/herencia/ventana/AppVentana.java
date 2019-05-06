
package poo.herencia.ventana;

public class AppVentana {
    public static void main(String[] args){
        VentanaTitulo ventana = new VentanaTitulo("Word", 10,10,200,300);
        System.out.println("Ventana Actual");
        ventana.mostrar();
        System.out.println("Modificar Ventana y Mostrar");
        ventana.cambiarDimensiones(300, 400);
        ventana.desplazar(2, 2);
        ventana.mostrar();
    }
    
}
