package poo.interfaces.ejemplo.electrodomesticos;

public class TV extends Aparato implements Hablador{
    private int pulgadas;
    private int antiguedad;

    public TV(int pulgadas, int antiguedad, String marca, float precio) {
        super(marca, precio);
        this.pulgadas = pulgadas;
        this.antiguedad = antiguedad;
    }
    
    @Override
    public void hablar() {
        System.out.println("Hola soy un TV y sé hablar");
    }
    
    public String mostrar(){
        String msg = super.mostrar()+"\n"+
                "Pulgadas: "+pulgadas+"\n"+
                "Antiguedad: "+antiguedad;
        return msg;
    }

    
    
}
