package poo.claseabstracta.casosnegocio.sueldoEmpleados;


public class Administrativo extends Empleado{
    private String cargo;

    public Administrativo(String cargo, String tipo, String nombres, String direccion, double sueldoBasico) {
        super(tipo, nombres, direccion, sueldoBasico);
        this.cargo = cargo;
    }

    @Override
    public double calcularSueldo() {
        double sueldo=0;
        if (cargo.equals("secretaria")) sueldo = sueldoBasico+ 30;       
        if (cargo.equals("jefe")) sueldo = sueldoBasico+ sueldoBasico*0.05+150;       
        if (cargo.equals("gerente")) sueldo = sueldoBasico+ sueldoBasico*0.1+300;
        return sueldo;
    }   
}
