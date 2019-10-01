package evaluaciones.practicacalificada1.sem20192;
import java.util.Scanner;
public abstract class Empleado {

    private String nombres;
    private int DNI;
    private String direccion;
    private int antiguedad;
    private String telefonoContacto;
    private double salario;
    // CONSTRUCTORES

    public Empleado() {
        this.nombres = "";
        this.DNI = 0;
        this.direccion = "";
        this.antiguedad = 0;
        this.telefonoContacto = "";
        this.salario = 0;
    }

    public Empleado(String nombres, int DNI, String direccion, int antiguedad, String telefonoContacto, double salario) {
        this.nombres = nombres;
        this.DNI = DNI;
        this.direccion = direccion;
        this.antiguedad = antiguedad;
        this.telefonoContacto = telefonoContacto;
        this.salario = salario;
    }
    // ACCESADORES Y MODIFICADORES

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    // OTROS METODOS
    public void imprimir(){
        System.out.println("Nombres: " + nombres);
        System.out.println("DNI: " + DNI);
        System.out.println("Direccion: " + direccion);
        System.out.println("Antiguedad: " + antiguedad);
        System.out.println("Telefono Contacto: " + telefonoContacto);
        System.out.println("Salario: " + salario);
    }

    public abstract void incrementarSalario();
    public void leer(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese Nombres: ");
        this.nombres = entrada.nextLine();
        System.out.print("Ingrese DNI: ");
        this.DNI = Integer.valueOf(entrada.nextLine());
        System.out.print("Ingrese Direccion: ");
        this.direccion = entrada.nextLine();
        System.out.print("Ingrese Antiguedad: ");
        this.antiguedad = Integer.valueOf(entrada.nextLine());
        System.out.print("Ingrese TelefonoContacto: ");
        this.telefonoContacto = entrada.nextLine();
        System.out.print("Ingrese Salario: ");
        this.salario = Double.valueOf(entrada.nextLine());
    }
}
