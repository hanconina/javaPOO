package poo.practica1;

public abstract class Cuenta {
    private int nroCuenta;
    private int dni;
    protected double saldo;
    protected double comision; 

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
    public abstract void retirar(double monto);
    
    public void imprimirDatos(){
        System.out.println("Nro. de Cuenta: "+nroCuenta);
        System.out.println("DNI cliente: "+dni);
        System.out.println("Saldo: "+saldo);
        System.out.println("Comisiones: "+comision);
    }
    
    
    
}
