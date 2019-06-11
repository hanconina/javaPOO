package array.objetos;

public class Persona {
    private int dni;
    private String nombres;

    public Persona() {
        dni = 0;
        nombres = "";
    }

    public Persona(int dni, String nombres) {
        this.dni = dni;
        this.nombres = nombres;
    }
        
    public void escribir(){
        System.out.println("DNI: "+dni);
        System.out.println("Nombres: "+nombres);
    }
}
