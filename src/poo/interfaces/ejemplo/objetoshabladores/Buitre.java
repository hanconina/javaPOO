package poo.interfaces.ejemplo.objetoshabladores;

public class Buitre extends Ave{
    private float velocidadVuelo;
    private float peso;

    public Buitre(float velocidadVuelo, float peso, String sexo, int edad) {
        super(sexo, edad);
        this.velocidadVuelo = velocidadVuelo;
        this.peso = peso;
    }
    
    public String mostrar(){
        return super.mostrar()+"\n"+
                "VelocidadVuelo: "+velocidadVuelo+ "\n"+
                "Peso: "+peso;
    }
}
