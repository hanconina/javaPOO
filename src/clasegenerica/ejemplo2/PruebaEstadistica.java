/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasegenerica.ejemplo2;

/**
 *
 * @author user
 */
public class PruebaEstadistica {
    public static void main(String[] args) {
        Integer numerosEnteros[] = {1, 2, 3, 4, 5};
        Estadisticas<Integer> objetosEntero
                = new Estadisticas<Integer>(numerosEnteros);
        double p = objetosEntero.promedio();
        System.out.println("Promedio de enteros: " + p);
        Double numerosDecimales[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Estadisticas<Double> objetosDecimales
                = new Estadisticas<Double>(numerosDecimales);
        double p1 = objetosDecimales.promedio();
        System.out.println("Promedio de decimales: " + p1);
        // Esto no es posible hacerlo con Cadenas
//        String cadenas[] = {"1.1", "2.2", "3.3", "4.4", "5.5"};
//        Estadisticas<String> objetosCadena
//                = new Estadisticas<String>(cadenas);
//        double p3 = objetosCadena.promedio();
//        System.out.println("Promedio de cadenas: " + p3);
        if (objetosEntero.igualPromerio(objetosDecimales)){
            System.out.println("Promedios iguales");
        }else{
            System.out.println("Promedios desiguales");
        }


    }

}
