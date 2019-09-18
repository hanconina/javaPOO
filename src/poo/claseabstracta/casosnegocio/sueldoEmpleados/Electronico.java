
package poo.claseabstracta.casosnegocio.sueldoEmpleados;

public class Electronico extends Empleado{
    protected int antiguedad;

    public Electronico(int antiguedad, String tipo, String nombres, String direccion, double sueldoBasico) {
        super(tipo, nombres, direccion, sueldoBasico);
        this.antiguedad = antiguedad;
    }

    @Override
    public double calcularSueldo() {
        double sueldo=0;
        if (antiguedad>=0 && antiguedad<3) sueldo= sueldoBasico+sueldoBasico*0.005;
        if (antiguedad>=3 && antiguedad<5) sueldo= sueldoBasico+sueldoBasico*0.5;
        if (antiguedad>=5 && antiguedad<7) sueldo= sueldoBasico+sueldoBasico*0.7;
        if (antiguedad>=7) sueldo= sueldoBasico+sueldoBasico*0.11;
        return sueldo;
    }

    
    
    
    
}
