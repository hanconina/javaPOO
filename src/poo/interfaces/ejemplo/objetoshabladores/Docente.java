package poo.interfaces.ejemplo.objetoshabladores;

public class Docente extends Persona implements Hablador{
    private String despacho;
    private String email;

    public Docente(String despacho, String email, String nombre, int edad) {
        super(nombre, edad);
        this.despacho = despacho;
        this.email = email;
    }
    
    @Override
    public void hablar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String mostrar() {
        return super.mostrar()+ "\n"+
                "Despacho=" + despacho + "\n"+
                "Email; "+ email;
    }
    
    
}
