package evaluaciones.parcial1;

// Libro de tipo impreso

import java.util.LinkedList;

public class LibroImpreso extends Libro{
    // ATRIBUTOS PROPIOS DEL LIBRO IMPRESO
    private double ancho;
    private double largo;
    private double peso;
    
    // MËTODOS DEL LIBRO DIGITAL

    // Constructor predeterminado
    public LibroImpreso() {
        super();
        this.ancho = 0;
        this.largo = 0;
        this.peso = 0;
    }
    // Constructor con parámetros

    public LibroImpreso(
            String titulo, 
            double precioUnitario, 
            int nroPaginas, 
            LinkedList<Autor> autores, 
            double ancho, 
            double largo, 
            double peso) {
        super(titulo, precioUnitario, nroPaginas, autores);
        this.ancho = ancho;
        this.largo = largo;
        this.peso = peso;
    }
    
    // Implementar el método abstracto del padre
    // Implementar el calculo del precio de venta para el libro impreso
    @Override
    public double calcularPrecioVenta() {
        double precioUnitario = recuperarPrecioUnitario();
        double precioArea = ancho*largo*0.5;
        double precioPeso = peso*5;
        double impuestoIGV = precioUnitario*0.18;
        return precioUnitario+precioArea+precioPeso+impuestoIGV;        
    }
    @Override
    public void mostrarLibro(){
        super.mostrarLibro();
        System.out.println("Ancho: "+ancho+" Largo: "+largo+" Peso: "+peso);
    }
    
}
