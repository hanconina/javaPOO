
package poo.practica1;

public class CuentaSueldo extends Cuenta{
    private String empresa;

    public CuentaSueldo() {
    }

    public CuentaSueldo(int nroCuenta, int dni, double saldo, String empresa) {
        super(nroCuenta, dni, saldo);
        this.empresa = empresa;
    }
    @Override
    public void retirar(double monto) {
        if (saldo > 2000)
        {
            if (monto > 0 && (monto + monto*0.01) < saldo){
                saldo = saldo - monto - 0.01*monto; 
                comision = comision + monto*0.01;
                System.out.println("Retiro con exito...");
            }
            else{
                System.out.println("Problemas al retirar");
            }
        }
        else
        {
            if (monto > 0 && monto < saldo){
                saldo = saldo - monto;
                System.out.println("Retiro con exito...");
            }
            else {
                System.out.println("No es posibre retirar");
            }
        }
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Empresa del cliente: "+empresa);
    }
    
    
}
