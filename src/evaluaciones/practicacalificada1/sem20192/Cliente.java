package evaluaciones.practicacalificada1.sem20192;

import java.util.Scanner;

public class Cliente {

    private int DNI;
    private String nombres;
    private String direccion;
    private String telefono;

    public Cliente() {
        this.DNI = 0;
        this.nombres = "";
        this.direccion = "";
        this.telefono = "";
    }

    public Cliente(int DNI, String nombres, String direccion, String telefono) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "DNI=" + DNI + ", nombres=" + nombres + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    public void Leer() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese datos del Cliente: ");
        System.out.print("DNI: ");
        this.DNI = Integer.valueOf(entrada.nextLine());
        System.out.print("Nombres: ");
        this.nombres = entrada.nextLine();
        System.out.print("Direccion: ");
        this.direccion = entrada.nextLine();
        System.out.print("Telefono: ");
        this.telefono = entrada.nextLine();
    }

}
