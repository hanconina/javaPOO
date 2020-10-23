package evaluaciones.sem2020.evaluacion2;

public abstract class Cuenta {
    protected String titular;
    protected double interesAnual;
    protected double saldo;
    // Atributo de clase
    private static int numCuentas=0;

    public Cuenta(String titular, double interesAnual, double saldo) {
        this.titular = titular;
        this.interesAnual = interesAnual;
        this.saldo = saldo;
        numCuentas++; // Incrementar el numero de cuentas
    }

    public String getTitular() {
        return titular;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }
    public abstract void abonoInteresMensual();
    public void depositar(double monto){
        if (monto>0){
            saldo = saldo+monto;
        }
    }
    public void retirar(double monto){
        if (saldo>=monto && monto>0){
            saldo = saldo - monto; // saldo-=monto;
        }
    }
    // Metodo de instancia
    public void transferir(Cuenta cuentaDestino, double monto){
        retirar(monto);
        cuentaDestino.depositar(monto);
    }
    // Metodo de clase
    public static void transferir(Cuenta cuentaOrigen, 
            Cuenta cuentaDestino, double monto){
        cuentaOrigen.retirar(monto);
        cuentaDestino.depositar(monto);
    }
    public String mostrar(){
        String msg = "Titular: "+titular+"\n"+
                "Interes Anual: "+interesAnual + "\n"+
                "Saldo: "+saldo;
        return msg;
    }    
    
    
}
