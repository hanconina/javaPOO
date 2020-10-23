package poo.interfaces.ejemplo.electrodomesticos;

public class Aparato {
    protected String marca;
    protected float precio;

    public Aparato(String marca, float precio) {
        this.marca = marca;
        this.precio = precio;
    }
    
    public String mostrar(){
        String msg = "Marca: "+marca+"\n"+
                "Precio: "+precio+"\n";
        return msg;
    }
    
}
