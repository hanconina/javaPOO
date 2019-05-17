package evaluaciones.parcial1;

public class Autor {
    private String nombres;
    private String lugarNacimiento;

    public Autor() {
        nombres = "";
        lugarNacimiento = "";
    }

    public Autor(String nombres, String lugarNacimiento) {
        this.nombres = nombres;
        this.lugarNacimiento = lugarNacimiento;
    }
    
    public void mostrarAutor(){
        System.out.println("Autor: "+nombres);
        System.out.println("Lugar Nacimiento: "+lugarNacimiento);
    }
       
}
