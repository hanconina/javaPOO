package poo.claseabstracta.casosnegocio.club;

public abstract class Persona {
    protected int DNI;
    protected String nombres;
    protected String medioPago;
    protected double totalConsumo;
    
    public Persona(int DNI, String nombres, String medioPago, double totalConsumo){
        this.DNI = DNI;
        this.nombres = nombres;
        this.medioPago = medioPago;
        this.totalConsumo = totalConsumo;
    }
    
    public abstract double calcularPago();
    
    public abstract String getInfo();
    
}
