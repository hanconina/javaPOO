
package evaluaciones.parcial1;
// Libro de tipo electrónico

import java.util.LinkedList;

public class LibroElectronico extends Libro{
    // ATRIBUTOS PROPIOS DEL LIBRO ELECTRÓNICO
    private String formato;
    
    // MËTODOS
    // Constructor por defecto

    public LibroElectronico() {
        super();
        formato = "";
    }

    public LibroElectronico(String titulo, double precioUnitario, int nroPaginas, LinkedList<Autor> autores, String formato) {
        super(titulo, precioUnitario, nroPaginas, autores);
        this.formato = formato;
    }

    @Override
    public double calcularPrecioVenta() {
        double precioUnitario = this.recuperarPrecioUnitario();
        // Determinar el precio Adicional según formato
        double precioAdicional=0;
        if (formato=="PDF"){
            precioAdicional = recuperarNroPaginas()*0.1;
        }
        if (formato=="KINDLE"){
            precioAdicional = recuperarNroPaginas()*0.5;
        }
        double impuestoIGV = precioUnitario*0.18;
        return precioUnitario+precioAdicional+impuestoIGV;
    }
    @Override
    public void mostrarLibro(){
        super.mostrarLibro();
        System.out.println("Formato: "+formato);
    }
    
}
