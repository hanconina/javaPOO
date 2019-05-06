package poo.claseabstracta;

public class Cuadrado extends Forma {
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }
        
    
}
