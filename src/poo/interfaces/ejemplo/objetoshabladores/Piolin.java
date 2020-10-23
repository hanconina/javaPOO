package poo.interfaces.ejemplo.objetoshabladores;

public class Piolin extends Canario implements Hablador{
    private int nPeliculas;

    public Piolin(int nPeliculas, String canta, String sexo, int edad) {
        super(canta, sexo, edad);
        this.nPeliculas = nPeliculas;
    }

    @Override
    public void hablar() {
        System.out.println("Soy Piolin y se hablar: ");
    }
    
    public String mostrar(){
        return super.mostrar()+"\n"+
                "nPeliculas: "+nPeliculas;
    }
    
}
