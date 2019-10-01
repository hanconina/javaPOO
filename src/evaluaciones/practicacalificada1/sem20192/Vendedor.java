package evaluaciones.practicacalificada1.sem20192;

import java.util.LinkedList;
import java.util.Scanner;

public class Vendedor extends Empleado {

    private Auto auto;
    private String telefonoMovil;
    private String areaVentas;
    private LinkedList<Cliente> listaClientes;
    private double porcentajeComision;

    public Vendedor() {
        super();
        this.auto = null;
        this.telefonoMovil = "";
        this.areaVentas = "";
        this.listaClientes = null;
        this.porcentajeComision = 0;
    }

    public Vendedor(Auto auto, String telefonoMovil, String areaVentas, LinkedList<Cliente> listaClientes, double porcentajeComision, String nombres, int DNI, String direccion, int antiguedad, String telefonoContacto, double salario) {
        super(nombres, DNI, direccion, antiguedad, telefonoContacto, salario);
        this.auto = auto;
        this.telefonoMovil = telefonoMovil;
        this.areaVentas = areaVentas;
        this.listaClientes = listaClientes;
        this.porcentajeComision = porcentajeComision;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getAreaVentas() {
        return areaVentas;
    }

    public void setAreaVentas(String areaVentas) {
        this.areaVentas = areaVentas;
    }

    public LinkedList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(LinkedList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public void imprimir() {
        System.out.println("Vendedor: ");
        super.imprimir();
        System.out.println("Telefono Movil: " + telefonoMovil);
        System.out.println("Area de Ventas:" + areaVentas);
        System.out.println("Porcentaje de Comision: " + porcentajeComision);

        auto.imprimir();

        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println(listaClientes.get(i));
        }
    }

    @Override
    public void incrementarSalario() {
        super.setSalario(super.getSalario() + (1 + 0.1 / 12));
    }

    @Override
    public void leer() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese datos del Vendedor: ");
        super.leer();
        System.out.print("Telefono Movil: ");
        this.telefonoMovil = entrada.nextLine();
        System.out.print("Area de ventas: ");
        this.areaVentas = entrada.nextLine();
        System.out.print("Porcentaje de Comsion: ");
        this.porcentajeComision = Double.valueOf(entrada.nextLine());
        
        System.out.println("Auto asignado al vendedor: ");
        this.auto = new Auto();
        this.auto.leer();

        System.out.println("Lista de clientes: ");
        this.listaClientes = new LinkedList<Cliente>();
        String opcion = "S";
        do {
            Cliente oCliente = new Cliente();
            oCliente.Leer();
            listaClientes.add(oCliente);
            System.out.print("Desea continua: (S) o (N): ");
            opcion = entrada.next();
        } while (opcion.equals("S"));
    }
}
