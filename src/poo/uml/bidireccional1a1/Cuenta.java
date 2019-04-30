package poo.uml.bidireccional1a1;

import poo.uml.bidireccional1a1.Cliente;

public class Cuenta {
    /**
     * ************ ATRIBUTOS *********************
     */
    private int numeroCuenta;
    private float saldo;
    private Cliente propietario;
    /**
     * ************ MËTODOS *********************
     */   
    public Cuenta() {
        this.numeroCuenta = 0;
        this.saldo=0.0f;
        this.propietario = new Cliente();
    }
    public Cuenta(int numeroCuenta, float saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }
    public void verDatosCuenta(){
        System.out.println("Numero: "+numeroCuenta + " Saldo: "+saldo);
    }
    public void verPropietario(){
        this.propietario.verDatosCliente();
    }
}
