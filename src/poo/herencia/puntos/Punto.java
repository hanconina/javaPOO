package poo.herencia.puntos;

public class Punto {

    // Atributos
    /*
    * Si declaramos la visibilidad de los atributos con private
    * las clases hijas o sub clases no podran acceder a dichos atributos
    */
    protected double x;  
    protected double y;
    // Métodos

    public Punto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distanciaAlOrigen(){
        return Math.sqrt(x*x+y*y);
    }  
        
    @Override
    public String toString(){
        return "(x,y) = "+"("+x+","+y+")";
    }

}
