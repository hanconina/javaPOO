package poo.claseabstracta;
import java.util.LinkedList;
public class AppForma {
    public static void mostrarFormas(LinkedList<Forma> formas){
        for (Forma f : formas){
            f.imprimirDatos();
        }
    }
    public static void main(String[] args){
        Forma f1 = new Cuadrado("Cuadrado",5);
        Forma f2 = new Rectangulo("Rectangulo",5,3);
        Forma f3 = new Circulo("Circulo",1);
        LinkedList<Forma> formas = new LinkedList<Forma>();
        formas.add(f1);
        formas.add(f2);
        formas.add(f3);
        mostrarFormas(formas);
    }   
}
