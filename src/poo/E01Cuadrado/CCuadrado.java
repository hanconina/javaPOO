package poo.E01Cuadrado;

/**
 * Clase Cuadrado que representa una figura geométrica de cuatro lados iguales
 * @author Hernán Nina Hanco
 */
public class CCuadrado {
    //================== ATRIBUTOS O CARACTERÍSTICAS ==================
    private double aLado;
    // =============== MÉTODOS U OPERACIONES
    // Constructores
    public CCuadrado(){
        aLado = 0;
    }
    public CCuadrado(double pLado){
        aLado = pLado>=0?pLado:0;
    }
    // Modificadores 
    public void modificarLado(double pLado){
        aLado = pLado>=0?pLado:0;
    }
    // Seleectores o Accesadores
    public double obtenerLado(){
        
        return aLado;
    }
    // Otras operaciones
    public double perimetro(){
        return (4*aLado);
    }
    // -----------
    public double area()
    {
        return Math.pow(aLado, 2);
    }
}