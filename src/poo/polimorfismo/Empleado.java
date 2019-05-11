package poo.polimorfismo;
public class Empleado extends Persona {
    private double sueldoBase;
    public Empleado() {
    }
    public Empleado(String nombres, double sueldoBase) {
        super(nombres);
        this.sueldoBase = sueldoBase;
    }
    public double recuperarSueldoBase(){
        return this.sueldoBase;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Sueldo Base: "+sueldoBase);
    }    
}
