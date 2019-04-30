package poo.uml.bidireccional1a1;

public class Cliente {

    /**
     * ************ ATRIBUTOS *********************
     */
    private int dni;
    private String nombres;
    private Cuenta cuenta;

    /**
     * ************ MÉTODOS *********************
     */
    public Cliente() {
        dni = 0;
        nombres = "";
        cuenta = new Cuenta();
    }
    public Cliente(int dni, String nombres, Cuenta cuenta) {
        this.dni = dni;
        this.nombres = nombres;
        this.cuenta = cuenta;
    }
    public void cambiarCuenta(Cuenta cuenta){
        this.cuenta = cuenta;
    }
    public void verDatosCliente(){
        System.out.println("DNI: "+dni+" Nombres: "+nombres);
    }
    public void verCuentaBancaria(){
        cuenta.verDatosCuenta();
    }
}
