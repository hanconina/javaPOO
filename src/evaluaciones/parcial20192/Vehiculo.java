package evaluaciones.parcial20192;

import java.util.Scanner;

public abstract class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private Fecha fechaCompra;
    public static int anioActual = 2019;

    public Vehiculo() {
        placa = "";
        marca = "";
        modelo = "";
        fechaCompra = new Fecha();
    }

    public Vehiculo(String placa, String marca, String modelo, Fecha fechaCompra) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Fecha getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Fecha fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
    

    public void leer() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Placa: ");
        placa = entrada.nextLine();
        System.out.print("Marca: ");
        marca = entrada.nextLine();
        System.out.print("Modelo: ");
        modelo = entrada.nextLine();
        System.out.println("Fecha compra: ");
        fechaCompra.leer();
    }

    public void escribir() {
        System.out.println("Placa: "+placa);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.print("Fehca de Compra: ");
        fechaCompra.escribir();
    }

    public abstract double calcularPrecioAlquiler(int nroDias);

}
