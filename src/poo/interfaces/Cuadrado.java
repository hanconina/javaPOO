package poo.interfaces;
public class Cuadrado implements IFigura{
    private double lado;
    public Cuadrado(double lado){
        this.lado = lado;
    }
    public double area(){
        return lado*lado;
    }
}