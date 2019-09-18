
package poo.claseabstracta.casosnegocio.sueldoEmpleados;

public class Programador extends Empleado{
    private String especialidad;     
    private int profesion;

    public Programador(String especialidad, int profesion, String tipo, String nombres, String direccion, double sueldoBasico) {
        super(tipo, nombres, direccion, sueldoBasico);
        this.especialidad = especialidad;
        this.profesion = profesion;
    }

    @Override
    public double calcularSueldo() {
        double sueldo=0;
        if (profesion==0) sueldo = sueldoBasico+50;  
        if (profesion==1) sueldo = sueldoBasico+100;  
        if (profesion==2) sueldo = sueldoBasico+250;  
        if (profesion==3) sueldo = sueldoBasico+500;
        return sueldo;
    }
   
}
