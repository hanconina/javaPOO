package evaluaciones.sem2020.evaluacion2;


import evaluaciones.sem2020.evaluacion2.Cuenta;

public class CuentaEmpresa extends Cuenta{
    private String ruc;
    private String tipoMoneda;

    public CuentaEmpresa(String ruc, String tipoMoneda, String titular, 
            double interesAnual, double saldo) {
        super(titular, interesAnual, saldo);
        this.ruc = ruc;
        this.tipoMoneda = tipoMoneda;
    }

    @Override
    public void abonoInteresMensual() {
        double saldoActual = saldo;
        if (tipoMoneda=="Dolares"){
            saldoActual = 3.45*saldoActual;
        }
        saldoActual = saldoActual*(1+interesAnual/12/100);        
    }
    @Override
    public String mostrar(){
        return super.mostrar() + "\n"+
                "Ruc: "+ruc+"\n"+
                "Tipo Moneda: "+tipoMoneda;
    }
    
    
}
