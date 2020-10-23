package evaluaciones.sem2020.evaluacion2;


import evaluaciones.sem2020.evaluacion2.Fecha;
import evaluaciones.sem2020.evaluacion2.CuentaJoven;
import evaluaciones.sem2020.evaluacion2.CuentaEmpresa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Prueba {

    public static void main(String[] args) {
        Fecha fechaNacimiento = new Fecha(10, 12, 1989);
        double interesAnual = 7.00 + Math.random() * (15 - 7);
        double saldo = 0 + Math.random() * (100000 - 0);
        CuentaJoven cj
                = new CuentaJoven(fechaNacimiento, "Juan", interesAnual, saldo);

        double interesAnual1 = 7.00 + Math.random() * (15 - 7);
        double saldo1 = 0 + Math.random() * (100000 - 0);
        CuentaEmpresa ce = new CuentaEmpresa("10222222220", "Dolares", "Ana",
                interesAnual1, saldo1);

        System.out.println("Cuenta Joven: " + cj.mostrar());
        System.out.println("Cuenta Empresa: " + ce.mostrar());
    }
}
