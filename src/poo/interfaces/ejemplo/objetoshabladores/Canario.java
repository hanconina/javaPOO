package poo.interfaces.ejemplo.objetoshabladores;

public class Canario extends Ave{
    private String canta;

    public Canario(String canta, String sexo, int edad) {
        super(sexo, edad);
        this.canta = canta;
    }
    public String mostrar(){
        return super.mostrar()+"\n"+
                "Canta: "+canta;
    }
    
}
