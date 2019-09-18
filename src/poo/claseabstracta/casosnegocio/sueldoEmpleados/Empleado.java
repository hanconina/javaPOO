package poo.claseabstracta.casosnegocio.sueldoEmpleados;

public abstract class Empleado {
    protected String tipo;
    protected String nombres;
    protected String direccion;
    protected double sueldoBasico;

    public Empleado(String tipo, String nombres, String direccion, double sueldoBasico) {
        this.tipo = tipo;
        this.nombres = nombres;
        this.direccion = direccion;
        this.sueldoBasico = sueldoBasico;
    }
    
    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return "Empleado{" + "tipo=" + tipo + ", nombres=" + nombres + ", direccion=" + direccion + ", sueldoBasico=" + sueldoBasico + '}';
    }
    
    
}
