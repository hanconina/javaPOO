package poo.interfaces.ejemplo.objetoshabladores;

public class Alumno extends Persona implements Hablador{
    private String carrera;
    private String curso;

    public Alumno(String carrera, String curso, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.curso = curso;
    }

    @Override
    public void hablar() {
        System.out.println("Hola son la Clase Alumno y se Hablar");
    }

    @Override
    public String mostrar() {
        return super.mostrar()+"\n"+
                "Carrera: "+carrera+"\n"+
                "Curso: "+curso;
    }
    
    
}
