package evaluaciones.parcial20192;

import java.util.LinkedList;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Coche oCoche = new Coche();
        oCoche.leer();
        Microbus oMicrobus = new Microbus();
        oMicrobus.leer();
        Furgoneta oFurgoneta = new Furgoneta();
        oFurgoneta.leer();
        Camion oCamion = new Camion();
        oCamion.leer();
        
        LinkedList<Vehiculo> lista = new LinkedList<Vehiculo>();
        lista.add(oCoche);
        lista.add(oMicrobus);
        lista.add(oFurgoneta);
        lista.add(oCamion);
        
        for (Vehiculo v : lista){
            System.out.println("================================");
            v.escribir();
            System.out.println();
            System.out.print("Dias a alquilar: "); int n = entrada.nextInt();            
            System.out.println("Precio de Alquiler: "+v.calcularPrecioAlquiler(n));
        }        
    }
    
}
