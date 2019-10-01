package evaluaciones.practicacalificada1.sem20192;

import java.util.Scanner;

public class Secretaria extends Empleado {

    private String despacho;
    private String fax;

    // CONSTRUCTORES
    public Secretaria() {
        super();
        this.despacho = "";
        this.fax = "";
    }

    public Secretaria(String despacho, String fax, String nombres, int DNI, String direccion, int antiguedad, String telefonoContacto, double salario) {
        super(nombres, DNI, direccion, antiguedad, telefonoContacto, salario);
        this.despacho = despacho;
        this.fax = fax;
    }
    // ACCESADORES Y MODIFICADORES

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    // Otros métodos

    @Override
    public void imprimir() {
        System.out.println("Secretario: ");
        super.imprimir();
        System.out.println("Despacho: " + despacho);
        System.out.println("Fax: " + fax);
    }

    @Override
    public void incrementarSalario() {
        super.setSalario(super.getSalario() + (1 + (0.05 / 12)));
    }

    @Override
    public void leer() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese información de Secretaria: ");
        super.leer();
        System.out.print("Despacho: ");
        this.despacho = entrada.nextLine();
        System.out.print("Fax: ");
        this.fax = entrada.nextLine();
    }
}
