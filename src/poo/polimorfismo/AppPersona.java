
package poo.polimorfismo;

import java.util.LinkedList;

public class AppPersona {
    public static void imprimirPersonasExtendida(LinkedList<Persona> personas){
        int i = 1;
        for (Persona persona : personas){
            System.out.println("Persona: "+i);
            persona.imprimirDatos();
            i++;
        }       
    }

    public static void main(String[] args){
        // Upcasting - Conversión hacia arriba
        // Caso 1
        // Persona p;
        // Empleado e = new Empleado(29898922,"Hernan",1500.00);
        // p = e;
        // p.imprimirDatos();
        // Caso 2
        // Persona p1 = new Empleado(29895555,"Juan",1200.00);
        // p1.imprimirDatos();
        // Caso 3: p1 no puede acceder a los métodos de Empleado
        // System.out.println(p1.recuperarSaldo());
        System.out.println("Prueba de Polimorfismo.");
        LinkedList<Persona> personas = new LinkedList<Persona>();
        Empleado e1 = new Empleado(2,"Juan",1200.00);
        Consultor c1 = new Consultor(3,"Luis","12","Capacitacion");
        Persona p2 = new Persona(4,"Ana");
        personas.add(e1);
        personas.add(c1);
        personas.add(p2);
        
        imprimirPersonasExtendida(personas);
    }
    
}
