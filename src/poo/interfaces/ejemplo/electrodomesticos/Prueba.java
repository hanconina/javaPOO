package poo.interfaces.ejemplo.electrodomesticos;

public class Prueba {
    public static void main(String[] args) {
        TV tv = new TV(20,3,"Sony",1560);
        tv.hablar();
        System.out.println(tv.mostrar());
    }
    
}
