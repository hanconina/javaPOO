package poo.interfaces.ejemplo.figuras;
public class AppPruebaInterfaces {
    public static void main(String[] args){
        // Puedo utilizar una Interfaz con un Tipo
        IFigura f1 = new Circulo(2);
        IFigura f2 = new Cuadrado(4);
        // Polimorfismo
        System.out.println("Area de F1 (Circulo): "+f1.area());
        System.out.println("Area de F2 (Cuadrado): "+f2.area());        
    }
}
