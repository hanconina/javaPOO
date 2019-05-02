package poo.herencia.puntos;

public class AppPunto {

    public static void main(String[] args) {
        Punto p2 = new Punto(2.45, 4.56);
        System.out.println(p2);
        System.out.println("Distancia al origen: "+p2.distanciaAlOrigen());
        Punto3D p3 = new Punto3D(2.45, 4.56, 4.0);
        System.out.println(p3);
        System.out.println("Distancia al origen: "+p3.distanciaAlOrigen());
    }
}
