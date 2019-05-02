package poo.uml.unidireccionalUnoVarios;

public class AppMascotas {
    public static void main(String args[]){
        // Crear tres mascotas
        Perro mascota1 = new Perro("Tarzan","Pequinez");
        Perro mascota2 = new Perro("Boby","Pastor");
        Perro mascota3 = new Perro("Preince","Chacu");
        
        // Crear una persona
        Persona persona = new Persona("Juan");
        persona.adicionarMascota(mascota1);
        persona.adicionarMascota(mascota2);
        persona.adicionarMascota(mascota3);
        
        System.out.println("Mostrar Persona: ");
        persona.mostrarPersona();
        System.out.println("Mostrar Mascotas: ");
        persona.mostrarMascotas();
    }
    
}
