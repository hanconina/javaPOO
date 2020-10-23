package poo.interfaces.ejemplo.objetoshabladores;

public class Loro extends Ave implements Hablador{
    private String region;
    private String color;

    public Loro(String region, String color, String sexo, int edad) {
        super(sexo, edad);
        this.region = region;
        this.color = color;
    }

    @Override
    public void hablar() {
        System.out.println("Soy un Loro y se hablar");
    }
    public String mostrar(){
        return super.mostrar()+"\n"+
                "Region: "+region+
                "Color: "+color;
    }
    
    
    
}
