package poo.interfaces.ejemplo.electrodomesticos;
public class Radio extends Aparato implements Hablador{
    private boolean casette;
    private int potencia;
    
    public Radio(boolean casette, int potencia, String marca, float precio){
        super(marca,precio);
        this.casette = casette;
        this.potencia = potencia;
    }
    
    public void hablar(){
        System.out.println("Hola, soy una Radio y sé hablar");
    }
    public String mostrar(){
        String msg=super.mostrar()+"\n"+
                "Casette: "+casette + "\n"+
                "Potencia: "+potencia;
        return msg;
    }
    
}
