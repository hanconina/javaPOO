package poo.uml.clase;
public class Auto {
    /***************** ATRIBUTOS ******************/
    private String numSerie;
    private String marca;
    private float precio;
    /***************** MËTODOS ******************/
    public Auto(String numSerie, String marca, float precio){
        this.numSerie = numSerie;
        this.marca = marca;
        this.precio = precio;
    }
    
    public void incrementoPrecio(float incremento) {
        precio = precio+incremento;
    }
    public String verDatos(){
        return "Serie: "+numSerie+" Marca: "+marca+" Precio: "+precio;
    }
    public String accesarNumSerie(){
        return numSerie;
    }
}
