package array.casofutbol;

import java.util.Scanner;

public class EquipoDeFutbol {

    private String equipo;
    private String[] jugadores;
    private double[] pesos;

    public EquipoDeFutbol(String equipo) {
        this.equipo = equipo;
        jugadores = new String[11];
        pesos = new double[11];
    }

    public void leerDatos() {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 11; i++) {
            System.out.print("Ingrese el nombre: ");
            jugadores[i] = entrada.nextLine(); // un solo nombre
            pesos[i] = 29 + Math.random() * (50 - 29);
            System.out.print("Peso asignado: " + pesos[i]);
            System.out.println();
        }

    }

    public String reportePesos() {
        int nP30a35 = 0;
        int nP36a40 = 0;
        int nPmas40 = 0;
        for (int i = 0; i < 11; i++) {
            if (pesos[i] >= 30 && pesos[i] <= 35) {
                nP30a35++;
            }
            if (pesos[i] > 35 && pesos[i] <= 40) {
                nP36a40++;
            }
            if (pesos[i] > 40) {
                nPmas40++;
            }
        }
        return "entre 30 y 35 kg inclusive: " + nP30a35 + "\n"
                + "entre 36 y 40 kg inclusive: " + nP36a40 + "\n" +
                "mayor a 40: "+nPmas40;
    }
    public void mayorMenorPeso(){
        int j = 0; // posición del jugador con mayor peso
        int k = 0; // posición de jugador con menor peso
        for (int i=1;i <11;i++){
            if (pesos[i]>pesos[j]){
                j = i;
            }
            if (pesos[i]<pesos[k]){
                k = i;
            }            
        }
        System.out.println("Jugador con mayor peso: "+jugadores[j]);
        System.out.println("Jugador con menor peso: "+jugadores[k]);
    }
    public void mostrarEquipo(){
        System.out.println("Equipo: "+equipo);
        for (int i=0;i<11;i++){
            System.out.println("Nombre jugador: "+jugadores[i]);       
            System.out.println("Peso del jugador: "+pesos[i]);       
        }
    }
}
