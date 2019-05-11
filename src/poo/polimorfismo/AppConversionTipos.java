
package poo.polimorfismo;

import java.util.LinkedList;
public class AppConversionTipos {
    public static void main(String[] args){
         // Upcasting - Conversión hacia arriba
         Persona p;
         Empleado e = new Empleado("Hernan",1500.00);
         p = e;
         p.imprimirDatos();
         // una superclase no puede acceder a otros métodos de la subclase
         // System.out.println(p1.recuperarSaldo()); // ERROR
         // Downcasting
         Persona p1 = new Empleado("Juan",1200.00);
         Empleado e1;
         e1 = (Empleado) p1;
                  
        // No es posible hacer casteo entre subclases
         Persona p2 = new Estudiante("Ana","IS");
         Empleado e2 = (Empleado) p2; // ERROR in runtime cannot be cast to
    }
    
}
