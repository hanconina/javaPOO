package poo.interfaces.ejemplo.electrodomesticos;

public class Lavadora extends Aparato{
    private float alto;
    private float ancho;

    public Lavadora(float alto, float ancho, String marca, float precio) {
        super(marca, precio);
        this.alto = alto;
        this.ancho = ancho;
    }
    public String mostrar(){
        String msg = super.mostrar()+"\n"+
                "Alto: "+alto+"\n"+
                "Ancho: "+ancho;
        return msg;
    }
    
}
