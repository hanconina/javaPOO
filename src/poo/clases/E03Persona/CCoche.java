/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clases.E03Persona;

import java.util.LinkedList;
import java.util.Scanner;
import poo.clases.E02Fecha.CFecha;

/**
 *
 * @author user
 */
public class CCoche {

    private String placa;
    private String modelo;
    private double precioCompra;
    private CFecha fechaCompra;
    private LinkedList<CPersona> propietarios;

    public CCoche() {
        this.placa = "";
        this.modelo = "";
        this.fechaCompra = new CFecha();
        this.precioCompra = 0.0d;
        this.propietarios = new LinkedList<CPersona>();
    }

    public CCoche(String placa, String modelo, CFecha fechaCompra, double precioCompra, LinkedList<CPersona> propietarios) {
        this.placa = placa;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.precioCompra = precioCompra;
        this.propietarios = propietarios;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CFecha getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(CFecha fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public LinkedList<CPersona> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(LinkedList<CPersona> propietarios) {
        this.propietarios = propietarios;
    }

    public void leer() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la placa:");
        this.placa = entrada.nextLine();
        System.out.println("Ingrese el modelo:");
        this.modelo = entrada.nextLine();
        System.out.println("Ingrese el precio de compra:");
        this.precioCompra = entrada.nextDouble();
        System.out.println("Ingrese la fecha de compra:");
        this.fechaCompra.leer();
        System.out.println("Ingrese el numero de propietarios del coche:");
        int n = entrada.nextInt();
        for (int i=0;i<n;i++) {
            System.out.println("Propietario :" + i);
            CPersona persona = new CPersona();
            persona.leer();
            this.propietarios.add(persona);
        }
    }

    public void escribir() {
        System.out.println("Placa: "+placa);
        System.out.println("Modelo: "+modelo);
        System.out.println("Precio de compra:"+precioCompra);
        System.out.println("Fecha de compra:");
        this.fechaCompra.escribir();
        System.out.println("Propietarios del coche:");
        int i = 0;
        for (CPersona persona : this.propietarios) {
            System.out.println("Propietario :" + i);
            persona.escribir();
        }
    }
}
