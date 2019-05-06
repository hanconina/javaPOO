
package poo.herencia.claseabstracta;

public class Rectangulo extends Forma{
    private double lado1;
    private double lado2;

    public Rectangulo(String nombre, double lado1, double lado2) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    @Override
    public double area(){
        return lado1*lado2;        
    }
    
}
