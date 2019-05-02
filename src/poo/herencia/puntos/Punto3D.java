package poo.herencia.puntos;

public class Punto3D extends Punto {

    // Atributos
    private double z;

    // Métodos
    public Punto3D() {
        super();
        z = 0.0;
    }
    public Punto3D(double x, double y, double z){
        super(x,y);
        this.z = z;
    }
    @Override
    public double distanciaAlOrigen(){
        return Math.sqrt(x*x+y*y+z*z);
    }
    @Override
    public String toString(){
        return "(x,y,z) = "+"("+x+","+y+","+z+")"; 
    }

}
