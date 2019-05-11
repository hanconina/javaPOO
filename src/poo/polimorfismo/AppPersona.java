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
        System.out.println("Prueba de Polimorfismo.");
        LinkedList<Persona> personas = new LinkedList<Persona>();
        Persona p1 = new Empleado("Juan",1200.00);
        Persona p2 = new Estudiante("Luis","IS");
        Persona p3 = new Persona("Ana");
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);        
        imprimirPersonasExtendida(personas);
    }
}
