package poo.polimorfismo;

public class Persona {
    // ATRIBUTOS
    private String nombres;
    // METODOS
    public Persona() {
        nombres = "";        
    }
    public Persona(String nombres) {
        this.nombres = nombres;
    }
    public void imprimirDatos(){
        System.out.println("Nombres: "+nombres);
    }
}
