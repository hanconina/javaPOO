package poo.herencia.claseabstracta;

public class Circulo extends Forma{

    private double r;
    
    public Circulo(String nombre, double r) {
        super(nombre);
        this.r = r;
    }


    @Override
    public double area() {
        return Math.PI*r*r;
    }
    
    
}
