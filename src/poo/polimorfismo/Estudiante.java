package poo.polimorfismo;
public class Estudiante extends Persona {
    private String carrera;
    public Estudiante() {
        super();
        carrera = "";
    }
    public Estudiante(String nombres, String carrera) {
        super(nombres);
        this.carrera = carrera;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Carrera Profesional: "+carrera);
    }
}
