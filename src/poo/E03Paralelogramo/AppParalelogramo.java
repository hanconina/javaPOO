package poo.E03Paralelogramo;

/**
 *
 * @author Hernan
 */
public class AppParalelogramo {
    public static void main(String[] args){
        Paralelogramo p = new Paralelogramo();
        p.leer();
        System.out.println("Perimetro: "+p.perimetro());
        System.out.println("Área: "+p.area());
        if (p.esRectangulo()){
            System.out.println("El Paraleogramo es un rectángulo!!!");
        }
        else{
            System.out.println("El Paraleogramo no es un rectángulo!!!");
        }
            
        
    }
    
}
