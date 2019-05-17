package poo.interfaces;
public class Circulo implements IFigura {
    // ATRIBUTOS
    private double radio;
    // METODOS
    public Circulo(double radio){
        this.radio = radio;
    }
    public double area(){
        return Math.PI*radio*radio;
    }    
}