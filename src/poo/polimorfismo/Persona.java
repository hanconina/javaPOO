package poo.polimorfismo;

public class Persona {
    // ATRIBUTOS
    private String nombres;
    private int dni;
    // METODOS
    public Persona() {
        dni = 0;
        nombres = "";        
    }
    public Persona(int dni, String nombres) {
        this.nombres = nombres;
        this.dni = dni;
    }
    public void imprimirDatos(){
        System.out.println("DNI: "+dni);
        System.out.println("Nombres: "+nombres);
    }
}
