package evaluaciones.practicacalificada1;

public abstract class Cuenta {
    // METODOS
    public Cuenta() {
    }
    public Cuenta(int nroCuenta, int dni, double saldo) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.comision = 0;
    }
    public double recuperarSaldo() {
        return saldo;
    }
    public int recuperarNroCuenta() {
        return nroCuenta;
    }
    public void depositar(double monto){
        if (monto > 0){
            this.saldo = this.saldo+monto;
            System.out.println("Deposito con éxito...");
        }
        else
            System.out.println("No se realizo el deposito...");;
    }
    public void transferencia(Cuenta cuenta, double monto){
        if (monto < saldo){
            saldo = saldo - monto;
            cuenta.depositar(monto);
            System.out.println("Transferencia con éxito...");
        }else{
            System.out.println("No se realizo la transferencia...");
        }
    }
    public static void transferencia(Cuenta cuenta1, Cuenta cuenta2, double monto){
        if (monto > 0){
            cuenta1.transferencia(cuenta2, monto);
        }
    }
    public abstract void retirar(double monto);   
    public void imprimirDatos(){
        System.out.println("Nro. de Cuenta: "+nroCuenta);
        System.out.println("DNI cliente: "+dni);
        System.out.println("Saldo: "+saldo);
        System.out.println("Comisiones: "+comision);
    }
        // ATRIBUTOS
    private int nroCuenta;
    private int dni;
    protected double saldo;
    protected double comision;
}
