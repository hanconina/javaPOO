package evaluaciones.practicacalificada1;

public class CuentaMancomunada extends Cuenta {

    private int dniCoPropietario;

    public CuentaMancomunada() {
    }

    public CuentaMancomunada(int nroCuenta, int dni, int dniCoPropietario, double saldo) {
        super(nroCuenta, dni, saldo);
        this.dniCoPropietario = dniCoPropietario;
    }

    @Override
    public void retirar(double monto) {
        if (monto >= 0 && ((monto+monto*0.02) < saldo)) {
            saldo = saldo - monto-monto*0.02;
            comision = comision + monto*0.02;
            System.out.println("Retiro con éxito...");
        } else {
            System.out.println("No se realizo el retiro...");;
        }
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("DNI del Co-Propietario: "+dniCoPropietario);
    }
}