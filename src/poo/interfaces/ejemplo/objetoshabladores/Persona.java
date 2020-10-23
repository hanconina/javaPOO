package poo.interfaces.ejemplo.objetoshabladores;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String mostrar() {
        return "Nombre: "+nombre+"\n"+
               "Edad: "+edad;
    }
    
    
}
