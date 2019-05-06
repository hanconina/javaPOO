package poo.polimorfismo;

public class Persona {
    // ATRIBUTOS
    private int dni;
    private String nombres;
    // METODOS

    public Persona() {
        
    }

    public Persona(int dni, String nombres) {
        this.dni = dni;
        this.nombres = nombres;
    }
    public void imprimirDatos(){
        System.out.println("DNI: "+dni);
        System.out.println("Nombres: "+nombres);
    }
    
}
