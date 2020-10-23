package poo.interfaces.ejemplo.objetoshabladores;

public class Ave {
    protected String sexo;
    protected int edad;

    public Ave(String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }
    
    public String mostrar(){
        return "Sexo: "+sexo+"\n"+
                "Edad: "+edad;
    }
    
}
