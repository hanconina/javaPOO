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
        Persona p1 = new Empleado(1,"Juan",1200.00);
        Persona p2 = new Estudiante(2,"Luis","IS");
        Persona p3 = new Persona(3,"Ana");
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);        
        imprimirPersonasExtendida(personas);
        
        // Referencia a Objetos
        Persona oPersona1 = new Persona(46898990,"Ana");
        Persona oPersona2 = new Persona(46898990,"Ana");
        if (oPersona1 == oPersona2){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        
    }
}
