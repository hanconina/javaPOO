package poo.claseabstracta.casosnegocio.club;

import java.util.List;
import java.util.LinkedList;

public class AppPrueba {

    public static void main(String[] args) {
        Persona s1 = new Socia(1, "juan", "T", 100, 10, 4);
        Persona s2 = new Socia(2, "ana", "T", 100, 11, 11);
        Persona s3 = new Socia(3, "paul", "E", 100, 12, 7);

        Persona ns1 = new NoSocia(4, "carla", "E", 200, 1);
        Persona ns2 = new NoSocia(5, "luis", "E", 200, 7);
        Persona ns3 = new NoSocia(6, "pedro", "T", 200, 6);

        LinkedList<Persona> listaPersonas = new LinkedList<Persona>();
        listaPersonas.add(s1);
        listaPersonas.add(s2);
        listaPersonas.add(s3);
        listaPersonas.add(ns1);
        listaPersonas.add(ns2);
        listaPersonas.add(ns3);
        // Calcular el monto total facturado de todos los que ingresaron
        double montoTotal = 0;
        for (Persona p : listaPersonas) {
            montoTotal = montoTotal + p.calcularPago();
        }
        System.out.println("Total Facutrado: " + montoTotal);

        for (Persona p : listaPersonas) {
            System.out.println(p.getInfo());
            System.out.println("======================");
        }

    }

}
