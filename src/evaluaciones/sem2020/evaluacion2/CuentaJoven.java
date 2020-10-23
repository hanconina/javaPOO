package evaluaciones.sem2020.evaluacion2;


import evaluaciones.sem2020.evaluacion2.Cuenta;

public class CuentaJoven extends Cuenta{
    private Fecha fechaNacimiento;

    public CuentaJoven(Fecha fechaNacimiento, 
            String titular, double interesAnual, double saldo) {
        super(titular, interesAnual, saldo);
        this.fechaNacimiento = fechaNacimiento;
    }
    

    @Override
    public void abonoInteresMensual() {
        if (saldo>10000){
            saldo = saldo*(1+interesAnual/12/100); 
        }
    }
    @Override
    public String mostrar(){
        return super.mostrar() + "\n"+
                "Fecha Nacimiento: "+fechaNacimiento.mostrar()+"\n"+
                "Edad: "+fechaNacimiento.calcularEdad();
    }
    
}
